package com.daniel.entities;

public class Score {
	
	private Integer id = null;
	private String firstName = null;
	private String lastName = null;
	private Integer score = null;
	
	public Score() {
		super();
	}
	
	public Score(Integer id, String firstName, String lastName, Integer score) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getScore() {
		return score;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
}
