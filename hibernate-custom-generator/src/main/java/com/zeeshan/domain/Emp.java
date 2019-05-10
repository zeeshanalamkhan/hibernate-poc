package com.zeeshan.domain;

import java.util.Date;

import com.zeeshan.util.DateUtil;

public class Emp {

	private String empNo;
	private String name;
	private int salary;
	private Date dob;

	public Emp() {

	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = DateUtil.stringToDate(dob);
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}

}
