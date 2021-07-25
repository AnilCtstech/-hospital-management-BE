package com.citiustech.hms.patientvisitdetails.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column(nullable = false,length = 100)
	private String drugId;
	@Column(nullable = false,length = 100)
	private String drugName;
	@Column(nullable = false,length = 100)
	private String drugGenericName;
	@Column(nullable = false,length = 100)
	private String drugBrandName;
	@Column(nullable = false,length = 150)
	private String drugStrength;
	@Column(nullable = false)
	private String drugForm;
	@Column(nullable = false)
	private long patientId;
	@Column(nullable = false)
	private Timestamp createdAt;
	@Column(nullable = false)
	private Timestamp updatedAt;
	@Column(nullable = false)
	private String createdBy;
	@Column(nullable = false)
	private String updatedBy;
	
	public String getDrugForm() {
		return drugForm;
	}
	public void setDrugForm(String drugForm) {
		this.drugForm = drugForm;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDrugId() {
		return drugId;
	}
	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugGenericName() {
		return drugGenericName;
	}
	public void setDrugGenericName(String drugGenericName) {
		this.drugGenericName = drugGenericName;
	}
	public String getDrugBrandName() {
		return drugBrandName;
	}
	public void setDrugBrandName(String drugBrandName) {
		this.drugBrandName = drugBrandName;
	}
	public String getDrugStrength() {
		return drugStrength;
	}
	public void setDrugStrength(String drugStrength) {
		this.drugStrength = drugStrength;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	
}