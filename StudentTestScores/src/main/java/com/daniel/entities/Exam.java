package com.daniel.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Exam {
	
	private Integer id = null;
	private LocalDate examDate = null;
	private String examTitle = null;
	private List<Score> scores = new ArrayList<Score>();
	
	public Exam() {
		super();
	}
	
	public Exam(Integer id, LocalDate examDate, String examTitle, List<Score> scores) {
		this.id = id;
		this.examDate = examDate;
		this.examTitle = examTitle;
		this.scores = scores;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDate getExamDate() {
		return examDate;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}
	
	public String getExamTitle() {
		return examTitle;
	}
	
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	
	public List<Score> getScores() {
		return scores;
	}
	
	@Override
	public String toString() {
		return "Exam [id=" + id + ", examDate=" + examDate + ", scores=" + scores + "]";
	}
}
