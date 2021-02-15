package com.montrealcollege.employeemvc.model;

import org.springframework.stereotype.Component;

@Component
public class Management implements IDepartment{
    String name = "Management";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
