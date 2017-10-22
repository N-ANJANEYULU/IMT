package com.acc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the inc_hist_log database table.
 * 
 */
@Entity
@Table(name="inc_hist_log")
@NamedQuery(name="IncHistLog.findAll", query="SELECT i FROM IncHistLog i")
public class IncHistLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INC_HIST_ID")
	private Integer incHistId;

	private String application;

	@Column(name="ASSIGNED_GROUP")
	private String assignedGroup;

	@Column(name="ASSIGNED_TO")
	private String assignedTo;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DT")
	private Date createDt;

	private String description;

	private String environment;

	@Column(name="HC_ID")
	private int hcId;

	@Column(name="REQUESTED_GROUP")
	private String requestedGroup;

	@Column(name="REQUESTED_USER")
	private String requestedUser;

	private String severiety;

	private String status;

	private String summary;

	//bi-directional many-to-one association to IncidentLog
	@ManyToOne
	@JoinColumn(name="INC_ID")
	private IncidentLog incidentLog;

	public IncHistLog() {
	}

	
	public  Integer getIncHistId() {
		return incHistId;
	}



	public void setIncHistId(Integer incHistId) {
		this.incHistId = incHistId;
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getAssignedGroup() {
		return this.assignedGroup;
	}

	public void setAssignedGroup(String assignedGroup) {
		this.assignedGroup = assignedGroup;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getHcId() {
		return this.hcId;
	}

	public void setHcId(int hcId) {
		this.hcId = hcId;
	}

	public String getRequestedGroup() {
		return this.requestedGroup;
	}

	public void setRequestedGroup(String requestedGroup) {
		this.requestedGroup = requestedGroup;
	}

	public String getRequestedUser() {
		return this.requestedUser;
	}

	public void setRequestedUser(String requestedUser) {
		this.requestedUser = requestedUser;
	}

	public String getSeveriety() {
		return this.severiety;
	}

	public void setSeveriety(String severiety) {
		this.severiety = severiety;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public IncidentLog getIncidentLog() {
		return this.incidentLog;
	}

	public void setIncidentLog(IncidentLog incidentLog) {
		this.incidentLog = incidentLog;
	}


}