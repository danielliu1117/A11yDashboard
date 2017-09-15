package com.daniel.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.dao.ScoreDAO;
import com.daniel.model.Score;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	private ScoreDAO scoreDAO;

	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}

	public void addScore(Score score) {
		this.scoreDAO.addScore(score);
	}

	public void updateScore(Score score) {
		this.scoreDAO.updateScore(score);
	}

	public void removeScore(Score score) {
		this.scoreDAO.removeScore(score);
	}

	public Score getScoreById(int scoreId) {
		return this.scoreDAO.getScoreById(scoreId);
	}

	public List<Score> listScores() {
		return this.scoreDAO.listScores();
	}
}