package com.example.worshop_clases.services.CRUD;

public interface Create<EntityRequest, Entity>{
    public Entity create(EntityRequest entity);
}
