package vector_dinamico;

import java.util.Scanner;

public class Vector_Dinamico_Letras_Contar_Vocales_Consonantes_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x;
        int n;
        char letras[];
        int con = 0, voc = 0;

        System.out.print("Ingrese tamaño vector? ");
        n = sc.nextInt();
        letras = new char[n];
        // LLENAR VECTOR
        for (int i = 0; i < n; i++) {
            letras[i] = (char) (int) (Math.random() * 26 + 65);
            System.out.print((char)letras[i] + "  ");
            x = letras[i];
            if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                voc++;
            } else {
                con++;
            }
        }
        if (voc > con) {
            System.out.println("\nVocales Mayor " + voc);
        } else if (voc < con) {
            System.out.println("\nConsonantes Mayor " + con);
        } else {
            System.out.println("\nVocales y Consonantes Iguales " + voc);
        }
    }

    
    
}
