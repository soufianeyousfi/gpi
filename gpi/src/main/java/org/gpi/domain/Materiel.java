package org.gpi.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.gpi.domain.Document;

@Entity
@Table(name = "materiel")
@Inheritance(strategy = InheritanceType.JOINED)
public class Materiel {
	// @ManyToOne(fetch = FetchType.LAZY)
	@ManyToOne(targetEntity = TypeMateriel.class)
	@JoinColumn(name = "typeMaterielID")
	private TypeMateriel typeMateriel;
	@ManyToOne(targetEntity = Groupe.class)
	// @Cascade({ CascadeType.ALL })
	@JoinColumn(name = "groupID")
	private Groupe groupe;
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "userID")
	private User user;
	 @ManyToOne(targetEntity = Entreprise.class)
	 @JoinColumn(name = "entrepriseID")
	 private Entreprise Entreprise;

	// private Admin admin;
	// @OneToOne(fetch=FetchType.EAGER)
	// @JoinColumn(name="garantieID",unique=true)
	// private Garantie garantie;

	@ManyToOne(targetEntity = Statut.class)
	@JoinColumn(name = "statutID")
	private Statut statut;
	@OneToMany(targetEntity=Document.class,fetch = FetchType.EAGER)
    @Cascade({CascadeType.DELETE_ORPHAN})
	private Set<Document> documents;
	
	

	@Id
	@GeneratedValue
	@Column(name = "materID")
	private Integer materID;
	@Column(name = "dateAchat")
	private Date dateAchat;
	@Column(name = "finGarantie")
	private Date finGarantie;
	@Column(name = "nom")
	private String nom;

	@Column(name = "numeroSerie")
	private String numeroSerie;
	@Column(name = "model")
	private String model;
	@Column(name = "fabricant")
	private String fabricant;
	@Column(name = "descritpion")
	private String descritpion;
	@Column(name = "docAttacher")
	private String docAttacher;
	@Column(name = "archive")
	private Boolean archive;

	// Getters and setters

	public String getNom() {
		return nom;
	}

	public Integer getMaterID() {
		return materID;
	}

	public void setMaterID(Integer materieID) {
		this.materID = materieID;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFabricant() {
		return fabricant;
	}

	public void setFabricant(String fabricant) {
		this.fabricant = fabricant;
	}

	public String getDescritpion() {
		return descritpion;
	}

	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}

	public String getDocAttacher() {
		return docAttacher;
	}

	public void setDocAttacher(String docAttacher) {
		this.docAttacher = docAttacher;
	}

	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}

	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// public Admin getAdmin() {
	// return admin;
	// }
	//
	// public void setAdmin(Admin admin) {
	// this.admin = admin;
	// }

	// public Garantie getGarantie() {
	// return garantie;
	// }
	//
	// public void setGarantie(Garantie garantie) {
	// this.garantie = garantie;
	// }

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Date getFinGarantie() {
		return finGarantie;
	}

	public void setFinGarantie(Date finGarantie) {
		this.finGarantie = finGarantie;
	}

	public Boolean getArchive() {
		return archive;
	}

	public void setArchive(Boolean archive) {
		this.archive = archive;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Entreprise getEntreprise() {
		return Entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		Entreprise = entreprise;
	}
	

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Materiel [typeMateriel=" + typeMateriel + ", groupe=" + groupe
				+ ", user=" + user + ", Entreprise=" + Entreprise + ", statut="
				+ statut + ", documents=" + documents + ", materID=" + materID
				+ ", dateAchat=" + dateAchat + ", finGarantie=" + finGarantie
				+ ", nom=" + nom + ", numeroSerie=" + numeroSerie + ", model="
				+ model + ", fabricant=" + fabricant + ", descritpion="
				+ descritpion + ", docAttacher=" + docAttacher + ", archive="
				+ archive + "]";
	}

}
