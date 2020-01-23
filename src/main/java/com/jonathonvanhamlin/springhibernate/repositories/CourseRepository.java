package com.jonathonvanhamlin.springhibernate.repositories;

import com.jonathonvanhamlin.springhibernate.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
