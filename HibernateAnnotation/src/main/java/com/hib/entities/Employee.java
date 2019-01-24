package com.hib.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="emp500")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="EMP_NO")
	private int empNo;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="JOB")
	private String job;
	@Column(name="SALARY")
	private double salary;
	@Column(name="ADDRESS")
	private String address;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee (empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", salary=" + salary
				+ ", address=" + address + ")";
	}
	
}
