package com.example.springdemojpa.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CourseSpringDataJpa extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);


}
