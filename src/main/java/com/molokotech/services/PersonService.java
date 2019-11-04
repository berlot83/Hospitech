package com.molokotech.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molokotech.model.Person;
import com.molokotech.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person create(Person person) {
		return personRepository.save(person);
	}
	
	public Person read(Long id) {
		return personRepository.getOne(id);
	}
	
	public List<Person> readAll(){
		return personRepository.findAll();
	}
	
	public void delete(Long id) {
		personRepository.deleteById(id);
	}
	
	public Person update(Person person) {
		return personRepository.save(person);
	}
}
