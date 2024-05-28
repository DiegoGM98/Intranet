package controller;

import model.Carrera;
import dao.CarreraDAO;

import javax.swing.*;
import java.sql.SQLException;

public class CarreraController {
    private CarreraDAO carreraDAO;

    public CarreraController() {
        this.carreraDAO = new CarreraDAO();
    }

    public void registrarCarrera(String nombre, String codigo, int cantidadSemestres) {
        Carrera nuevaCarrera = new Carrera(nombre, codigo, cantidadSemestres);
        try {
            carreraDAO.insertarCarrera(nuevaCarrera);
            JOptionPane.showMessageDialog(null, "Carrera registrada exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la carrera: " + e.getMessage());
        }
    }
}
