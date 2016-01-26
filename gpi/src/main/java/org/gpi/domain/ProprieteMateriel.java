package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="propriete")
@PrimaryKeyJoinColumn(name = "proprieteID", referencedColumnName = "materID")
public class ProprieteMateriel extends Materiel {


	@Column(name = "os")
	private String os;
	@Column(name = "cpu")
	private String cpu;
	@Column(name = "ram")
	private String ram;
	@Column(name = "utilisateur")
	private String utilisateur;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;
	@Column(name = "adresseIp")
	private String adresseIp;
	@Column(name = "hdd")
	private String hdd;
	@Column(name = "typeImprimante")
	private String typeImprimante;
	@Column(name = "cartouche")
	private String cartouche;
	@Column(name = "media")
	private String media;
	@Column(name = "ppm")
	private String ppm;
	@Column(name = "pilote")
	private String pilote;

	
	// Getters and setters

	

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAdresseIp() {
		return adresseIp;
	}

	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTypeImprimante() {
		return typeImprimante;
	}

	public void setTypeImprimante(String typeImprimante) {
		this.typeImprimante = typeImprimante;
	}

	public String getCartouche() {
		return cartouche;
	}

	public void setCartouche(String cartouche) {
		this.cartouche = cartouche;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getPpm() {
		return ppm;
	}

	public void setPpm(String ppm) {
		this.ppm = ppm;
	}

	public String getPilote() {
		return pilote;
	}

	public void setPilote(String pilote) {
		this.pilote = pilote;
	}


}
