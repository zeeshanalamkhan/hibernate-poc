package com.zeeshan.cfgs;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EmpGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String empNo = "Emp";
		try {
			Connection con = session.connection();
			String query = "SELECT EMP_SEQ.NEXTVAL FROM DUAL";
			PreparedStatement pStmt = con.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			if (rs.next()) {
				empNo = empNo + rs.getString(1);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return empNo;
	}

}
