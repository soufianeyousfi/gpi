package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type")
public class TypeMateriel {
//	@OneToMany(fetch = FetchType.LAZY)
//   @JoinColumn(name="materID")
//	private List<Materiel> materiels = new ArrayList<Materiel>() ;
	@Id
	@GeneratedValue
	@Column(name = "typeID")
	private Integer typeMaterielID;
	

@Column(name="type")
private String type;

	
	
	// Getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTypeMaterielID() {
		return typeMaterielID;
	}

	public void setTypeMaterielID(Integer typeMaterielID) {
		this.typeMaterielID = typeMaterielID;
	}




}
