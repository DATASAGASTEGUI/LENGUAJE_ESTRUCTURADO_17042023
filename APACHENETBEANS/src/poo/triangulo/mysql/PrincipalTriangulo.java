package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalTriangulo {

    public static void main(String[] args) {
        String query1 = "INSERT INTO Triangulo(base,altura) VALUES(?,?)";
        String query2 = "SELECT * FROM Triangulo";
        PreparedStatement ps = null;
        try {
            String url = "jdbc:mysql://localhost:3306/BDGEOMETRIA";
            String usuario = "root";
            String clave = "";

            Connection conexion = DriverManager.getConnection(url, usuario, clave);

            if (conexion != null) {
                //INSERT
                ps = conexion.prepareStatement(query1);
                for (int i = 0; i < 100; i++) {
                    ps.setDouble(1, 3.45);
                    ps.setDouble(2, 1.3);
                    ps.executeUpdate(); //INSERT
                    System.out.println("INSERT OK");
                }
                
                //SELECT
                ps = conexion.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();//SELECT
                Triangulo.cabecera();
                while(rs.next()) {
                    int id = rs.getInt(1);
                    double base = rs.getDouble(2);
                    double altura = rs.getDouble(3);
                    Triangulo t = new Triangulo(id,base,altura);
                    t.cuerpo(id);//t.cuerpo(t.getId());
                    
                    
                }
                
                
                
            } else {
                System.out.println("ERROR CONEXION");
            }

        } catch (SQLException e) {
            System.out.print("ERROR CONEXION" + e);
        }

    }

}
