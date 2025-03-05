package org.vinay.springjdbcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.vinay.springjdbcdemo.model.Student;
import org.vinay.springjdbcdemo.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }



    public void addStudent(Student s) {

        repo.save(s);
    }

    public List<Student> getStudents() {

        return repo.findAll();
    }



}