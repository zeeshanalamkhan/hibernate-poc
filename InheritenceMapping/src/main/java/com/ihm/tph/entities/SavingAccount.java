package com.ihm.tph.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class SavingAccount extends Account {
	
@Column(name="MIN_BAL")
	private Double minbal;

	

	public Double getMinbal() {
	return minbal;
}
	public void setMinbal(Double minbal) {
	this.minbal = minbal;
}

}
