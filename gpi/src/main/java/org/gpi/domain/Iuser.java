package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




@Entity
@Table(name="iuser")
@Inheritance(strategy=InheritanceType.JOINED)
public class Iuser {
	
	public static String User="User";
	public static String ADMIN="Admin";
	
	
	@Id
	@GeneratedValue
	@Column(name = "iuserID")
	private Long iuserID;
	@Column(name = "nom")
	private String nom;
	@Column(name = "email")
	private String email;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;
	@Column(name = "tel")
	private String tel;
	@Column(name = "lieu")
	private String lieu;
	@Column(name = "type")
	private String type;
	
	
//	getters and setters
	public Long getIuserID() {
		return iuserID;
	}
	public void setIuserID(Long iuserID) {
		this.iuserID = iuserID;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Iuser [iuserID=" + iuserID + ", nom=" + nom + ", email="
				+ email + ", login=" + login + ", password=" + password
				+ ", tel=" + tel + ", lieu=" + lieu + ", type=" + type + "]";
	}

	

	
}
