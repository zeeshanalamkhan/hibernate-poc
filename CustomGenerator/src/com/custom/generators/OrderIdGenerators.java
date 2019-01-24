package com.custom.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerators implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object arg1) throws HibernateException {
		
		String prefix = "OD";
		int suffix = 1;
		try{
			Connection con = session.connection();
			String sql = "SELECT ORDER_ID_SEQ.NEXTVAL FROM DUAL";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				suffix = rs.getInt(1);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return prefix.concat(String.valueOf(suffix));
	}
	
}
