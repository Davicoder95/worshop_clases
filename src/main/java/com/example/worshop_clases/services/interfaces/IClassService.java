package com.example.worshop_clases.services.interfaces;

import com.example.worshop_clases.entities.ClassEntity;
import com.example.worshop_clases.services.CRUD.*;
import org.springframework.data.domain.Pageable;

public interface IClassService extends
        Create<ClassEntity, Long>,
        ReadById<ClassEntity, Long>,
        Delete<Long>,
        Update<ClassEntity,Long>,
        ReadAll<ClassEntity> {

        //Page<> readPages(Pageable pageable);
}
