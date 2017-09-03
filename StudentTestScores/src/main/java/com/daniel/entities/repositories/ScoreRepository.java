package com.daniel.entities.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.daniel.entities.Score;

@Repository
public class ScoreRepository {
	
	private List<Score> scores = new ArrayList<Score>();
	
	public ScoreRepository() {
		super();

		scores.add(new Score(0, "Jack", "Reacher", 85));
		/*
		scoresById = new LinkedHashMap<Integer, Score>();
		scoresById.put(1, new Score(0, "Jack", "Reacher", 85));
		scoresById.put(2, new Score(1, "Olivia", "Blake", 100));
		scoresById.put(3, new Score(2, "Bellamy", "Blake", 50));
		scoresById.put(4, new Score(3, "Rick", "Sanchez", 1));
		scoresById.put(5, new Score(4, "Morty", "Smith", 49));
		*/
	}
	
	public List<Score> findAll() {
		return new ArrayList<Score>(this.scores);
	}
	
	public void add(Score score) {
		scores.add(score);
	}
}
