package org.gpi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="garantie")
public class Garantie {
	@Id
	@GeneratedValue
	@Column(name="garantieID")
	private Integer garantieID;
	@Column(name="fournisseur")
	private String  fournisseur;
	@Column(name="dateAchat")
	private Date  DateAchat;
	@Column(name="finGarantie")
	private Date  finGarantie;
	
	
	
//	getters and setters
	public Integer getGarantieID() {
		return garantieID;
	}
	public void setGarantieID(Integer garantieID) {
		this.garantieID = garantieID;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Date getDateAchat() {
		return DateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		DateAchat = dateAchat;
	}
	public Date getFinGarantie() {
		return finGarantie;
	}
	public void setFinGarantie(Date finGarantie) {
		this.finGarantie = finGarantie;
	}
	
	

	
}
