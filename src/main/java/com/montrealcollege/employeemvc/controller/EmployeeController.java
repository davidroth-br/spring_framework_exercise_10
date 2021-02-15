package com.montrealcollege.employeemvc.controller;

import com.montrealcollege.employeemvc.model.Employee;
import com.montrealcollege.employeemvc.model.IDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private Employee employee;
    @Autowired
    @Qualifier("technology")
    private IDepartment department;

    @GetMapping("/create")
    public String createEmployee(ModelMap modelMap){
        employee.setFirstName("Michael");
        employee.setLastName("Jackson");
        employee.setDepartment(department);
        modelMap.addAttribute("message", "Employee " + employee.getFirstName() + " " + employee.getLastName() + " created in " + employee.getDepartment().getName());
        return "hello";
    }

}
