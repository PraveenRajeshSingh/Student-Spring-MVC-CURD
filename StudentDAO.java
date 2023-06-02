package com.student.dao;
import java.util.List;

import com.student.model.Student;

public interface StudentDAO {
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
}