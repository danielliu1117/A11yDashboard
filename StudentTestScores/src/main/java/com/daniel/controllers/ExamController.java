package com.daniel.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.daniel.entities.Exam;
import com.daniel.entities.Score;
import com.daniel.services.ScoreService;
import com.daniel.services.ExamService;

@Controller
public class ExamController extends WebMvcConfigurerAdapter {
	
	@Autowired
	private ExamService examService;
	
	@Autowired
	private ScoreService scoreService;
	
	public ExamController() {
		super();
	}
	
	@ModelAttribute("allScores")
	public List<Score> populateScores() {
		return scoreService.findAll();
	}
	
	@ModelAttribute("allExams")
	public List<Exam> populateExams() {
		return examService.findAll();
	}
	
	@RequestMapping({"/","/exam"})
	public String showExams(Exam exam) {
		return "exam";
	}
	
	@RequestMapping(value="/exam", params={"save"})
    public String saveSeedstarter(Exam exam, BindingResult bindingResult, ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "exam";
        }
        this.examService.add(exam);
        model.clear();
        return "redirect:/exam";
    }
	
	@RequestMapping(value="/exam", params={"addRow"})
    public String addRow(Exam exam, BindingResult bindingResult) {
        exam.getScores().add(new Score());
        return "exam";
    }
    
    @RequestMapping(value="/exam", params={"removeRow"})
    public String removeRow(Exam exam, BindingResult bindingResult, HttpServletRequest req) {
        Integer scoreId = Integer.valueOf(req.getParameter("removeScore"));
        exam.getScores().remove(scoreId.intValue());
        return "exam";
    }
}
