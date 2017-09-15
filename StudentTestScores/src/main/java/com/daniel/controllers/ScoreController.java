package com.daniel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daniel.model.Score;
import com.daniel.services.ScoreService;

@Controller
public class ScoreController {
	
	private ScoreService scoreService;
	
	@Autowired(required=true)
	@Qualifier(value="scoreService")
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	@RequestMapping(value="/scores", method=RequestMethod.GET)
	public String listScores(Model model) {
		model.addAttribute("listScores", this.scoreService.listScores());
		return "score";
	}
	
	@RequestMapping(value="/score/add", method=RequestMethod.POST)
	public String addScore(@ModelAttribute("score") Score score) {
		if (score.getScoreId() == 0) {
			this.scoreService.addScore(score);
		} else {
			this.scoreService.updateScore(score);
		}
		
		return "redirect:/scores";
	}
	
	@RequestMapping(value="/remove/{scoreId}")
    public String removeScore(@PathVariable("scoreId") Score score) {
        this.scoreService.removeScore(score);
        return "redirect:/scores";
    }
	
	@RequestMapping(value="/edit/{scoreId}")
    public String editScore(@PathVariable("scoreId") int scoreId, Model model) {
		model.addAttribute("score", this.scoreService.getScoreById(scoreId));
		model.addAttribute("listScores", this.scoreService.listScores());
		return "score";
    }
}