package com.ardev.graphql.controller;

import com.ardev.graphql.entity.Person;
import com.ardev.graphql.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @MutationMapping(name = "createPerson")
    public Person createPerson(@Argument(name = "persons") Person person) {
        return personService.addPerson(person);
    }

    @QueryMapping(name = "getPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPerson();
    }
}
