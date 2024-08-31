package com.example.worshop_clases.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface Create <EntityRequest, Entity>{
    public ResponseEntity<Entity> genericCreate(EntityRequest entity);

}
