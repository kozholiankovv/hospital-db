package com.solvdeducation.hospitalDB.model.employee;

public class Nurse extends Employee{
    private String position;

    public Nurse() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
