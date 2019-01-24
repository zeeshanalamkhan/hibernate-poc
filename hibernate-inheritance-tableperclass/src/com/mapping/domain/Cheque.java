package com.mapping.domain;

public class Cheque extends Payment {

	private static final long serialVersionUID = 1L;

	private String chequeType;

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	@Override
	public String toString() {
		return "Cheque [chequeType=" + chequeType + "]";
	}

}
