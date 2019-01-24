package com.mapping.domain;

public class CreditCard extends Payment {

	private static final long serialVersionUID = 1L;

	private String creditCardType;

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardType=" + creditCardType + "]";
	}

}
