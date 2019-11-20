package com.molokotech.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lastname;
	private String document;
	private String address;
	private String zipcode;
	private String phone;
	private String cellphone;
	private String email;
	private String numberAddress;
	private String country;
	private String state;
	private String city;
	private String gender;
	private String birthday;
	
	@OneToMany(targetEntity = ClinicalCare.class, mappedBy = "person", fetch = FetchType.LAZY)
	private List<ClinicalCare> clinicalCares;
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberAddress() {
		return numberAddress;
	}

	public void setNumberAddress(String numberAddress) {
		this.numberAddress = numberAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public List<ClinicalCare> getClinicalCares() {
		return clinicalCares;
	}

	public void setClinicalCares(List<ClinicalCare> clinicalCares) {
		this.clinicalCares = clinicalCares;
	}

}
