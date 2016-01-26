package org.gpi.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringBufferInputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.gpi.domain.Document;
import org.gpi.domain.Entreprise;
import org.gpi.domain.Groupe;
import org.gpi.domain.Iuser;
import org.gpi.domain.Notification;
import org.gpi.domain.ProprieteMateriel;
import org.gpi.domain.Statut;
import org.gpi.domain.TypeMateriel;
import org.gpi.service.DocumentService;
import org.gpi.service.EntrepriseService;
import org.gpi.service.GroupeService;
import org.gpi.service.ProprieteService;
import org.gpi.service.NotificationService;
import org.gpi.utils.Util;
import org.json.JSONObject;
import org.gpi.utils.UserAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "serial", "deprecation" })
public class ProprieteController extends ActionSupport implements Serializable, SessionAware , UserAware{
	JSONObject status = new JSONObject();
	private ProprieteMateriel proprieteMateriel;
	private TypeMateriel typeMateriel;
	private Entreprise entreprise;
	private Notification notification;
	private Map<String, Object> session = null ;
	private ProprieteService proprieteService = new ProprieteService();
	private DocumentService documentService = new DocumentService();
	private NotificationService notificationService = new NotificationService();
	private GroupeService groupeService = new GroupeService();
	private EntrepriseService entrepriseService = new EntrepriseService();
	private List<ProprieteMateriel> proprieteMateriels;
	private List<TypeMateriel> typeMateriels;
	private List<Groupe> groupes;
	private List<Entreprise> entreprises;
	private Set<Document> documents = new HashSet<Document>();
	private List<Statut> statuts;
	private Document documentInstance;
	private FileInputStream fileInputStream;
	private String fileName;
	private List<File> files;
	private List<String> filesFileName;
	private InputStream data;
	private String q;
	private Integer i;

	public String initCreate() {
		setStatuts(proprieteService.listStatut());
		setEntreprises(entrepriseService.listEnreprise());
		setTypeMateriels(proprieteService.initCreate());
		// typeMateriels=(List<TypeMateriel>) proprieteService.initCreate();
		setGroupes(groupeService.listGroupe());
		return SUCCESS;

	}
	
	public String initEntreMater() {
		setStatuts(proprieteService.listStatut());
		setEntreprises(entrepriseService.listEnreprise());
		setTypeMateriels(proprieteService.initCreate());
		// typeMateriels=(List<TypeMateriel>) proprieteService.initCreate();
		setGroupes(groupeService.listGroupe());
		return SUCCESS;
		
	}

	public String initAjouterPropriete() {

		return SUCCESS;
	}

	public String initAjouterComputer() {

		return SUCCESS;
	}

	public String initAjouterImprimante() {

		return SUCCESS;
	}

	public String addPropriete() {
		// System.out.println(proprieteMateriel.getGroupe().getGroupID());
		JSONObject status = new JSONObject();
		try {

			proprieteService.addPropriete(proprieteMateriel);
			if (files != null) {
				int i = 0;
				for (File file : files) {
					File fileToCreate = new File(Util.destinationFilePath
							+ File.separator + proprieteMateriel.getMaterID(),
							filesFileName.get(i));
					FileUtils.copyFile(file, fileToCreate);
					documentInstance = new Document();
					documentInstance.setName(filesFileName.get(i));
					documentInstance.setUrl(fileToCreate.getAbsolutePath());
					documents.add(documentInstance);
					i++;
				}

				documents = documentService.addDocuments(documents);
				proprieteMateriel.setDocuments(documents);
				proprieteService.updateMateriel(proprieteMateriel);
				status.put("status", "success");
			} else {
				status.put("status", "impossible");
			}
		} catch (Exception e) {
			// TODO: handle exception

			return INPUT;
		}
		setData(new StringBufferInputStream(status.toString()));
if (proprieteMateriel.getTypeMateriel().getTypeMaterielID().equals(1)){
	System.out.println(proprieteMateriel.getTypeMateriel());
	return "success1";
}	
		return SUCCESS;

	}

	public String initUpdate() {
		proprieteMateriel = proprieteService.initUpdate(proprieteMateriel);
		setGroupes(groupeService.listGroupe());
		return SUCCESS;
	}

	public String updateMateriel() {

		proprieteMateriel = proprieteService.updateMateriel(proprieteMateriel);
		return SUCCESS;

	}

	public String updateComputer() {

		proprieteMateriel = proprieteService.updateMateriel(proprieteMateriel);

		return SUCCESS;

	}

	public String updateImprimante() {

		proprieteMateriel = proprieteService.updateMateriel(proprieteMateriel);

		return SUCCESS;

	}

	public String deleteMateriel() {
		Iuser iuser = (Iuser) session.get(LOGIN);
		proprieteService.deleteMateriel(iuser, proprieteMateriel);
		return SUCCESS;
	}
	public String confirmDeleteMateriel() {
		
		proprieteService.confirmDeleteMateriel(proprieteMateriel);
		return SUCCESS;
	}

	public String deleteComputer() {
		Iuser iuser = (Iuser) session.get(LOGIN);
		notification = new Notification();

		notification.setDescription("le "+proprieteMateriel.getNom()+" a �t� supprim�");
		
		notificationService.addNotification(notification);
		proprieteService.deleteMateriel(iuser, proprieteMateriel);
		return listComputer();
	}

	public String deleteImprimante() {
		Iuser iuser = (Iuser) session.get("login");
notification = new Notification();
proprieteService.getProprieteMateriel(proprieteMateriel);
		notification.setDescription("Materiel Avec l'ID : ("+proprieteMateriel.getMaterID()+") a �t� supprim�");
		
		notificationService.addNotification(notification);
		proprieteService.deleteMateriel(iuser, proprieteMateriel);
		
		return listImprimante();
	}

	public String listMateriel() {

		proprieteMateriels = proprieteService.listMateriel();
		// System.out.println(proprieteMateriels.get(0).getTypeMateriel().getTypeMaterielID());

		return SUCCESS;
	}
	public String listMaterielEntreprise() {
		
		proprieteMateriels = entrepriseService.listMaterielEntreprise(entreprise);
//		proprieteMateriels = proprieteService.listMaterielEntreprise(i);
		System.out.println("l id de l enteprise est : "+entreprise.getEntrepriseID());
		return SUCCESS;
	}

	public String listImprimante() {

		proprieteMateriels = proprieteService.listImprimante();

		return SUCCESS;
	}

	public String listComputer() {

		proprieteMateriels = proprieteService.listComputer();
		return SUCCESS;

	}
	public String listArchive() {
		
		proprieteMateriels = proprieteService.listArchive();
		return SUCCESS;
		
	}

	public String download() throws Exception {
		try {
			setFileInputStream(new FileInputStream(new File(
					documentInstance.getUrl())));
			setFileName(documentInstance.getName());
		} catch (FileNotFoundException ex) {
			return ERROR;
		}
		return SUCCESS;
	}

	public String searchMateriel() {

		proprieteMateriels = proprieteService.search(q);

		return SUCCESS;
	}
	public String EntrepriseMateriel() {
		
		proprieteMateriels = proprieteService.search(q);
		
		return SUCCESS;
	}

	// Getters and Setters

	public ProprieteMateriel getProprieteMateriel() {
		return proprieteMateriel;
	}

	public void setProprieteMateriel(ProprieteMateriel proprieteMateriel) {
		this.proprieteMateriel = proprieteMateriel;
	}

	public ProprieteService getProprieteService() {
		return proprieteService;
	}

	public void setProprieteService(ProprieteService proprieteService) {
		this.proprieteService = proprieteService;
	}

	public List<ProprieteMateriel> getProprieteMateriels() {
		return proprieteMateriels;
	}

	public void setProprieteMateriels(List<ProprieteMateriel> proprieteMateriels) {
		this.proprieteMateriels = proprieteMateriels;
	}

	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}

	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}

	public List<TypeMateriel> getTypeMateriels() {
		return typeMateriels;
	}

	public void setTypeMateriels(List<TypeMateriel> typeMateriels) {
		this.typeMateriels = typeMateriels;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public GroupeService getGroupeService() {
		return groupeService;
	}

	public void setGroupeService(GroupeService groupeService) {
		this.groupeService = groupeService;
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

	public List<Statut> getStatuts() {
		return statuts;
	}

	public void setStatuts(List<Statut> statuts) {
		this.statuts = statuts;
	}

	public EntrepriseService getEntrepriseService() {
		return entrepriseService;
	}

	public void setEntrepriseService(EntrepriseService entrepriseService) {
		this.entrepriseService = entrepriseService;
	}

	public Document getDocumentInstance() {
		return documentInstance;
	}

	public void setDocumentInstance(Document documentInstance) {
		this.documentInstance = documentInstance;
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	public DocumentService getDocumentService() {
		return documentService;
	}

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public List<String> getFilesFileName() {
		return filesFileName;
	}

	public void setFilesFileName(List<String> filesFileName) {
		this.filesFileName = filesFileName;
	}

	public InputStream getData() {
		return data;
	}

	public void setData(InputStream data) {
		this.data = data;
	}

	public JSONObject getStatus() {
		return status;
	}

	public void setStatus(JSONObject status) {
		this.status = status;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public void setUser(Iuser user) {		
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}



}
