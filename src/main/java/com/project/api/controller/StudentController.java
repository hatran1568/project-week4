package com.project.api.controller;

import com.project.api.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "students")
public class StudentController extends AbstractController<StudentService>{
    @GetMapping(path = "")
    public ResponseEntity<?> getStudents(){
        return response(service.getStudents());
    }
}
