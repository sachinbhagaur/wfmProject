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
@Table(name="RESOURCE_DETAILS")
public class ResourceDetail {
	
	@Id
	@SequenceGenerator(initialValue=601, allocationSize=1, name = "myRDSeq",sequenceName="resourceID_Seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myRDSeq")
	@Column(name="RESOURCE_ID")
	private int resourceId;
	
	@Column(name="RESOURCE_NAME")
	private String resourceName;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_ROLE_ID",insertable=false,updatable=false)
	private Role resourceRoleObj;
	
	@Column(name="RESOURCE_EXPERIENCE")
	private int resourceExperience;
	
	@Column(name="RESOURCE_PASSWORD")
	private String resourcePassword;
	
	@Column(name="RESOURCE_EMAIL")
	private String resourceEmail;
	
	@Column(name="RESOURCE_DOB")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date resourceDob;
	
	@Column(name="RESOURCE_GENDER")
	private String resourceGender;
	
	@Column(name="RESOURCE_MARITAL_STATUS")
	private String resourceMaritalStatus;
	
	@Column(name="RESOURCE_PHONE_NUMBER")
	private long resourcePhoneNumber;
	
	@Column(name="RESOURCE_SKILLS")
	private String resourceSkills;
	
	@Column(name="RESOURCE_STATUS")
	private String resourceStatus;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_PROJECT_ID")
	private Project resourceProjectObj;
	
	@Column(name="RESOURCE_START_DATE")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date projectStartDate;
	
	
	@Column(name="RESOURCE_END_DATE")
	@DateTimeFormat(pattern="yyyy-MM-dd")	
	private Date projectEndDate;
	
	@Column(name="RESOURCE_ROLE_ID")
	private int roleId;
	


	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Role getResourceRoleObj() {
		return resourceRoleObj;
	}

	public void setResourceRoleObj(Role resourceRoleObj) {
		this.resourceRoleObj = resourceRoleObj;
	}

	public int getResourceExperience() {
		return resourceExperience;
	}

	public void setResourceExperience(int resourceExperience) {
		this.resourceExperience = resourceExperience;
	}

	public String getResourcePassword() {
		return resourcePassword;
	}

	public void setResourcePassword(String resourcePassword) {
		this.resourcePassword = resourcePassword;
	}

	public String getResourceEmail() {
		return resourceEmail;
	}

	public void setResourceEmail(String resourceEmail) {
		this.resourceEmail = resourceEmail;
	}

	public Date getResourceDob() {
		return resourceDob;
	}

	public void setResourceDob(Date resourceDob) {
		this.resourceDob = resourceDob;
	}

	public String getResourceGender() {
		return resourceGender;
	}

	public void setResourceGender(String resourceGender) {
		this.resourceGender = resourceGender;
	}

	public String getResourceMaritalStatus() {
		return resourceMaritalStatus;
	}

	public void setResourceMaritalStatus(String resourceMaritalStatus) {
		this.resourceMaritalStatus = resourceMaritalStatus;
	}

	public long getResourcePhoneNumber() {
		return resourcePhoneNumber;
	}

	public void setResourcePhoneNumber(long resourcePhoneNumber) {
		this.resourcePhoneNumber = resourcePhoneNumber;
	}

	public String getResourceSkills() {
		return resourceSkills;
	}

	public void setResourceSkills(String resourceSkills) {
		this.resourceSkills = resourceSkills;
	}

	public String getResourceStatus() {
		return resourceStatus;
	}

	public void setResourceStatus(String resourceStatus) {
		this.resourceStatus = resourceStatus;
	}

	public Project getResourceProjectObj() {
		return resourceProjectObj;
	}

	public void setResourceProjectObj(Project resourceProjectObj) {
		this.resourceProjectObj = resourceProjectObj;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	

	
}
