package com.daniel.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.daniel.model.Score;

public class ScoreDAOImpl implements ScoreDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addScore(Score score) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(score);
		}
	
	public void updateScore(Score score) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(score);
	}
	
	public void removeScore(Score score) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(score);
	}

	public Score getScoreById(int scoreId) {
		Session session = this.sessionFactory.getCurrentSession();
		Score score = (Score) session.load(Score.class, new Integer(scoreId));
		return score;
	}
	
	@SuppressWarnings("unchecked")
	public List<Score> listScores() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Score> scoresList = session.createQuery("from Score").list();
		return scoresList;
	}
	
}
