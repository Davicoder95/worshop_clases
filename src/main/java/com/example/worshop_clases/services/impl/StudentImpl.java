package com.example.worshop_clases.services.impl;

import com.example.worshop_clases.entities.StudentsEntity;
import com.example.worshop_clases.repositories.interfaces.StudentRepository;
import com.example.worshop_clases.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentImpl implements IStudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Long create(StudentsEntity entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<StudentsEntity> readAll() {
        return List.of();
    }

    @Override
    public StudentsEntity readById(Long aLong) {
        return null;
    }

    @Override
    public StudentsEntity update(StudentsEntity studentsEntity, Long aLong) {
        return null;
    }
}
