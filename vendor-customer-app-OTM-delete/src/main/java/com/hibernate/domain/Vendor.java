package com.hibernate.domain;

import java.io.Serializable;
import java.util.Set;

public class Vendor implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer vendorId;
	private String VendorName;
	private Set<Customer> children;

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public Set<Customer> getChildren() {
		return children;
	}

	public void setChildren(Set<Customer> children) {
		this.children = children;
	}

}
