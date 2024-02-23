package com.postgresql.demo.controllers;

import com.postgresql.demo.models.Person;
import com.postgresql.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository repo;
    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        repo.save(person);
    }

    @GetMapping("/persons")
    public String listPersons(Model model) {
        List<Person> persons = getAllPersons(repo);
        model.addAttribute("persons", persons);
        return "mytemplate"; // Numele paginii Thymeleaf
    }
}
