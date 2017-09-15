package com.daniel.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.daniel.model.Person;

public class PersonDAOImpl implements PersonDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addPerson(Person person) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(person);
		}
	
	public void updatePerson(Person person) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(person);
	}
	
	public void removePerson(Person person) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(person);
	}

	public Person getPersonById(int personId) {
		Session session = this.sessionFactory.getCurrentSession();
		Person Person = (Person) session.load(Person.class, new Integer(personId));
		return Person;
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		return personsList;
	}
	
}