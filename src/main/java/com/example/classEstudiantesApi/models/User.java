package com.example.classEstudiantesApi.models;

import com.example.classEstudiantesApi.helpers.Typeuser;

public class User {

    private Integer idUser;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Typeuser typeuser;

    public User () {

    }

    public User(Integer idUser, String name, String email, String password, String phoneNumber, Typeuser typeuser) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.typeuser = typeuser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Typeuser getTypeuser() {
        return typeuser;
    }

    public void setTypeuser(Typeuser typeuser) {
        this.typeuser = typeuser;
    }
}
