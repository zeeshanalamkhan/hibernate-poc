package com.hib.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESOURCE_ALLOCATION")
public class ResourceAllocation {
	@Column(name="ALLOC_START_DT")
	private Date allocStartDt;
	
	@Column(name="ALLOC_END_DT")
	private Date allocEndDt;
	
	@Column(name="ALLOC_PERCENTAGE")
	private Double allocPercentage;
	
	@Id
	@Embedded
	private ResourceAllocationPK pks;

	
	public Date getAllocStartDt() {
		return allocStartDt;
	}
	public void setAllocStartDt(Date allocStartDt) {
		this.allocStartDt = allocStartDt;
	}

	public Date getAllocEndDt() {
		return allocEndDt;
	}

	public void setAllocEndDt(Date allocEndDt) {
		this.allocEndDt = allocEndDt;
	}

	public Double getAllocPercentage() {
		return allocPercentage;
	}

	public void setAllocPercentage(Double allocPercentage) {
		this.allocPercentage = allocPercentage;
	}

	public ResourceAllocationPK getPks() {
		return pks;
	}

	public void setPks(ResourceAllocationPK pks) {
		this.pks = pks;
	}
	
	
}
