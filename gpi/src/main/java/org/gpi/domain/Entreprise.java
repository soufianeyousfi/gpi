package org.gpi.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entreprise")
public class Entreprise {


	 @ManyToMany(targetEntity=Groupe.class)  
   @JoinTable(name="groupe_entreprise", joinColumns=@JoinColumn(name="entrepriseID"), inverseJoinColumns=@JoinColumn(name="groupID"))  
   private Set<Groupe> groupes; 
	
	 @OneToMany(targetEntity = Materiel.class)
	 @JoinColumn(name = "materID")
	private  Set<Materiel> materiels = new HashSet<Materiel>();

	
	@Id
	@GeneratedValue
	@Column(name = "entrepriseID")
	private Integer entrepriseID;
	@Column(name = "nom")
	private String nom;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "fax")
	private String fax;
	@Column(name = "raisonSociale")
	private String raisonSociale;
	@Column(name = "courriel")
	private String courriel;

	// Getters And Setters

	public String getNom() {
		return nom;
	}

	public Integer getEntrepriseID() {
		return entrepriseID;
	}

	public void setEntrepriseID(Integer entrepriseID) {
		this.entrepriseID = entrepriseID;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public Set<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Set<Materiel> getMateriels() {
		return materiels;
	}

	public void setMateriels(Set<Materiel> materiels) {
		this.materiels = materiels;
	}

	
	

}
