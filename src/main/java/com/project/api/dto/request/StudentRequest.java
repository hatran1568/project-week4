package com.project.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    @NotNull(message = "student's name is mandatory")
    private String studentName;
    private String dob;
    private int gender;
    private String email;
    private String mobile;
    private String classCode;
}
