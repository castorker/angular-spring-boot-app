package com.standapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String teamMember;
	String project;
	String workYesterday;
	String workToday;
	String impediments;
	Date createdOn;
	Date modifiedOn;

	public Note() { }
	
	public Note(Long id, String teamMember, String project, String workYesterday, String workToday, String impediments, Date createdOn, Date modifiedOn) {
		this.id = id;
		this.teamMember = teamMember;
		this.project = project;
		this.workYesterday = workYesterday;
		this.workToday = workToday;
		this.impediments = impediments;
		this.createdOn = createdOn;
		this.modifiedOn = modifiedOn;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTeamMember() {
		return teamMember;
	}
	
	public void setTeamMember(String teamMember) {
		this.teamMember = teamMember;
	}

	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}
	
	public String getWorkYesterday() {
		return workYesterday;
	}
	
	public void setWorkYesterday(String workYesterday) {
		this.workYesterday = workYesterday;
	}
	
	public String getWorkToday() {
		return workToday;
	}
	
	public void setWorkToday(String workToday) {
		this.workToday = workToday;
	}

	public String getImpediments() {
		return impediments;
	}
	
	public void setImpediments(String impediments) {
		this.impediments = impediments;
	}

	public Date getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public Date getModifiedOn() {
		return modifiedOn;
	}
	
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}
