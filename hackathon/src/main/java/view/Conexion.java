
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://hackaton.ckgwgdhfhtuy.us-east-1.rds.amazonaws.com:3306/CODESOLUTIONS";
    private static final String USER = "admin";
    private static final String PASSWORD = "yolanda2422mateo";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    // Método para obtener la conexión
    public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return connection;
        }
        try {
            Class.forName(DRIVER); // Cargar el driver de MySQL
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONEXIÓN ESTABLECIDA");
        } catch (SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
            throw new SQLException("No se pudo establecer conexión con la base de datos", e);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver no encontrado: " + e.getMessage());
            throw new ClassNotFoundException("No se pudo cargar el driver de MySQL", e);
        }
        return connection;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("CONEXIÓN CERRADA");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    // Método principal para probar la conexión
    public static void main(String[] args) {
        try {
            obtenerConexion();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                cerrarConexion();
            } catch (Exception e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

}
