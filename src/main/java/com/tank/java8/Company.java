package com.tank.java8;

import java.util.List;

/**
 * @author tank
 * @create 2019/12/07 14:13
 */
public class Company {
    private String name;
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
