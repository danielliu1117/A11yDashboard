package com.daniel.dao;

import java.util.List;

import com.daniel.model.Score;

public interface ScoreDAO {
	
	public void addScore(Score score);
	public void updateScore(Score score);
	public void removeScore(Score score);
	public Score getScoreById(int id);
	public List<Score> listScores();
}