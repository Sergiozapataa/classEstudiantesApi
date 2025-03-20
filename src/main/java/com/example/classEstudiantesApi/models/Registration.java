package com.example.classEstudiantesApi.models;

import java.security.Timestamp;

public class Registration {

    private Integer idregistratio;
    private Timestamp registrationdate;

    public Registration(){

    }

    public Integer getIdregistratio() {
        return idregistratio;
    }

    public void setIdregistratio(Integer idregistratio) {
        this.idregistratio = idregistratio;
    }

    public Timestamp getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Timestamp registrationdate) {
        this.registrationdate = registrationdate;
    }
}
