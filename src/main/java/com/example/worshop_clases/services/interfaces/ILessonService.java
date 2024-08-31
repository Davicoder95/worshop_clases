package com.example.worshop_clases.services.interfaces;

import com.example.worshop_clases.entities.LessonEntity;
import com.example.worshop_clases.services.CRUD.*;

public interface ILessonService extends
        Create<LessonEntity, Long>,
        ReadById<LessonEntity, Long>,
        Delete<Long>,
        Update<LessonEntity,Long>,
        ReadAll<LessonEntity> {
}
