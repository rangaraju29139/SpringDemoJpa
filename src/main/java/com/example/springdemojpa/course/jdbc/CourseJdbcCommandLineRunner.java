package com.example.springdemojpa.course.jdbc;

import com.example.springdemojpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
       repository.insert(new Course(1,"learn Aws Now","in28Minutes"));
        repository.insert(new Course(2,"learn Aws Now Now","in28Minutes"));
        repository.deleteById(1);

        System.out.println(repository.selectQuery(2));
    }
}
