package com.project.api.service;

import com.project.api.dto.request.StudentRequest;
import com.project.api.dto.response.StudentResponse;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Optional<List<StudentResponse>> getStudents();
    Optional<StudentResponse> getStudentById(String code);
    void addStudent(StudentRequest studentRequest);
    void isDeleted(String code);
    void updateStudent(StudentRequest studentRequest, String code);
    boolean checkExistCode(String code);
}
