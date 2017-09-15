package com.daniel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.dao.ExamDAO;
import com.daniel.model.Exam;

@Service("examService")
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	ExamDAO examDAO;

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}

	public void addExam(Exam exam) {
		this.examDAO.addExam(exam);
	}

	public void updateExam(Exam exam) {
		this.examDAO.updateExam(exam);
	}

	public void removeExam(Exam exam) {
		this.examDAO.removeExam(exam);
	}

	public Exam getExamById(int examId) {
		return this.examDAO.getExamById(examId);
	}
	
	public List<Exam> listExams() {
		return this.examDAO.listExams();
	}
}