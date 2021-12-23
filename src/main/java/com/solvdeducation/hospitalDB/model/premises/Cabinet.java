package com.solvdeducation.hospitalDB.model.premises;

import com.solvdeducation.hospitalDB.model.buildings.Departments;
import com.solvdeducation.hospitalDB.model.patient.Patient;
import com.solvdeducation.hospitalDB.model.employee.Doctor;
import com.solvdeducation.hospitalDB.model.employee.Nurse;

public class Cabinet {
    private long id;
    private Doctor doctor;
    private Nurse nurse;
    private Patient patient;
    private Departments department;

    public Cabinet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }
}
