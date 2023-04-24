package vector_dinamico;

import java.util.Scanner;

public class Gestion_Vector_Dinamico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int numero;
        // DECLARACION DE UNA VARIABLE VECTOR
        int[] x;

        // DEFINIR LA DIMENSION DEL VECTOR
        System.out.print("Ingrese tamaño vector? ");
        n = sc.nextInt();
        x = new int[n];

        // LLENAR EL VECTOR DINAMICO
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese número posición " + i + ":");
            x[i] = sc.nextInt();
        }

        // RECORRER VECTOR PARA MOSTRARLO
        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }

}
