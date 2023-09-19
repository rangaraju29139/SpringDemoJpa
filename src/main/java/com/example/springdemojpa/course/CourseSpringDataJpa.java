package com.example.springdemojpa.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface CourseSpringDataJpa extends JpaRepository<Course,Long> {


}
