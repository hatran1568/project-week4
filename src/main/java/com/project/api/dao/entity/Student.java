package com.project.api.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String studentCode;
    private String studentName;
    private Date dob;
    private int gender;
    private String email;
    private int mobile;
    private String classCode;
    private Date created;
    private Date modified;
    private int isDeleted;
}
