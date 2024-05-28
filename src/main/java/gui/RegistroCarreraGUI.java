package gui;

import controller.CarreraController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroCarreraGUI extends JFrame {
    private JTextField txtNombre;
    private JTextField txtCodigo;
    private JTextField txtSemestres;
    private JButton btnRegistrar;

    private CarreraController carreraController;

    public RegistroCarreraGUI() {
        setTitle("Registro de Carrera");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        carreraController = new CarreraController();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);

        JLabel lblCodigo = new JLabel("Código:");
        txtCodigo = new JTextField(20);

        JLabel lblSemestres = new JLabel("Semestres:");
        txtSemestres = new JTextField(20);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarCarrera();
            }
        });

        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblCodigo);
        panel.add(txtCodigo);
        panel.add(lblSemestres);
        panel.add(txtSemestres);
        panel.add(btnRegistrar);

        add(panel);
    }

    private void registrarCarrera() {
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        int semestres = Integer.parseInt(txtSemestres.getText());
        carreraController.registrarCarrera(nombre, codigo, semestres);
    }
}

