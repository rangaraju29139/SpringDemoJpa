package com.example.springdemojpa.course.jdbc;

import com.example.springdemojpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJdbcRepository {


    @Autowired
    private JdbcTemplate springJdbcTemplate;

    String insertQuery =
            """
            insert into course(id,name,author) VALUES (?,?,?);
            
            """;

    String deleteQuery =
            """
                    delete from course where id = ?;
                    """;

    public void insert(Course course){
        springJdbcTemplate.update(insertQuery,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(deleteQuery,id);
    }

}
