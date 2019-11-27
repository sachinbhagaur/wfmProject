package com.wfmanagement.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RESOURCE_ASSIGNMENT_REQUEST")
public class ResourceAssignmentRequest {

	@Id
	@SequenceGenerator(initialValue=101, allocationSize=1, name = "RAR_ID_Seq", sequenceName="RAR_ID_Seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RAR_ID_Seq")
	@Column(name="RAR_ID")
	private int rarId;
	
	@Column(name="RESOURCE_NAME")
	private String resourceName;
	
//	@OneToOne
//	@JoinColumn(name="RAR_PROJECT_ID", insertable=false, updatable=false)
//	private Project project;
//	
//	@OneToOne
//	@JoinColumn(name="RAR_ROLE_ID", insertable=false, updatable=false)
//	private Role resourceRoleObj;
	
	@Column(name="RAR_REQUIRED_EXPERIENCE")
	private int rarRequiredExprience;
	
	@Column(name="RAR_SKILL")
	private String rarSkill;
	
	@Column(name="RAR_START_DATE")
	@DateTimeFormat(pattern="dd-MM-YYYY")
	private Date rarStartDate;
	
	@Column(name="RAR_END_DATE")
	@DateTimeFormat(pattern="dd-MM-YYYY")
	private Date rarEndDate;
	
	@Column(name="RAR_REMARKS")
	private String rarRemarks;
	
	@Column(name="RAR_FLAG")
	private String rarFlags;

	public int getRarId() {
		return rarId;
	}

	public void setRarId(int rarId) {
		this.rarId = rarId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

//	public Project getProject() {
//		return project;
//	}
//
//	public void setProject(Project project) {
//		this.project = project;
//	}
//
//	public Role getResourceRoleObj() {
//		return resourceRoleObj;
//	}
//
//	public void setResourceRoleObj(Role resourceRoleObj) {
//		this.resourceRoleObj = resourceRoleObj;
//	}

	public int getRarRequiredExprience() {
		return rarRequiredExprience;
	}

	public void setRarRequiredExprience(int rarRequiredExprience) {
		this.rarRequiredExprience = rarRequiredExprience;
	}

	public String getRarSkill() {
		return rarSkill;
	}

	public void setRarSkill(String rarSkill) {
		this.rarSkill = rarSkill;
	}

	public Date getRarStartDate() {
		return rarStartDate;
	}

	public void setRarStartDate(Date rarStartDate) {
		this.rarStartDate = rarStartDate;
	}

	public Date getRarEndDate() {
		return rarEndDate;
	}

	public void setRarEndDate(Date rarEndDate) {
		this.rarEndDate = rarEndDate;
	}

	public String getRarRemarks() {
		return rarRemarks;
	}

	public void setRarRemarks(String rarRemarks) {
		this.rarRemarks = rarRemarks;
	}

	public String getRarFlags() {
		return rarFlags;
	}

	public void setRarFlags(String rarFlags) {
		this.rarFlags = rarFlags;
	}

	@Override
	public String toString() {
		return "ResourceAssignmentRequest [rarId=" + rarId + ", resourceName=" + resourceName + ", project=" + ", resourceRoleObj=" + "--" + ", rarRequiredExprience=" + rarRequiredExprience
				+ ", rarSkill=" + rarSkill + ", rarStartDate=" + rarStartDate + ", rarEndDate=" + rarEndDate
				+ ", rarRemarks=" + rarRemarks + ", rarFlags=" + rarFlags + "]";
	}
	
}
