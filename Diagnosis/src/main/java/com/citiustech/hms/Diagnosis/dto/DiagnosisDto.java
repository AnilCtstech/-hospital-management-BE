package com.citiustech.hms.Diagnosis.dto;

import java.sql.Timestamp;

public class DiagnosisDto {
	private String diagnosisCode;
	private String diagnosisDescription;
	private boolean diagnosisIsDeprecated;
	private long patientId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String createdBy;
	private String updatedBy;
	
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
	public String getDiagnosisCode() {
		return diagnosisCode;
	}
	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}
	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}
	public void setDiagnosisDescription(String diagnosisDescription) {
		this.diagnosisDescription = diagnosisDescription;
	}
	public boolean isDiagnosisIsDeprecated() {
		return diagnosisIsDeprecated;
	}
	public void setDiagnosisIsDeprecated(boolean diagnosisIsDeprecated) {
		this.diagnosisIsDeprecated = diagnosisIsDeprecated;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public DiagnosisDto(String diagnosisCode, String diagnosisDescription, boolean diagnosisIsDeprecated,
			long patientId, Timestamp createdAt) {
		super();
		this.diagnosisCode = diagnosisCode;
		this.diagnosisDescription = diagnosisDescription;
		this.diagnosisIsDeprecated = diagnosisIsDeprecated;
		this.patientId = patientId;
		this.createdAt = createdAt;
	}
	
	
}
