package org.gpi.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="user")
@PrimaryKeyJoinColumn(name="userID")
public class User extends Iuser {

}
