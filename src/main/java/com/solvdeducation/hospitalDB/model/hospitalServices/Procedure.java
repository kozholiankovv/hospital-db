package com.solvdeducation.hospitalDB.model.hospitalServices;

import com.solvdeducation.hospitalDB.model.premises.Laboratory;

public class Procedure {
    private long id;
    private String name;
    private Laboratory laboratory;

    public Procedure() {
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

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }
}
