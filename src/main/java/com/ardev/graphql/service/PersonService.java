package com.ardev.graphql.service;

import com.ardev.graphql.entity.Person;
import com.ardev.graphql.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    //Add Person
    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    // find all person Details
    public List<Person> getAllPerson (){
        return personRepository.findAll();
    }

    // Get a specific person info
    public Person getPersonById(Long personId){
        return personRepository
                .findById(personId)
                .orElseThrow(()-> new NoSuchElementException("Person not found"));
    }
}
