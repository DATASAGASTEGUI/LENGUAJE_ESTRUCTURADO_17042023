package archivos_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MigrarCsvBaseDatos {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String clave = "";
        Connection conexion = null;
        String nra = "data/transacciones.csv";
        String fila = "";
        
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);
            
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            int i = 0;
            while((fila = br.readLine()) != null){
                String[] partes = fila.split(";");
                if(i != 0){
                    Transacciones t = new Transacciones(Integer.parseInt(partes[0]),
                                                        partes[1],
                                                        partes[2],
                                                        Double.parseDouble(partes[3]),
                                                        partes[4],
                                                        partes[5]);
                    String query = "INSERT INTO Transaccion(ciudad,zona,ventas,formaPago,categoria) VALUES (?,?,?,?,?)";
                    PreparedStatement ps = conexion.prepareStatement(query);
                    ps.setString(1, t.getCiudad());
                    ps.setString(2, t.getZona());
                    ps.setDouble(3, t.getVentas());
                    ps.setString(4, t.getFormaPago());
                    ps.setString(5, t.getCategoria());
                    ps.executeUpdate();
                }
                i++;
            }
            

            //String query1 = "CREATE DATABASE IF NOT EXISTS VENTAS2";
            /*String query1 = "CREATE DATABASE VENTAS3";
            PreparedStatement ps1 = conexion.prepareStatement(query1);
            ps1.executeUpdate();*/
            //ps1.close();


            /*
            conexion = DriverManager.getConnection(url, usuario, clave);

            String query1 = "CREATE DATABASE IF NOT EXISTS VENTAS1";
            Statement ps1 = conexion.createStatement();
            ps1.executeUpdate(query1);
            ps1.close();
             */
 /*
            String query = "CREATE TABLE Transaccion (\n"
                    + "  idTransaccion   INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,\n"
                    + "  ciudad          VARCHAR(25) NOT NULL,\n"
                    + "  zona            VARCHAR(25) NOT NULL,\n"
                    + "  ventas          DOUBLE      NOT NULL,\n"
                    + "  formaPago       VARCHAR(25) NOT NULL,\n"
                    + "  categoria       VARCHAR(25) NOT NULL\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
             
             
            System.out.println("OK");*/
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }

    }

}
