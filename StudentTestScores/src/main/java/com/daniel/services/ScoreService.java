package com.daniel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.entities.Score;
import com.daniel.entities.repositories.ScoreRepository;

@Service
public class ScoreService {
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	public ScoreService() {
		super();
	}
	
	public List<Score> findAll() {
		return scoreRepository.findAll();
	}
	
	public Score findById(Integer id) {
		return scoreRepository.findById(id);
	}
}
