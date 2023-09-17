package com.example.springdemojpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJdbcRepository {


    @Autowired
    private JdbcTemplate springJdbcTemplate;

    String insertQuery =
            """
            insert into course(id,name,author) VALUES (1,'Learn Aws','aws academy');
            
            """;

    public void insert(){
        springJdbcTemplate.update(insertQuery);
    }

}
