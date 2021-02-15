package com.montrealcollege.employeemvc.model;

import org.springframework.stereotype.Component;

@Component
public class HR implements IDepartment{
    String name = "HR";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
