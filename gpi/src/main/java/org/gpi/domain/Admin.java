package org.gpi.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="admin")
@PrimaryKeyJoinColumn(name="adminID")
public class Admin extends Iuser {


	



	
	
}
