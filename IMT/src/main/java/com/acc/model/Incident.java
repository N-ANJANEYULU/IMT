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
@Table(name = "Incident_log")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Incident implements Serializable{
	
	private static long serialVersionUID = 1L;
	@Id
	@GeneratedValue

	@Column(name = "INC_ID")
	private Integer incid;
	
	public Integer getIncid() {
		return incid;
	}

	public void setIncid(Integer incid) {
		this.incid = incid;
	}

	public Integer getUserName() {
		return userName;
	}

	public void setUserName(Integer userName) {
		this.userName = userName;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
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

	@Column(name = "User_Name")
	private Integer userName;
	
	@Column(name = "User_Group")
	private String userGroup;
	
	@Column(name = "CREATE_DT")
	private Date createDt;

	@Column(name = "Update_DT")
	private Date updateDt;
}
