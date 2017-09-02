package com.daniel.entities.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.daniel.entities.Score;

@Repository
public class ScoreRepository {
	
	private final Map<Integer, Score> scoresById;
	
	public ScoreRepository() {
		super();
		
		scoresById = new LinkedHashMap<Integer, Score>();
		
		Score score1 = new Score();
		score1.setId(Integer.valueOf(1));
		score1.setFirstName("Jack");
		score1.setLastName("Reacher");
		score1.setScore(Integer.valueOf(85));
		scoresById.put(score1.getId(), score1);
		
		Score score2 = new Score();
		score2.setId(Integer.valueOf(2));
		score2.setFirstName("Olivia");
		score2.setLastName("Blake");
		score2.setScore(Integer.valueOf(100));
		scoresById.put(score2.getId(), score2);
	}
	
	public List<Score> findAll() {
		return new ArrayList<Score>(scoresById.values());
	}
	
	public Score findById(Integer id) {
		return scoresById.get(id);
	}
}
