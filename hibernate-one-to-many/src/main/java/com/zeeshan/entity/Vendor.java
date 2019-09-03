package com.zeeshan.entity;

import java.io.Serializable;
import java.util.Set;

public class Vendor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer vId;
	private String vName;
	private Set<Customer> customers;

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Vendor [vId=" + vId + ", vName=" + vName + "]";
	}

}
