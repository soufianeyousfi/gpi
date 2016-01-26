package org.gpi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admindo
 *
 */
@Entity
@Table(name = "notification")
public class Notification {

	
//@OneToOne(targetEntity=Admin.class)
//@JoinColumn(name = "adminID")
//private Admin admin;
	
	@Id
	@GeneratedValue
	@Column(name = "notificationID")
	private Long notificationID;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "seen")
	private Boolean  seen;

	/**
	 * @return the notificationID
	 */
	public Long getNotificationID() {
		return notificationID;
	}

	/**
	 * @param notificationID the notificationID to set
	 */
	public void setNotificationID(Long notificationID) {
		this.notificationID = notificationID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	public Boolean getSeen() {
		return seen;
	}

	public void setSeen(Boolean seen) {
		this.seen = seen;
	}


	
	


	@Override
	public String toString() {
		return "Notification [notificationID=" + notificationID + ", name="
				+ name + ", description=" + description + ", seen=" + seen
				+ "]";
	}






	
	
}
