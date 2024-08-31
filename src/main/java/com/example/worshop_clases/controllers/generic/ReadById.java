package com.example.worshop_clases.controllers.generic;

public interface ReadById <Entity, Id> {

    public  Entity genericReadById(Id id);
}
