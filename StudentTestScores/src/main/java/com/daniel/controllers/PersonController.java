package com.daniel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daniel.model.Person;
import com.daniel.services.PersonService;

@Controller
public class PersonController {
	
	private PersonService personService;
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping(value="/persons", method=RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
	
	@RequestMapping(value="/Person/add", method=RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person person) {
		if (person.getPersonId() == 0) {
			this.personService.addPerson(person);
		} else {
			this.personService.updatePerson(person);
		}
		
		return "redirect:/persons";
	}
	
	@RequestMapping(value="/remove/{personId}")
    public String removePerson(@PathVariable("personId") Person person) {
        this.personService.removePerson(person);
        return "redirect:/persons";
    }
	
	@RequestMapping(value="/edit/{personId}")
    public String editPerson(@PathVariable("personId") int personId, Model model) {
		model.addAttribute("person", this.personService.getPersonById(personId));
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
    }
}