package com.example.classEstudiantesApi.models;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Student {

    private Integer idstudent;
    private Integer grado;
    private Date fechanacimiento;
    private String direccion;

    public Student(){

    }

    public Student(Integer idstudent, Integer grado, Date fechanacimiento, String direccion) {
        this.idstudent = idstudent;
        this.grado = grado;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
    }

    public Integer getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(Integer idstudent) {
        this.idstudent = idstudent;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}