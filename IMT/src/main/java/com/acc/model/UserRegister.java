package com.acc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "consumer_groups")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class UserRegister  implements Serializable {
	
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "User_ID")
	private Integer userid;

	@Column(name = "First_Name")
	private String firstname;
	
	@Column(name = "Last_Name")
	private String lastname;
	
	@Column(name = "User_Name")
	private String username;
	
	@Column(name = "PassWord")
	private String password;
	
	@Column(name = "Group")
	private String group;
	
	@Column(name = "EMAIL_ID")
	private String emailid;
	
	@Column(name = "ROLE")
	private String role;
	
	@Column(name = "ISACCESS_GRANTED")
	private String isaccessgranted;
	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIsaccessgranted() {
		return isaccessgranted;
	}

	public void setIsaccessgranted(String isaccessgranted) {
		this.isaccessgranted = isaccessgranted;
	}

	public Date getCreatedt() {
		return createdt;
	}

	public void setCreatedt(Date createdt) {
		this.createdt = createdt;
	}

	@Column(name = "CREATE_DT")
	private Date createdt;
}
