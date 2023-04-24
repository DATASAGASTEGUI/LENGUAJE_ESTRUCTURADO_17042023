package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {

    public void llenarTablaTriangulo(Connection conexion) throws SQLException {
        String query = "INSERT INTO Triangulo(base,altura) VALUES(?,?)";
        if (conexion != null) {
            for (int i = 0; i < 100; i++) {
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setDouble(1, (Math.random()*10 + 1));
                ps.setDouble(2, (Math.random()*10 + 1));
                ps.executeUpdate();
            }
        }else {
            System.out.println("NO HAY CONEXION");
        }

    }

}
