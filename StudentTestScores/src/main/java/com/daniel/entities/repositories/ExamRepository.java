package com.daniel.entities.repositories;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.daniel.entities.Exam;

@Repository
public class ExamRepository {
	
	private final List<Exam> exam = new ArrayList<Exam>();
	
	public ExamRepository() {
		super();
		
		Exam exam1 = new Exam();
		exam1.setId(Integer.valueOf(1));
		LocalDate exam1Date = LocalDate.of(2017, Month.SEPTEMBER, 01);
		exam1.setExamDate(exam1Date);
		exam1.setExamTitle("Biology 101");
		exam.add(exam1);
	}
	
	public List<Exam> findAll() {
		return new ArrayList<Exam>(exam);
	}
	
	public void add(Exam exam) {
		this.exam.add(exam);
	}
}
