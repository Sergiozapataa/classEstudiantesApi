package com.example.classEstudiantesApi.models;

public class Subject {

    private Integer idsubject;
    private String name ;

    public Subject (){

    }

    public Subject(Integer idsubject, String name) {
        this.idsubject = idsubject;
        this.name = name;
    }

    public Integer getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(Integer idsubject) {
        this.idsubject = idsubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
