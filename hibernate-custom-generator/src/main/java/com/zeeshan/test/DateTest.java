package com.zeeshan.test;

import java.util.Date;

import com.zeeshan.util.DateUtil;

public class DateTest {

	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(String date) {
		dob = DateUtil.stringToDate(date);
	}

	@Override
	public String toString() {
		return "DateTest [dob=" + dob + "]";
	}

	public static void main(String[] args) {
		DateTest dt = new DateTest();
		String strDate = "12-07-1990";
		dt.setDob(strDate);
		System.out.println(dt.getDob());

	}
}
