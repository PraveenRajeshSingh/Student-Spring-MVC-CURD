package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
}