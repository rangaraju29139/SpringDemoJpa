package com.example.springdemojpa.course.jpa;

import com.example.springdemojpa.course.Course;
import com.example.springdemojpa.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
       repository.insert(new Course(1,"learn Aws jpa","in28Minutes"));
        repository.insert(new Course(2,"learn Aws jpa","in28Minutes"));
        repository.deleteById(1);

        System.out.println(repository.findById(2));
    }
}
