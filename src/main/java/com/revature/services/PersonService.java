package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.domain.Person;
import com.revature.repositories.PersonRepository;

public class PersonService {

	@Autowired 
	private PersonRepository repository;
	
	public void addPerson(Person person) {		
				
		repository.save(person);
		
	}
}
