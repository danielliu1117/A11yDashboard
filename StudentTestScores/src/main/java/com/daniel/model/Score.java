package com.daniel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCORE")
public class Score {
	
	private int scoreId;
	private int examId;
	private int personId;
	private int score = 0;
	
	public Score(int scoreId, int examId, int personId, int score) {
		this.scoreId = scoreId;
		this.examId = examId;
		this.personId = personId;
		this.score = score;
	}
	
	@Id
	@Column(name="SCORE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getScoreId() {
		return scoreId;
	}
	
	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXAM_ID")
	public int getExamId() {
		return examId;
	}
	
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="score")
	@JoinColumn(name = "PERSON_ID")
	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	@Column(name = "SCORE")
	public Integer getScore() {
		return score;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", examId=" + examId + ", personId=" + personId + ", score=" + score + "]";
	}
}
