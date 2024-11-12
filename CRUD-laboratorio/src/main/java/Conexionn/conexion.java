package Conexionn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    String URL = "jdbc:mysql://crud-laboratorio.clkuym08mzj4.us-east-1.rds.amazonaws.com:3306/profesores?allowPublicKeyRetrieval=true&useSSL=false";
    static String USER = "admin";
    static String PASSWORD = "yolanda2422mateo";

    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error clase conexion : " + e.getMessage());
        }

    }

    public Connection getConection() {
        return con;
    }

    public void getdemo() {

    }
}
