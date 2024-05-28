package model;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private String numeroMatricula;
    private Carrera carrera;

    // Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String rut, String numeroMatricula, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
        this.carrera = carrera;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}


