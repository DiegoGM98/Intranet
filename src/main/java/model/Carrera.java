package model;

import java.util.ArrayList;

public class Carrera {
    private int id; // Agregar un campo para el identificador único
    private String nombre;
    private String codigo;
    private int cantidadSemestres;
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Carrera() {
        estudiantes = new ArrayList<>();
    }

    public Carrera(String nombre, String codigo, int cantidadSemestres) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadSemestres = cantidadSemestres;
        estudiantes = new ArrayList<>();
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadSemestres() {
        return cantidadSemestres;
    }

    public void setCantidadSemestres(int cantidadSemestres) {
        this.cantidadSemestres = cantidadSemestres;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Métodos para agregar y eliminar estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    public int getId() {
        return id;
    }

    // Método para establecer el ID
    public void setId(int id) {
        this.id = id;
    }
}
