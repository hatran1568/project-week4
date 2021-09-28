package com.project.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private int id;
    private String studentCode;
    private String studentName;
    private String dob;
    private int gender;
    private String email;
    private int mobile;
    private String classCode;
    private String crated;
    private String modified;
    private int isDeleted;
}
