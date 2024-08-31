package com.example.worshop_clases.repositories.interfaces;

import com.example.worshop_clases.entities.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<MediaEntity,Long> {
}
