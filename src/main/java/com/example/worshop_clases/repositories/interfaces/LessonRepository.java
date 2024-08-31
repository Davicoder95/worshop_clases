package com.example.worshop_clases.repositories.interfaces;

import com.example.worshop_clases.entities.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<LessonEntity,Long> {
}
