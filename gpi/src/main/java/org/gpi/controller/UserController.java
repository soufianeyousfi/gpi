package org.gpi.controller;

import java.util.List;

import org.gpi.domain.Iuser;
import org.gpi.domain.User;
import org.gpi.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

;

@SuppressWarnings("serial")
public class UserController extends ActionSupport {

	private IUserService iUserService = new IUserService();
	private User user;
	private Iuser iuser;
	private List<Iuser> iusers;
	private List<Iuser> users;
	
	
	public String initAddUser() {
		
		
		
		return SUCCESS;
	}

	public String addUser() {

		iUserService.addUser(user);

		return SUCCESS;
	}

	public String deleteUser() {

		user = iUserService.deleteUser(user);
		return SUCCESS;
	}

	public String initUpdateUser() {
		user = iUserService.initUpdateUser(user);

		return SUCCESS;

	}

	public String updateUser() {
		user = iUserService.updateUser(user);
		return SUCCESS;

	}

	public String listUser() {

		users = iUserService.listUser();
		return SUCCESS;
	}

	// getters and setters

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IUserService getiUserService() {
		return iUserService;
	}

	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}


	public List<Iuser> getIusers() {
		return iusers;
	}

	public void setIusers(List<Iuser> iusers) {
		this.iusers = iusers;
	}

	public Iuser getIuser() {
		return iuser;
	}

	public void setIuser(Iuser iuser) {
		this.iuser = iuser;
	}

	public List<Iuser> getUsers() {
		return users;
	}

	public void setUsers(List<Iuser> users) {
		this.users = users;
	}

}
