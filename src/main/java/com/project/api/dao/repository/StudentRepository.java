package com.project.api.dao.repository;

import com.project.api.dao.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Optional<List<Student>> getStudents();
    Optional<Student> getStudentById(String code);
    void addStudent(Student student);
    void isDeleted(String code);
    void updateStudent(Student student, String code);
}
