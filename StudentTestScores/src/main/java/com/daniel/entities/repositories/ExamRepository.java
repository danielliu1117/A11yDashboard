package com.daniel.entities.repositories;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.daniel.entities.Exam;
import com.daniel.entities.Score;

@Repository
public class ExamRepository {
	
	private final List<Exam> exam = new ArrayList<Exam>();
	
	public ExamRepository() {
		super();
		
		List<Score> scores = new ArrayList<Score>();
		scores.add(new Score(0, "Jack", "Reacher", 85));
		scores.add(new Score(1, "Olivia", "Blake", 100));
		scores.add(new Score(2, "Bellamy", "Blake", 50));
		exam.add(new Exam(0, LocalDate.of(2017, Month.AUGUST, 8), "Chemistry 49", scores));
	}
	
	public List<Exam> findAll() {
		return new ArrayList<Exam>(exam);
	}
	
	public void add(Exam exam) {
		this.exam.add(exam);
	}
}
