package com.jonathonvanhamlin.springhibernate.controllers;

import com.jonathonvanhamlin.springhibernate.models.Course;
import com.jonathonvanhamlin.springhibernate.repositories.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseRepository repository;

    CourseController(CourseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/courses")
    List<Course> all() {
        return repository.findAll();
    }

}
