package com.molokotech.model;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "professionals")
public class Professional extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String document;
	private String licence;
	private String speciality;
	
	@OneToMany(targetEntity=ClinicalCare.class, mappedBy = "professional", fetch=FetchType.EAGER)
	private List<ClinicalCare> clinicalCares;
	
	@ManyToOne
	@JoinColumn(name = "clinical_resume_id")
	private ClinicResume clinicalResume;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public List<ClinicalCare> getClinicalCares() {
		return clinicalCares;
	}

	public void setClinicalCares(List<ClinicalCare> clinicalCares) {
		this.clinicalCares = clinicalCares;
	}

	public ClinicResume getClinicalResume() {
		return clinicalResume;
	}

	public void setClinicalResume(ClinicResume clinicalResume) {
		this.clinicalResume = clinicalResume;
	}


}
