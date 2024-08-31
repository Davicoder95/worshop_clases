package com.example.worshop_clases.services.interfaces;

import com.example.worshop_clases.entities.ClassEntity;
import com.example.worshop_clases.entities.MediaEntity;
import com.example.worshop_clases.services.CRUD.*;

public interface IMediaService extends
        Create<MediaEntity, Long>,
        ReadById<MediaEntity, Long>,
        Delete<Long>,
        Update<MediaEntity,Long>,
        ReadAll<MediaEntity> {
}
