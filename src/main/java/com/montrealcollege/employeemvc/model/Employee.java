package com.montrealcollege.employeemvc.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String firstName;
    private String lastName;
    private IDepartment department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IDepartment getDepartment() {
        return department;
    }

    public void setDepartment(IDepartment department) {
        this.department = department;
    }
}
