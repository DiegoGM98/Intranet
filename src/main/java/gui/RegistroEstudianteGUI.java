package gui;

import controller.EstudianteController;
import model.Carrera;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegistroEstudianteGUI extends JFrame {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtRut;
    private JTextField txtMatricula;
    private JComboBox<String> cmbCarrera;
    private JButton btnRegistrar;

    private EstudianteController estudianteController;

    public RegistroEstudianteGUI(ArrayList<Carrera> carreras) {
        setTitle("Registro de Estudiante");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        estudianteController = new EstudianteController(carreras);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);

        JLabel lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField(20);

        JLabel lblRut = new JLabel("Rut:");
        txtRut = new JTextField(20);

        JLabel lblMatricula = new JLabel("Matrícula:");
        txtMatricula = new JTextField(20);

        JLabel lblCarrera = new JLabel("Carrera:");
        cmbCarrera = new JComboBox<>();
        for (Carrera carrera : carreras) {
            cmbCarrera.addItem(carrera.getNombre());
        }

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarEstudiante();
            }
        });

        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblApellido);
        panel.add(txtApellido);
        panel.add(lblRut);
        panel.add(txtRut);
        panel.add(lblMatricula);
        panel.add(txtMatricula);
        panel.add(lblCarrera);
        panel.add(cmbCarrera);
        panel.add(btnRegistrar);

        add(panel);
    }

    private void registrarEstudiante() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String rut = txtRut.getText();
        String matricula = txtMatricula.getText();
        String nombreCarrera = cmbCarrera.getSelectedItem().toString();
        estudianteController.registrarEstudiante(nombre, apellido, rut, matricula, nombreCarrera);
    }
}


