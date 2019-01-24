package com.hib.test;

import com.hib.EmployeeDao.ImageDao;
import com.hib.entity.Employee;

public class ReadImageTest {
	public static void main(String[] args) throws Exception{
		Employee e=new Employee();
		ImageDao dao = new ImageDao();
		dao.ReadImage(e);
	}
}
