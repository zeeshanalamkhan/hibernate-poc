package com.zeeshan.test;

import com.zeeshan.dao.StudentDao;
import com.zeeshan.entities.Student;

public class StudentDaoTest {
	public static void main(String[] args){
		Student std = new Student();
		std.setsId(103);
		std.setsName("ZUBER");
		std.setSubject("ORACLE");
		std.setsAddress("MEERUT");
		std.setEmail("zuberii@gmail.com");
		std.setMobNo("9874563250.");
		StudentDao dao = new StudentDao();
		boolean isInserted = dao.insert(std);
		System.out.println("Record Inserted Successfully!: "+isInserted);
	}
}
