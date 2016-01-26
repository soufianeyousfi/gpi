package org.gpi.controller;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.gpi.domain.Iuser;
import org.gpi.service.IUserService;

public class AuthentificationController implements SessionAware {
	private Iuser userInstance;
	private IUserService iUserService = new IUserService();
	private Map<String, Object> session = null;

	public String login() {
		try {
			Iuser iuser = iUserService.authentificationUser(userInstance);
			if (session != null) {
				session.put("login", iuser);
				Iuser u = (Iuser) session.get("login");
				System.out.println("Login-- : " + u.getLogin());
				System.out.println("Type-- : " + u.getType());
			
			}

		} catch (Exception e) {

			System.err.println(e.getStackTrace());
			return "error";
		}

		return "success";

	}

	
	public String logout(){
		try {
			if (session != null) {
				session.clear();
			}

		} catch (Exception e) {

			System.err.println(e.getStackTrace());
			return "error";
		}
		
		
		
		return "success" ;
	}
	
	public String index() {
		return "success";
	}

	// Getters and setters

	public Iuser getUserInstance() {
		return userInstance;
	}

	public IUserService getiUserService() {
		return iUserService;
	}

	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	public void setUserInstance(Iuser userInstance) {
		this.userInstance = userInstance;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
