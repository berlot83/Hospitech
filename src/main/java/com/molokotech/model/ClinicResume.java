package com.molokotech.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clinic_resumes")
public class ClinicResume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String resume;
	private LocalDate date;
	
	@OneToMany(targetEntity=Professional.class, mappedBy = "clinicalResume", fetch=FetchType.EAGER)
	private List<Professional> listProfessionals;
	
    @OneToOne(targetEntity=User.class, fetch = FetchType.LAZY, mappedBy = "clinicResume")
    @JoinColumn(name = "user_id")
    private User user;
	

	public ClinicResume() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Professional> getListProfessionals() {
		return listProfessionals;
	}

	public void setListProfessionals(List<Professional> listProfessionals) {
		this.listProfessionals = listProfessionals;
	}

}
