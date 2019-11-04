package com.molokotech.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id")
	private Person person;
	private String username;
	private String password;
	private String tokenForgotPass;
	private boolean isActive;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clinic_resume_id")
	private ClinicResume clinicResume;
	private String rol;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTokenForgotPass() {
		return tokenForgotPass;
	}

	public void setTokenForgotPass(String tokenForgotPass) {
		this.tokenForgotPass = tokenForgotPass;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClinicResume getClinicResume() {
		return clinicResume;
	}

	public void setClinicResume(ClinicResume clinicResume) {
		this.clinicResume = clinicResume;
	}

}
