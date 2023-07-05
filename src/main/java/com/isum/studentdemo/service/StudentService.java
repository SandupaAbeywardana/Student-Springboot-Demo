package com.isum.studentdemo.service;

import com.isum.studentdemo.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
