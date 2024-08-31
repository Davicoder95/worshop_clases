package com.example.worshop_clases.services.interfaces;


import com.example.worshop_clases.entities.StudentsEntity;
import com.example.worshop_clases.services.CRUD.*;

public interface IStudentService extends
        Create<StudentsEntity, Long>,
        ReadById<StudentsEntity, Long>,
        Delete<Long>,
        Update<StudentsEntity,Long>,
        ReadAll<StudentsEntity> {
}
