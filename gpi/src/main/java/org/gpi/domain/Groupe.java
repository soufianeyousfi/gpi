package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe {
//	@ManyToMany(targetEntity=Entreprise.class)
//	@Cascade({ CascadeType.ALL })
//	@JoinColumn(name = "entrepriseID")
	
	
	
	@Id
	@GeneratedValue
	@Column(name = "groupID")
	private Integer groupID;
	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;

	// Getters and setters
	public Integer getGroupID() {
		return groupID;
	}

	public void setGroupID(Integer groupID) {
		this.groupID = groupID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}







}
