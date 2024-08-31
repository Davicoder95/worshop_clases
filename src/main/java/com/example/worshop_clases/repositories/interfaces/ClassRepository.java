package com.example.worshop_clases.repositories.interfaces;

import com.example.worshop_clases.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
}
