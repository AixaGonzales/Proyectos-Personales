package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexiondb {
    static String URL = "jdbc:mysql://dbformulario-pregunta.clkuym08mzj4.us-east-1.rds.amazonaws.com:3306/pregunta?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    static String USER = "admin";
    static String PASSWORD = "yolanda2422mateo";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de la base de datos: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}
