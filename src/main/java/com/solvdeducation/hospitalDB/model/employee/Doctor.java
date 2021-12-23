package com.solvdeducation.hospitalDB.model.employee;

public class Doctor extends Employee {
    private String speciality;

    public Doctor() {
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
