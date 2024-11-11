package Conexionn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    String URL = "jdbc:mysql://localhost:3306/CRUDaixa?allowPublicKeyRetrieval=true&useSSL=false";
    static String USER = "root";
    static String PASSWORD = "admin";

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
