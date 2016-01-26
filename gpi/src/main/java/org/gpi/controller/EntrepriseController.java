package org.gpi.controller;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gpi.domain.Entreprise;
import org.gpi.domain.Groupe;
import org.gpi.service.EntrepriseService;
import org.gpi.service.GroupeService;

import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class EntrepriseController extends ActionSupport{
private EntrepriseService entrepriseService = new EntrepriseService();
private GroupeService groupeService = new GroupeService();
private Entreprise entreprise ;
private List<Entreprise> entreprises;
private List<Groupe> groupes;
private Integer tab[];

public String initAddEntreprise() {

//	setGroupes(groupeService.listGroupe());
	setGroupes(groupeService.listGroupe());
//	System.out.println(entreprises.size());
//	System.out.println(entreprises.get(0).getNom());		
//	System.out.println(groupes.get(0).getNom());		
//	System.out.println("grouep id = "+groupes.get(0).getGroupID());
	
	return SUCCESS;
}
public String addEntreprise(){
	Set<Groupe> groupes = new HashSet<Groupe>();
	for (int i = 0 ; i < tab.length ; i++ ) {
		Groupe groupe = new Groupe();
		groupe.setGroupID(tab[i]);
		groupes.add(groupe);
	}
	entreprise.setGroupes(groupes);
	entrepriseService.addEntreprise(entreprise);
	return "success";
}





public String deleteEntreprise(){
	
	entreprise = entrepriseService.deleteEntreprise(entreprise);
	return SUCCESS;
	
}


public String listEntreprise(){

	entreprises =  entrepriseService.listEnreprise();
	return SUCCESS;
	
	
}

public String initUpdate(){
	
	entreprise =  entrepriseService.initUpdate(entreprise);
	return SUCCESS;
}


public String updateEntreprise(){
	
	entrepriseService.updateEntreprise(entreprise);
	
	return SUCCESS;
}





//Getters and Setters 
public Entreprise getEntreprise() {
	return entreprise;
}

public void setEntreprise(Entreprise entreprise) {
	this.entreprise = entreprise;
}

public List<Entreprise> getEntreprises() {
	return entreprises;
}

public void setEntreprises(List<Entreprise> entreprises) {
	this.entreprises = entreprises;
}


public EntrepriseService getEntrepriseService() {
	return entrepriseService;
}


public void setEntrepriseService(EntrepriseService entrepriseService) {
	this.entrepriseService = entrepriseService;
}


public List<Groupe> getGroupes() {
	return groupes;
}


public void setGroupes(List<Groupe> groupes) {
	this.groupes = groupes;
}
public Integer[] getTab() {
	return tab;
}
public void setTab(Integer[] tab) {
	this.tab = tab;
}
	
	


}
