package com.project.api.dao.repository.impl;

import com.project.api.dao.entity.Student;
import com.project.api.dao.repository.AbstractRepository;
import com.project.api.dao.repository.StudentRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl extends AbstractRepository implements StudentRepository {
    @Override
    public Optional<List<Student>> getStudents() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ").append(attributeNamesForSelect(Student.class));
        sql.append(" FROM ").append(getSimpleNameTable(Student.class));
        sql.append(" WHERE is_deleted = 0 ");
        List<Student> students = jdbcTemplate.query(sql.toString(), new BeanPropertyRowMapper<>(Student.class));
        return Optional.ofNullable(students);
    }

    @Override
    public Optional<Student> getStudentById(String code) {
        return Optional.empty();
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void isDeleted(String code) {

    }

    @Override
    public void updateStudent(Student student, String code) {

    }
}
