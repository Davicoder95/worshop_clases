package com.example.worshop_clases.controllers.generic;

public interface Update <Entity, Id>{

    public Entity genericUpdate(Entity entity, Id id);
}
