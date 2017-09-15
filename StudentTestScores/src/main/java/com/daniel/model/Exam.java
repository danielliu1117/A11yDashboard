package com.daniel.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EXAM")
public class Exam {
	
	private int examId;
	private String examTitle = null;
	private Set<Score> scores = new HashSet<Score>(0);
	
	public Exam(String examTitle, Set<Score> scores) {
		this.examTitle = examTitle;
		this.scores = scores;
	}
	
	@Id
	@Column(name = "EXAM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getExamId() {
		return examId;
	}
	
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	@Column(name = "EXAM_TITLE")
	public String getExamTitle() {
		return examTitle;
	}
	
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	
	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exam")
	public Set<Score> getScores() {
		return scores;
	}
	
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examTitle=" + examTitle + "]";
	}
}
