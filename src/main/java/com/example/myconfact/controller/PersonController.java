package com.example.myconfact.controller;

import com.example.myconfact.domain.Person;
import com.example.myconfact.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/person")
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    @RequestMapping(value = "/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }
}