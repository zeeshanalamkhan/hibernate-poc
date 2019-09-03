package com.zeeshan.entity;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer cId;
	private String cName;
	private Integer forKey;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Integer getForKey() {
		return forKey;
	}

	public void setForKey(Integer forKey) {
		this.forKey = forKey;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", forKey=" + forKey + "]";
	}

}
