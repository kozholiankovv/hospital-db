package com.solvdeducation.hospitalDB.model.premises;

import com.solvdeducation.hospitalDB.model.buildings.Departments;

public class Room {
    private long id;
    private String type;
    private Departments department;

    public Room() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
