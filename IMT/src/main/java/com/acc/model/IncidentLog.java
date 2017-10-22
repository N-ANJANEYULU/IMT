package com.acc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the incident_log database table.
 * 
 */
@Entity
@Table(name="incident_log")
@NamedQuery(name="IncidentLog.findAll", query="SELECT i FROM IncidentLog i")
public class IncidentLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INC_ID")
	private Integer incId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DT")
	private Date createDt;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DT")
	private Date updateDt;

	@Column(name="USER_GROUP")
	private String userGroup;

	//bi-directional many-to-one association to IncHistLog
	@OneToMany(mappedBy="incidentLog")
	private List<IncHistLog> incHistLogs;

	//bi-directional many-to-one association to UserInc
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserInc userInc;

	public IncidentLog() {
	}



	public Integer getIncId() {
		return incId;
	}



	public void setIncId(Integer incId) {
		this.incId = incId;
	}



	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
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

	public List<IncHistLog> getIncHistLogs() {
		return this.incHistLogs;
	}

	public void setIncHistLogs(List<IncHistLog> incHistLogs) {
		this.incHistLogs = incHistLogs;
	}

	public IncHistLog addIncHistLog(IncHistLog incHistLog) {
		getIncHistLogs().add(incHistLog);
		incHistLog.setIncidentLog(this);

		return incHistLog;
	}

	public IncHistLog removeIncHistLog(IncHistLog incHistLog) {
		getIncHistLogs().remove(incHistLog);
		incHistLog.setIncidentLog(null);

		return incHistLog;
	}

	public UserInc getUserInc() {
		return this.userInc;
	}

	public void setUserInc(UserInc userInc) {
		this.userInc = userInc;
	}

}