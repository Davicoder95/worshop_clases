package com.example.worshop_clases.services.CRUD;

public interface Update<Entity,ID> {
    public Entity update(Entity entity, ID id);
}
