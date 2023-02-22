package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping
    public List<Student> getStudents(){
        return repo.findAll();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        repo.save(student);
    }
    
}
