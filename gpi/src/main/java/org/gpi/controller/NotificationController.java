package org.gpi.controller;

import java.io.InputStream;
import java.util.List;

import org.gpi.domain.Iuser;
import org.gpi.domain.Materiel;
import org.gpi.domain.Notification;
import org.gpi.service.IUserService;
import org.gpi.service.NotificationService;
import org.gpi.service.ProprieteService;
import org.gpi.utils.UserAware;

import com.opensymphony.xwork2.ActionSupport;



public class NotificationController extends ActionSupport implements UserAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService iUserService=new IUserService();
//	private ExpertTechniqueAssignmentService expertTechniqueAssignmentService=new ExpertTechniqueAssignmentService();
	
	private Materiel materielInstance;
	private ProprieteService proprieteService=new ProprieteService();
	private Notification notificationInstance;
	private NotificationService notificationService=new NotificationService();
	private List<Notification> notifications ;
	private InputStream data;
//	private InputStream data;
	
//	private String q ;
	

	
	public String listNotification(){
		
		
		setNotifications(notificationService.listNotification());
		
		
		return SUCCESS;
	}
	
	public String updateNotificationStatut(){
		
		
		
		
			notificationService.updateNotificationStatut(notificationInstance);
		
	    return SUCCESS;
	}
	
	
	
	
//	
//	public String createAdminNotif() {
////		JSONObject status = new JSONObject();
//		
//			notification=new Notification();
//			materielInstance=proprieteService.getProprieteMateriel((ProprieteMateriel) admin.getMateriel());
//			notification.setName(getText("Supression Materiel")+":"+materielInstance.getNom());
//			notification.setDescription(materielInstance.getDescritpion());
//			notification.setSeen(false);
//			notification=notificationService.addNotification(notification);
//			admin.setNotification(notification);
////			if(Util.SUCCESS.equals(BussinessAnalystAssignmentService.addAssignment(bussinessAnalystAssignment))){
////				status.put("status", Util.SUCCESS);
////				status.put("materielID", admin.getMateriel().getMaterID());
////			}
//		
////		data = new StringBufferInputStream(status.toString());
//		return SUCCESS;
//	}
//	
	

//	public String deleteAssignment() {
//		if (bussinessAnalystAssignment!=null) {
//			return deleteBussinessAnalystAssignment();
//		}
//		else{
//			return deleteExpertTechniqueAssignment();
//		}
//	}
	
	
	
	
	/*-----------------------------/
	 * GETTERS & SETTERS
	 * 
	 */
	
	



	
	public IUserService getiUserService() {
		return iUserService;
	}

	public Notification getNotificationInstance() {
		return notificationInstance;
	}

	public void setNotificationInstance(Notification notificationInstance) {
		this.notificationInstance = notificationInstance;
	}

	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}


	public Materiel getMaterielInstance() {
		return materielInstance;
	}

	public void setMaterielInstance(Materiel materielInstance) {
		this.materielInstance = materielInstance;
	}

	public ProprieteService getProprieteService() {
		return proprieteService;
	}

	public void setProprieteService(ProprieteService proprieteService) {
		this.proprieteService = proprieteService;
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}



	public void setUser(Iuser user) {
		// TODO Auto-generated method stub
	}


	public List<Notification> getNotifications() {
		return notifications;
	}


	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public InputStream getData() {
		return data;
	}

	public void setData(InputStream data) {
		this.data = data;
	}

	


}