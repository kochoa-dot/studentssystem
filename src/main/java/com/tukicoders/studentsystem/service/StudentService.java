package com.tukicoders.studentsystem.service;

import com.tukicoders.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
