package com.hibernate.domain;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer customerId;
	private String customerName;
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

	@Override
	public String toString() {
		return "customerId= " + customerId + ", customerName= " + customerName + ", parentObjects= " + parentObjects;
	}

}
