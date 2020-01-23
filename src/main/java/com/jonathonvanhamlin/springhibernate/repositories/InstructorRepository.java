package com.jonathonvanhamlin.springhibernate.repositories;

import com.jonathonvanhamlin.springhibernate.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
