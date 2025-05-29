package com.example.userLoginSystem;


import com.example.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {



    List<Student> students = new ArrayList<Student>(List.of(new Student(1,"Vignesh",25),new Student(2,"Asmitha",50)));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){

        students.add(student);
        return student;
    }

}
