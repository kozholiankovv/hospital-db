package com.solvdeducation.hospitalDB.model.hospitalServices;

import com.solvdeducation.hospitalDB.model.premises.Cabinet;

import java.sql.Time;
import java.util.Date;

public class Appointment {
    private long id;
    private Date date;
    private Time startAppointmentTime;
    private Time endAppointmentTime;
    private Cabinet cabinet;

    public Appointment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartAppointmentTime() {
        return startAppointmentTime;
    }

    public void setStartAppointmentTime(Time startAppointmentTime) {
        this.startAppointmentTime = startAppointmentTime;
    }

    public Time getEndAppointmentTime() {
        return endAppointmentTime;
    }

    public void setEndAppointmentTime(Time endAppointmentTime) {
        this.endAppointmentTime = endAppointmentTime;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }
}
