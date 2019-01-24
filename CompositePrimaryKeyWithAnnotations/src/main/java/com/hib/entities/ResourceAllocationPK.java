package com.hib.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ResourceAllocationPK implements Serializable {
	@Column(name="RESOURCE_ID")
	private Integer resourceId;
	
	@Column(name="PROJECT_ID")
	private Integer projectId;
}
