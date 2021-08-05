package com.citiustech.hms.UserRegisterManagement.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.citiustech.hms.UserRegisterManagement.utils.RoleConverter;

@Entity
public class Employee {
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	@NotNull
	private String title;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String password;
	@NotNull
	@Email(message = "Email should be valid")
	private String email;
	@NotNull
	private Date dateOfBirth;
	private int passCount;

	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="is_blocked" )
	private Boolean isBlocked;
	
	private String isAccess;
	
	// private String role;

	@Convert(converter = RoleConverter.class)
	private Role role;

	public Employee() {
		super();
	}

	public Employee(@NotNull Long employeeId, @NotNull String title, @NotNull String firstName,
			@NotNull String lastName, @NotNull String password,
			@NotNull @Email(message = "Email should be valid") String email, @NotNull Date dateOfBirth, Role role,int passCount, Boolean isActive, Boolean isBlocked) {
		super();
		this.employeeId = employeeId;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.passCount = passCount;
		this.isActive = isActive;
		this.isBlocked = isBlocked;
	}
	public int getPassCount() {
		return passCount;
	}
	public void setPassCount(int passCount) {
		this.passCount = passCount;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	public String getIsAccess() {
		return isAccess;
	}

	public void setIsAccess(String isAccess) {
		this.isAccess = isAccess;
	}

}
