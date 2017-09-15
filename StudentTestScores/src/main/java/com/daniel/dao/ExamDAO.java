package com.daniel.dao;

import java.util.List;

import com.daniel.model.Exam;

public interface ExamDAO {
		
	public void addExam(Exam exam);
	public void updateExam(Exam exam);
	public void removeExam(Exam exam);
	public Exam getExamById(int id);
	public List<Exam> listExams();
}