package com.hibernate.domain;

import java.io.Serializable;

public class Vendor implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer vendorId;
	private String vendorName;

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

}
