package vector_dinamico;

import java.util.Scanner;

public class Matriz_LLenar_Numeros_Aleatorios {

    public static void main(String[] args) {
        //DECLARACION MATRIZ
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        int[][] matriz;
        int a = 0;

        //DIMENSION MATRIZ
        System.out.print("Numero Filas: ");
        filas = sc.nextInt();
        System.out.print("Numero Columnas: ");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];

        //LLENAR MATRIZ
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 6 + 1);
            }
        }
        /*
        //MOSTRAR MATRIZ
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        //SUMAR LA DIAGONAL
        a = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    a = a + matriz[i][j];
                }
            }
        }
        System.out.println("Sumar Diagonal: " + a);

        //SUMAR LOS NUMEROS DEBAJO DE LA DIAGONAL
        a = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i > j) {
                    a = a + matriz[i][j];
                }
            }
        }
        System.out.println("Sumar Debajo Diagonal: " + a);

        //CONVERTIR LA MATRIZ A UNA MATRIZ IDENTIDAD
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
         */
        //INTERCAMBIAR FILAS X COLUMNAS
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

    }

}
