package com.postgresql.demo.services;

import com.postgresql.demo.dto.PersonDTO;
import com.postgresql.demo.models.Person;
import com.postgresql.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<PersonDTO> getAllPersons() {
        List<Person> persons = personRepository.findAll();
        List<PersonDTO> result = new ArrayList<>();
        for(var c : persons){
            result.add(new PersonDTO(c.getId(), c.getNume(), c.getPrenume()));
        }
        return result;
    }
}
