package principal;

import controller.CarreraController;
import controller.EstudianteController;
import gui.RegistroCarreraGUI;
import gui.RegistroEstudianteGUI;
import model.Carrera;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear datos de ejemplo de carreras
        ArrayList<Carrera> carreras = new ArrayList<>();
        carreras.add(new Carrera("Ingeniería Civil Informática", "ICI", 10));
        carreras.add(new Carrera("Ingeniería Comercial", "IC", 8));

        // Crear instancias de los controladores pasando la lista de carreras como parámetro
        CarreraController carreraController = new CarreraController();
        EstudianteController estudianteController = new EstudianteController(carreras);

        // Crear el menú principal
        JFrame menuPrincipal = new JFrame("Menú Principal");
        menuPrincipal.setSize(300, 200);
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelMenu = new JPanel();
        JButton btnRegistrarCarrera = new JButton("Registrar Carrera");
        JButton btnRegistrarEstudiante = new JButton("Registrar Estudiante");

        btnRegistrarCarrera.addActionListener(e -> {
            RegistroCarreraGUI registroCarreraGUI = new RegistroCarreraGUI();
            registroCarreraGUI.setVisible(true);
        });

        btnRegistrarEstudiante.addActionListener(e -> {
            RegistroEstudianteGUI registroEstudianteGUI = new RegistroEstudianteGUI(carreras);
            registroEstudianteGUI.setVisible(true);
        });

        panelMenu.add(btnRegistrarCarrera);
        panelMenu.add(btnRegistrarEstudiante);
        menuPrincipal.add(panelMenu);

        menuPrincipal.setVisible(true);
    }
}
