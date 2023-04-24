package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class PrincipalMenu {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        
        //CREAR CONEXION JDBC
        ConexionMysql cm = new ConexionMysql();
        Connection conexion = cm.getConexion();
        //CREAR UN OBJETO DE LA CLASE CRUD
        Crud crud = new Crud();

        while (true) {
            System.out.println("(1) LLENAR TABLA TRIANGULO");//Create
            System.out.println("(2) MOSTRAR TABLA TRIANGULO");//Read
            System.out.println("(3) SALIR");

            System.out.print("INGRESE OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1": crud.llenarTablaTriangulo(conexion);
                    break;
                case "2":
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
        
        

    }

}
