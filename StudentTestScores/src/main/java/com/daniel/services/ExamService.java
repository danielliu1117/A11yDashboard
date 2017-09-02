package com.daniel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.entities.Exam;
import com.daniel.entities.repositories.ExamRepository;

@Service
public class ExamService {
	
	@Autowired
	private ExamRepository examRepository;
	
	public ExamService() {
		super();
	}
	
	public List<Exam> findAll() {
		return this.examRepository.findAll();
	}
	
	public void add(Exam exam) {
		this.examRepository.add(exam);
	}
}
