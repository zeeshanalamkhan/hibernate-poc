package com.hib.test;

import com.hib.dao.Hosteldao;
import com.hib.entity.Hostel;

public class HostelTest {
	public static void main(String[] args) {
		boolean isInserted;
		Hostel hstl  =new Hostel();
		hstl.setHostelId(1001);
		hstl.setHostelName("VM Hall");
		hstl.setHostelAddress("ALigarh");
		hstl.setStudentCapacity(150);
		Hosteldao dao = new Hosteldao();
		 isInserted = dao.insert(hstl);
		System.out.println("is Record Inserted Successfully!?: "+isInserted);
	}
}
