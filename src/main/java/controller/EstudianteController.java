package controller;

import model.Carrera;
import model.Estudiante;
import dao.EstudianteDAO;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstudianteController {
    private EstudianteDAO estudianteDAO;
    private ArrayList<Carrera> carreras; // Lista de carreras existentes

    public EstudianteController(ArrayList<Carrera> carreras) {
        this.estudianteDAO = new EstudianteDAO();
        this.carreras = carreras;
    }

    public void registrarEstudiante(String nombre, String apellido, String rut, String numeroMatricula, String nombreCarrera) {
        Carrera carrera = obtenerCarreraPorNombre(nombreCarrera);

        if (carrera != null) {
            Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, rut, numeroMatricula, carrera);
            try {
                estudianteDAO.insertarEstudiante(nuevoEstudiante);
                JOptionPane.showMessageDialog(null, "Estudiante registrado exitosamente.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar el estudiante: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "La carrera especificada no existe.");
        }
    }

    private Carrera obtenerCarreraPorNombre(String nombreCarrera) {
        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                return carrera;
            }
        }
        return null; // Si no se encuentra la carrera, devuelve null
    }
}

