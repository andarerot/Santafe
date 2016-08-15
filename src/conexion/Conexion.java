/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;

/**
 *
 * @author Familia
 */
public class Conexion {

    private Connection conexion = null;

    public Connection crearConexion() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Derby driver not found.");
            cnfe.printStackTrace();
        }
        try {
            String url = "jdbc:derby://localhost:1527/Santafe";
            String user = "Santafe";
            String pass = "Santafe";
            this.conexion = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return this.conexion;
        }
    }

    public void cerrarConexion(){
        try {
            this.conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
