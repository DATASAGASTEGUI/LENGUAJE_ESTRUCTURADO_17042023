package vector_dinamico;

import java.util.Scanner;

public class Letras_Sin_Salir_Aleatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[26];
        int n;
        char letra;
        int pos;
        
        System.out.print("Ingrese lanzamientos aleatorios? ");
        n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            letra = (char)(int)(Math.random()*26+65);
            System.out.print(letra + "  ");
            pos = (int)letra - 65;
            vector[pos] = 1;
        }
        System.out.println();
        for(int i=0; i<vector.length; i++) {
            if(vector[i] == 0) {
                letra = (char)(i + 65);
                System.out.print(letra + "  ");
            }
        }
    }
    
}
