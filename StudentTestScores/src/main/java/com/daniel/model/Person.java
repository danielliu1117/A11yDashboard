package com.daniel.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Person {

	private int personId;
	private String firstName = null;
	private String lastName = null;
	
	@Id
	@Column(name="PERSON_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToOne(fetch = FetchType.LAZY)
	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	@Column(name = "PERSON_FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "PERSON_LASTNAME")
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
