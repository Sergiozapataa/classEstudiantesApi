package com.example.classEstudiantesApi.models;

import com.example.classEstudiantesApi.helpers.State;

import javax.xml.crypto.Data;
import java.util.Date;

public class Attendance {

    private Integer idattendance;
    private Date date;
    private State state;

    public  Attendance(){

    }

    public Attendance(Integer idattendance, Date date, State state) {
        this.idattendance = idattendance;
        this.date = date;
        this.state = state;
    }

    public Integer getIdattendance() {
        return idattendance;
    }

    public void setIdattendance(Integer idattendance) {
        this.idattendance = idattendance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
