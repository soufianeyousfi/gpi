package org.gpi.controller;

import java.util.List;

import org.gpi.domain.Entreprise;
import org.gpi.domain.Groupe;
import org.gpi.service.EntrepriseService;
import org.gpi.service.GroupeService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class GroupeController extends ActionSupport {
	private GroupeService groupeService = new GroupeService();
	private EntrepriseService entrepriseService = new EntrepriseService();
	private Groupe groupe ;
	private Entreprise entreprise;
	private List<Groupe> groupes;
	private List<Entreprise> entreprises;

	public String listGroup() {
		setEntreprises(entrepriseService.listEnreprise());
		groupes = groupeService.listGroupe();
		
		return SUCCESS;

	}


	
	public String addGroupe() {
	
	groupeService.addGroupe(groupe);

		return SUCCESS;
	}


	// Getters and setters

	public GroupeService getGroupeService() {
		return groupeService;
	}

	public void setGroupeService(GroupeService groupeService) {
		this.groupeService = groupeService;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}



	public EntrepriseService getEntrepriseService() {
		return entrepriseService;
	}



	public void setEntrepriseService(EntrepriseService entrepriseService) {
		this.entrepriseService = entrepriseService;
	}

	
	
}
