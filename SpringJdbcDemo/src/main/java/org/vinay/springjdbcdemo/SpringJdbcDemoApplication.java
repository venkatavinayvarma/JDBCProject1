package org.vinay.springjdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.vinay.springjdbcdemo.model.Student;
import org.vinay.springjdbcdemo.service.StudentService;
import java.util.List;


@SpringBootApplication
public class SpringJdbcDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
        Student s= context.getBean(Student.class);
        s.setRollNo(101);
        s.setName("Navin");
        s.setMarks(78);
        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students=service.getStudents();
        System.out.println(students);

    }

}