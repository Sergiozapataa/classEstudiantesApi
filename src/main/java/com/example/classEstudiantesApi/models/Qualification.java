package com.example.classEstudiantesApi.models;

import java.util.Date;

public class Qualification {

    private Integer idqualification;
    private  Double note;
    private Date evaluationdate;

    public Qualification (){

    }

    public Qualification(Integer idqualification, Double note, Date evaluationdate) {
        this.idqualification = idqualification;
        this.note = note;
        this.evaluationdate = evaluationdate;
    }

    public Integer getIdqualification() {
        return idqualification;
    }

    public void setIdqualification(Integer idqualification) {
        this.idqualification = idqualification;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Date getEvaluationdate() {
        return evaluationdate;
    }

    public void setEvaluationdate(Date evaluationdate) {
        this.evaluationdate = evaluationdate;
    }
}
