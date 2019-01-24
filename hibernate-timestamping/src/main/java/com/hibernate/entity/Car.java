package com.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "CAR_DETAILS")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CAR_ID")
	private Integer carId;

	@Column(name = "CAR_COLOR")
	private String carColor;

	@Column(name = "CAR_NAME")
	private String carName;

	@Temporal(TemporalType.DATE)
	@Column(name = "MFG_DATE")
	private Date mfgDate;

	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	@Column(name = "CEATE_DT")
	private Date createDt;

	@Temporal(TemporalType.DATE)
	@UpdateTimestamp
	@Column(name = "UPDATE_DT")
	private Date updateDt;

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carColor=" + carColor + ", carName=" + carName + ", mfgDate=" + mfgDate
				+ ", createDt=" + createDt + ", updateDt=" + updateDt + "]";
	}

}
