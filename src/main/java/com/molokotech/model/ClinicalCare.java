package com.molokotech.model;
import java.time.LocalDateTime;

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
@Table(name = "clinical_cares")
public class ClinicalCare {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	private LocalDateTime date;
	
    @ManyToOne
    @JoinColumn(name = "professional_id", nullable=false)
    private Professional professional;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Professional getProfessional() {
		return professional;
	}

	public void setProfessional(Professional professional) {
		this.professional = professional;
	}

}
