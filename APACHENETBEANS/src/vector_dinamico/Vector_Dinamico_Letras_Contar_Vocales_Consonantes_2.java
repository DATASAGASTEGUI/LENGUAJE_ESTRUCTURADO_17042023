package vector_dinamico;

import java.util.Scanner;

public class Vector_Dinamico_Letras_Contar_Vocales_Consonantes_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int n;
        char letras[];
        int con = 0, voc = 0;
        String erc = "[^AEIOU]";

        System.out.print("Ingrese tamaño vector? ");
        n = sc.nextInt();
        letras = new char[n];
        // LLENAR VECTOR
        for (int i = 0; i < n; i++) {
            letras[i] = (char) (int) (Math.random() * 26 + 65);
            System.out.print((char) letras[i] + "  ");
            x = letras[i] + "";
            if (x.matches(erc)) {
                con++;
            } else {
                voc++;
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
