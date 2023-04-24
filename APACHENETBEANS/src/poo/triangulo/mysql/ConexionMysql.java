package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {

    private Connection conexion;

    static final String PROTOCOLO = "jdbc:mysql";
    static final String SERVERNAME = "localhost"; //127.0.0.1
    static final String PORT = "3306";
    static final String DATABASE = "BDGEOMETRIA";
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    static final String URL = PROTOCOLO + "://" + SERVERNAME + ":" + PORT + "/" + DATABASE;
    static final String USUARIO = "root";
    static final String CLAVE = "";

    public ConexionMysql() throws ClassNotFoundException {
        setConexion();
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion() throws ClassNotFoundException {
        try {
            Class.forName(DRIVER);//Registrar Driver
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);//Conexion
        } catch (SQLException e) {
            conexion = null;
        }
    }
}

/*
LEYENDA:
static final String URL = "jdbc:mysql://localhost:3306/BDGEOMETRIA";
 */
