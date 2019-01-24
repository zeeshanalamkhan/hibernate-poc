package com.mapping.domain;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer paymentId;
	private Double amount;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + "]";
	}

}
