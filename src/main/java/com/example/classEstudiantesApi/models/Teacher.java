package com.example.classEstudiantesApi.models;

public class Teacher {

    private Integer Idteacher;
    private Integer Specialty;

    public Teacher (){

    }

    public Teacher(Integer idteacher, Integer specialty) {
        Idteacher = idteacher;
        Specialty = specialty;
    }

    public Integer getIdteacher() {
        return Idteacher;
    }

    public void setIdteacher(Integer idteacher) {
        Idteacher = idteacher;
    }

    public Integer getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(Integer specialty) {
        Specialty = specialty;
    }
}
