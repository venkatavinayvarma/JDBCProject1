package org.vinay.springjdbcdemo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.vinay.springjdbcdemo.model.Student;


// student repository



@Repository
public class StudentRepo {

    public JdbcTemplate jdbc;


    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String sql = "insert into student(rollNo, name, marks) values(?,?,?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " rows inserted");
    }

    public List<Student> findAll() {

        List<Student> students=new ArrayList<>();
        return students;
    }

}
