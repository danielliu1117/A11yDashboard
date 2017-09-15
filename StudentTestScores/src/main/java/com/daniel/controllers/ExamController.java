package com.daniel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daniel.model.Exam;
import com.daniel.services.ExamService;

@Controller
public class ExamController {
	
	private ExamService examService;
	
	@Autowired(required=true)
	@Qualifier(value="examService")
	public void setExamService(ExamService examService) {
		this.examService = examService;
	}
	
	@RequestMapping(value="/exams", method=RequestMethod.GET)
	public String listExams(Model model) {
		model.addAttribute("listExams", this.examService.listExams());
		return "exam";
	}
	
	@RequestMapping(value="/exam/add", method=RequestMethod.POST)
	public String addExam(@ModelAttribute("exam") Exam exam) {
		if (exam.getExamId() == 0) {
			this.examService.addExam(exam);
		} else {
			this.examService.updateExam(exam);
		}
		
		return "redirect:/exams";
	}
	
	@RequestMapping(value="/remove/{examId}")
    public String removeExam(@PathVariable("examId") Exam exam) {
        this.examService.removeExam(exam);
        return "redirect:/exams";
    }
	
	@RequestMapping(value="/edit/{examId}")
    public String editExam(@PathVariable("examId") int examId, Model model) {
		model.addAttribute("exam", this.examService.getExamById(examId));
		model.addAttribute("listExams", this.examService.listExams());
		return "exam";
    }
}