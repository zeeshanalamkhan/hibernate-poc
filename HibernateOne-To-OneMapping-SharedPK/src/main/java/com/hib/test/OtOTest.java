package com.hib.test;

import com.hib.dao.EmpDAO;
import com.hib.util.HibernateUtil;

public class OtOTest {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		dao.insertEmpData();
		HibernateUtil.closeSf();
	}
}
