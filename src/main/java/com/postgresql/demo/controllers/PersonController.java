package com.postgresql.demo.controllers;

import com.postgresql.demo.dto.PersonDTO;
import com.postgresql.demo.models.Person;
import com.postgresql.demo.repositories.PersonRepository;
import com.postgresql.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository repo;
    @Autowired
    PersonService service;
    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        repo.save(person);
    }
    @GetMapping("/persoane")
    List<PersonDTO> getAllPersons() {
        return service.getAllPersons();
    }
    @GetMapping("/persons")
    public ModelAndView listPersons(Model model) {
        List<PersonDTO> persons = service.getAllPersons();
        model.addAttribute("persons", persons);
        ModelAndView modelAndView = new ModelAndView("mytemplate");
        return modelAndView;
        
        //return "mytemplate"; // Numele paginii Thymeleaf
        // de verificat html-ul ca aici e buba
    }
}
