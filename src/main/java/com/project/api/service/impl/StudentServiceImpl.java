package com.project.api.service.impl;

import com.project.api.constant.DateTime;
import com.project.api.dao.entity.Student;
import com.project.api.dao.repository.StudentRepository;
import com.project.api.dto.request.StudentRequest;
import com.project.api.dto.response.StudentResponse;
import com.project.api.exception.ResourceNotFoundException;
import com.project.api.service.AbstractService;
import com.project.api.service.StudentService;
import com.project.api.utilities.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl extends AbstractService implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Optional<List<StudentResponse>> getStudents() {
        List<Student> students = studentRepository.getStudents().orElseThrow(() -> {
           throw new ResourceNotFoundException();
        });
        return Optional.of(students.stream()
        .map(student -> new StudentResponse(student.getId(),student.getStudentCode(),student.getStudentName(),
                DateFormat.toDateString(student.getDob(), DateTime.YYYY_MM_DD_HH_MM_SS_HYPHEN),
                student.getGender(),student.getEmail(),student.getMobile(),student.getClassCode(),
                DateFormat.toDateString(student.getCreated(), DateTime.YYYY_MM_DD_HH_MM_SS_HYPHEN),
                DateFormat.toDateString(student.getModified(),DateTime.YYYY_MM_DD_HH_MM_SS_HYPHEN),
                student.getIsDeleted()
                )).collect(Collectors.toList()));
    }

    @Override
    public Optional<StudentResponse> getStudentById(String code) {
        return Optional.empty();
    }

    @Override
    public void addStudent(StudentRequest studentRequest) {

    }

    @Override
    public void isDeleted(String code) {

    }

    @Override
    public void updateStudent(StudentRequest studentRequest, String code) {

    }

    @Override
    public boolean checkExistCode(String code) {
        return false;
    }
}
