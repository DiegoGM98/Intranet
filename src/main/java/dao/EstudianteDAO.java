package dao;

import data.ConexionBD;
import model.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstudianteDAO {
    private static final String INSERT_ESTUDIANTE_SQL = "INSERT INTO estudiantes (nombre, apellido, rut, numero_matricula, id_carrera) VALUES (?, ?, ?, ?, ?)";

    public void insertarEstudiante(Estudiante estudiante) throws SQLException {
        try (Connection connection = ConexionBD.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ESTUDIANTE_SQL)) {
            preparedStatement.setString(1, estudiante.getNombre());
            preparedStatement.setString(2, estudiante.getApellido());
            preparedStatement.setString(3, estudiante.getRut());
            preparedStatement.setString(4, estudiante.getNumeroMatricula());
            preparedStatement.setInt(5, estudiante.getCarrera().getId());
            preparedStatement.executeUpdate();
        }
    }
}

