package com.hib.test;

import java.io.File;
import java.io.FileInputStream;

import com.hib.EmployeeDao.ImageDao;
import com.hib.entity.Employee;

public class InsertImageTest {
	public static void main(String[] args) throws Exception{
		boolean isInserted;
		Employee e=new Employee();
		File file =new File("F:\\pic.jpg");
		byte[] brr  = new byte[(int)file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(brr);
		e.setEname("ZEESHAN KHAN");
		e.setEmpPhoto(brr);
		ImageDao dao = new ImageDao();
		isInserted = dao.insertImage(e);
		System.out.println("Record Inserted: " +isInserted);
	}
}
