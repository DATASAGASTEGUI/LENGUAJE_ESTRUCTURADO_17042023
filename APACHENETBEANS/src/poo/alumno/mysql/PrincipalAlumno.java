package poo.alumno.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalAlumno {

    public static void main(String[] args) {
        String query = "SELECT * FROM Alumno";
        PreparedStatement ps = null;
        try {
            String url = "jdbc:mysql://localhost:3306/INSTITUTO";
            String usuario = "root";
            String clave = "";

            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String nombre = rs.getString(2);
                    int edad = rs.getInt(3);
                    double estatura = rs.getDouble(4);
                    boolean casado = rs.getBoolean(5);
                    String sexo = rs.getString(6);
                    // Clase: Alumno
                    // Variable: alumno
                    Alumno variable_alumno = new Alumno(nombre, edad, estatura, casado, sexo.charAt(0));
                   // alumno.setId(id);
                   // System.out.println(alumno + "  " + alumno.evaluarEdad() );
                   System.out.println(id + ";" + nombre + ";" + edad);
                }

            } else {
                System.out.println("ERROR CONEXION");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PrincipalAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
