package com.example.worshop_clases.services.impl;

import com.example.worshop_clases.entities.MediaEntity;
import com.example.worshop_clases.repositories.interfaces.MediaRepository;
import com.example.worshop_clases.services.interfaces.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MediaImpl implements IMediaService {
    @Autowired
    MediaRepository mediaRepository;

    @Override
    public Long create(MediaEntity entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<MediaEntity> readAll() {
        return List.of();
    }

    @Override
    public MediaEntity readById(Long aLong) {
        return null;
    }

    @Override
    public MediaEntity update(MediaEntity mediaEntity, Long aLong) {
        return null;
    }
}
