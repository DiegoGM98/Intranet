package dao;

import data.ConexionBD;
import model.Carrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarreraDAO {
    private static final String INSERT_CARRERA_SQL = "INSERT INTO carreras (nombre, codigo, cantidad_semestres) VALUES (?, ?, ?)";

    public void insertarCarrera(Carrera carrera) throws SQLException {
        try (Connection connection = ConexionBD.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CARRERA_SQL)) {
            preparedStatement.setString(1, carrera.getNombre());
            preparedStatement.setString(2, carrera.getCodigo());
            preparedStatement.setInt(3, carrera.getCantidadSemestres());
            preparedStatement.executeUpdate();
        }
    }
}
