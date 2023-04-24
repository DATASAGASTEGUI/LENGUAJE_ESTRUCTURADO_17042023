package archivos_csv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalMenu {

    static String url = "jdbc:mysql://localhost:3306/";
    static String usuario = "root";
    static String clave = "";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    static String query = "";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.print("\nMENU");
            System.out.print("\n====");
            System.out.print("\n(1) CREAR UNA BASE DE DATOS");
            System.out.print("\n(2) MOSTRAR UN LISTADO DE TODAS LAS BASE DE DATOS QUE EXISTEN");
            System.out.print("\n(3) VERIFICAR SI UNA BASE DE DATOS EXISTE");
            System.out.print("\n(4) ELIMINAR UNA BASE DE DATOS");
            System.out.print("\n(5) CREAR UNA TABLA");
            System.out.print("\n(6) ELIMINAR UNA TABLA");
            System.out.print("\n(7) LLENAR UNA TABLA CON LOS DATOS DE UN ARCHIVO CSV");
            System.out.print("\n(8) MOSTRAR TODOS LOS REGISTROS DE UNA TABLA");
            System.out.print("\n(0) SALIR\n");

            System.out.print("Ingrese opción: ");
            String opcion = sc.next();

            switch (opcion) {
                case "1":
                    opcion1();
                    pause();
                    break;
                case "2":
                    opcion2();
                    break;
                case "3":
                    opcion3();
                    break;
                case "4":
                    opcion4();
                    break;
                case "5":
                    opcion5();
                    break;
                case "6":
                    opcion6();
                    break;
                case "7":
                    opcion7();
                    break;
                case "8":
                    opcion8();
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        }

    }

    public static void opcion1() {
        System.out.println("(1) CREAR UNA BASE DE DATOS");
        System.out.println("---------------------------");
        System.out.print("Ingrese nombre base datos? ");
        String database = sc.next();

        query = "CREATE DATABASE " + database + ";";
        Connection conexion = getConexion("");

        if (conexion != null) {
            if (ejecutarQuery(query, conexion)) {
                System.out.println("OK 1");
            } else {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public static void opcion2() {
        System.out.println("(2) MOSTRAR UN LISTADO DE TODAS LAS BASE DE DATOS QUE EXISTEN");
        System.out.println("-------------------------------------------------------------");

        Connection conexion = getConexion("");
        if (conexion != null) {

            try {
                DatabaseMetaData dmd = (DatabaseMetaData) conexion.getMetaData();
                ResultSet rs = dmd.getCatalogs();
                while (rs.next()) {
                    String bd = rs.getString(1);
                    System.out.println(bd);
                }

            } catch (SQLException e) {
                System.out.println("ERROR: CATALOGO");
            }

        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

    public static void opcion3() {
        List<String> basesdatos = new ArrayList<String>();
        
        Connection conexion = getConexion("");
        if (conexion != null) {

            try {
                DatabaseMetaData dmd = (DatabaseMetaData) conexion.getMetaData();
                ResultSet rs = dmd.getCatalogs();
                while (rs.next()) {
                    String bd = rs.getString(1);
                    basesdatos.add(bd);
                }
                
                System.out.print("INGRSE BASE DE DATOS A BUSCAR? ");
                String dato = sc.next();
                
                if(basesdatos.contains(dato)) { //in Python
                    System.out.print("SI");
                }else {
                    System.out.print("NO");
                }

            } catch (SQLException e) {
                System.out.println("ERROR: CATALOGO");
            }

        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public static void opcion4() {
    }

    public static void opcion5() {
    }

    public static void opcion6() {
    }

    public static void opcion7() {
    }

    public static void opcion8() {
    }

    public static Connection getConexion(String db) {
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(url + db, usuario, clave);
            return conexion;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static boolean ejecutarQuery(String query, Connection conexion) {
        try {
            ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void pause() {
        try {
            System.out.print("\nPRESIONA UNA TECLA PARA CONTINUAR...");
            System.in.read();
        } catch (IOException e) {
        }
    }

}
