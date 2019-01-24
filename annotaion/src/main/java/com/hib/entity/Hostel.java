package com.hib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="Hostel_Data")
public class Hostel {
	@Id
	@GeneratedValue
	@Column(name="Hostel_Id")
	private int hostelId;
	
	@Column(name="Hostel_Name")
	private String hostelName;
	
	@Column(name="Hostel_Address")
	private String hostelAddress;
	
	@Column(name="Student_Capacity")
	private int studentCapacity;
	
	public int getHostelId() {
		return hostelId;
	}
	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	
	public String getHostelAddress() {
		return hostelAddress;
	}
	public void setHostelAddress(String hostelAddress) {
		this.hostelAddress = hostelAddress;
	}
	
	public int getStudentCapacity() {
		return studentCapacity;
	}
	
	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	@Override
	public String toString() {
		return "Hostel [hostelId=" + hostelId + ", hostelName=" + hostelName + ", hostelAddress=" + hostelAddress
				+ ", studentCapacity=" + studentCapacity + "]";
	}
	
	
}
