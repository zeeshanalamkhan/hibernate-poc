package com.hibernate.domain;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer customerId;
	private String customerName;
	private Integer forVenId;
	private Vendor parentObjects;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Vendor getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Vendor parentObjects) {
		this.parentObjects = parentObjects;
	}

	public Integer getForVenId() {
		return forVenId;
	}

	public void setForVenId(Integer forVenId) {
		this.forVenId = forVenId;
	}

}
