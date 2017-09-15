package com.daniel.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.dao.PersonDAO;
import com.daniel.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	public void addPerson(Person person) {
		this.personDAO.addPerson(person);
	}

	public void updatePerson(Person person) {
		this.personDAO.updatePerson(person);
	}

	public void removePerson(Person person) {
		this.personDAO.removePerson(person);
	}

	public Person getPersonById(int personId) {
		return this.personDAO.getPersonById(personId);
	}

	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}
}