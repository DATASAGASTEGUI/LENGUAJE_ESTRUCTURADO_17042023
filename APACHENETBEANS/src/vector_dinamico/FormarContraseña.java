package vectordinamico;

import java.util.Scanner;

//Clase que te hace las contraseñas que quieras y del numero de caracteres que quieras
public class FormarContraseña {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num, caracter;
        String password = "";
        String letras;
        char letra;
        System.out.println("Cuantas contraseñas necesitas");
        num = Entrada.nextInt();

        System.out.println("Cuantos caracteres seran las contraseñas");
        caracter = Entrada.nextInt();

        String[] pass = new String[num];

        for (int i = 0; i < num; i++) {
            password = "";
            for (int x = 0; x < caracter; x++) {
                letra = (char) (int) (Math.random() * 26 + 65);
                letras = letra + "";
                password = password + letras;
                pass[i] = password;

            }
            System.out.print("Constraseña " + (i + 1) + ": " + pass[i]);
            System.out.println(" ");
        }

    }

}
