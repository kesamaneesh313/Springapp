package com.example.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    public Integer studentId;
    public String studentName;
    public Double studentGpa;
    
}
