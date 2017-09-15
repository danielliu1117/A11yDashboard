package com.daniel.dao;

import java.util.List;

import com.daniel.model.Person;

public interface PersonDAO {
		
	public void addPerson(Person person);
	public void updatePerson(Person person);
	public void removePerson(Person person);
	public Person getPersonById(int personId);
	public List<Person> listPersons();
}