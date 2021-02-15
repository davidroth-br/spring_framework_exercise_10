package com.montrealcollege.employeemvc.model;

import org.springframework.stereotype.Component;

@Component
public class Technology implements IDepartment{
    String name = "Technology";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
