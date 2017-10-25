package com.acc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the user_inc database table.
 * 
 */
@Entity
@Table(name="user_inc")
@NamedQuery(name="UserInc.findAll", query="SELECT u FROM UserInc u")
public class UserInc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DT")
	private Date createDt;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="ISACCESS_GRANTED")
	private String isaccessGranted;

	@Column(name="LAST_NAME")
	private String lastName;

	private String password;

	private String role;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DT")
	private Date updateDt;

	@Column(name="USER_GROUP")
	private String userGroup;

	@Column(name="USER_NAME")
	private String userName;

	//bi-directional many-to-one association to IncidentLog
	@OneToMany(mappedBy="userInc", fetch = FetchType.EAGER)
	private List<IncidentLog> incidentLogs;

	public UserInc() {
	}

	

	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getIsaccessGranted() {
		return this.isaccessGranted;
	}

	public void setIsaccessGranted(String isaccessGranted) {
		this.isaccessGranted = isaccessGranted;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getUpdateDt() {
		return this.updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	public String getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<IncidentLog> getIncidentLogs() {
		return this.incidentLogs;
	}

	public void setIncidentLogs(List<IncidentLog> incidentLogs) {
		this.incidentLogs = incidentLogs;
	}

	public IncidentLog addIncidentLog(IncidentLog incidentLog) {
		getIncidentLogs().add(incidentLog);
		incidentLog.setUserInc(this);

		return incidentLog;
	}

	public IncidentLog removeIncidentLog(IncidentLog incidentLog) {
		getIncidentLogs().remove(incidentLog);
		incidentLog.setUserInc(null);

		return incidentLog;
	}

}