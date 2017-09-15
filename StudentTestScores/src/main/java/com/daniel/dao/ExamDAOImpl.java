package com.daniel.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.daniel.model.Exam;

@Repository("examDao")
public class ExamDAOImpl implements ExamDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addExam(Exam exam) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(exam);
		}
	
	public void updateExam(Exam exam) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(exam);
	}
	
	public void removeExam(Exam exam) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(exam);
	}

	public Exam getExamById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Exam exam = (Exam) session.load(Exam.class, new Integer(id));
		return exam;
	}
	
	@SuppressWarnings("unchecked")
	public List<Exam> listExams() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Exam> examsList = session.createQuery("from Exam").list();
		return examsList;
	}
	
}
