package com.example.worshop_clases.services.impl;

import com.example.worshop_clases.entities.LessonEntity;
import com.example.worshop_clases.repositories.interfaces.LessonRepository;
import com.example.worshop_clases.services.interfaces.ILessonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LessonImpl implements ILessonService {

    @Autowired
    LessonRepository lessonRepository;

    @Override
    public Long create(LessonEntity entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<LessonEntity> readAll() {
        return List.of();
    }

    @Override
    public LessonEntity readById(Long aLong) {
        return null;
    }

    @Override
    public LessonEntity update(LessonEntity lessonEntity, Long aLong) {
        return null;
    }
}
