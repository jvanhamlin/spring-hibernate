package com.jonathonvanhamlin.springhibernate.controllers;

import com.jonathonvanhamlin.springhibernate.models.Instructor;
import com.jonathonvanhamlin.springhibernate.models.InstructorDetail;
import com.jonathonvanhamlin.springhibernate.repositories.InstructorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstructorController {

    private final InstructorRepository repository;

    InstructorController(InstructorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/instructors")
    List<Instructor> all() {
        return repository.findAll();
    }

}
