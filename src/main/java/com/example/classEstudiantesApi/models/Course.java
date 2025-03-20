package com.example.classEstudiantesApi.models;

public class Course {


    private Integer course;
    private String name ;

    public Course(){

    }

    public Course(Integer course, String name) {
        this.course = course;
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
