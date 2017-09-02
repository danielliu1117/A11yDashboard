package com.daniel.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.daniel.entities.repositories.ScoreRepository;

@Controller
public class ScoreController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/input-scores")
    public String showForm(ScoreRepository scoreForm) {
        return "score";
    }

    @PostMapping("/input-scores")
    public String checkTestResultInfo(@Valid ScoreRepository scoreForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "score";
        }

        return "redirect:/results";
    }
}