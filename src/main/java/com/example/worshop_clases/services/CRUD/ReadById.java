package com.example.worshop_clases.services.CRUD;

public interface ReadById <Entity,ID>{
    public Entity readById(ID id);
}
