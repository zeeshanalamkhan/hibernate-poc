package com.ihm.tph.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class CurrentAccount extends Account {
	
@Column(name="TXN_LIMIT")
	private Double txlimit;

	public Double getTxlimit() {
		return txlimit;
	}

	public void setTxlimit(Double txlimit) {
		this.txlimit = txlimit;
	}

}
