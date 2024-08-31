package com.example.worshop_clases.services.impl;

import com.example.worshop_clases.entities.ClassEntity;
import com.example.worshop_clases.repositories.interfaces.ClassRepository;
import com.example.worshop_clases.services.interfaces.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClassImpl implements IClassService {

    @Autowired
    ClassRepository classRepository;
    @Override
    public Long create(ClassEntity entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<ClassEntity> readAll() {
        return List.of();
    }

    @Override
    public ClassEntity readById(Long aLong) {
        return null;
    }

    @Override
    public ClassEntity update(ClassEntity classEntity, Long aLong) {
        return null;
    }
}
