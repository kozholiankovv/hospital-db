package com.solvdeducation.hospitalDB.model.premises;

import com.solvdeducation.hospitalDB.model.buildings.Departments;

public class Laboratory {
    private long id;
    private String name;
    private String type;
    private Departments department;

    public Laboratory() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }
}
