package com.example.worshop_clases.repositories.interfaces;

import com.example.worshop_clases.entities.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentsEntity, Long> {
}
