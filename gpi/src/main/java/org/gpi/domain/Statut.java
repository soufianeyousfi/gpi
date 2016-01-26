package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statut")
public class Statut {
	
	
	@Id
	@GeneratedValue
	@Column(name = "statutID")
	private Integer statutID;
	
	public String type;

	

	public Integer getStatutID() {
		return statutID;
	}

	public void setStatutID(Integer statutID) {
		this.statutID = statutID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



}
