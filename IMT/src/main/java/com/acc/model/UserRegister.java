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
@Table(name = "USER_INC")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class UserRegister implements Serializable {
	
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "User_ID")
	private Integer userid;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "PassWord")
	private String password;

	@Column(name = "User_Group")
	private String userGroup;

	@Column(name = "EMAIL_ID")
	private String emailid;

	@Column(name = "ROLE")
	private String role;

	@Column(name = "ISACCESS_GRANTED")
	private String isAccessGranted;

	@Column(name = "CREATE_DT")
	private Date createDt;

	@Column(name = "Update_DT")
	private Date updateDt;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
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

	

	public String getIsAccessGranted() {
		return isAccessGranted;
	}

	public void setIsAccessGranted(String isAccessGranted) {
		this.isAccessGranted = isAccessGranted;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	
}
