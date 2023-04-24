package vector_dinamico;

import java.util.Scanner;


public class Vector_Dinamico_Letras_Aleatorias {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n;
       char letras[];
        
       System.out.print("Ingrese tamaño vector? ");
       n = sc.nextInt();
       letras = new char[n];
       // LLENAR VECTOR
       for(int i=0; i<n; i++) {
           letras[i] = (char)(int)(Math.random()* 27 + 65);
       }
       // MOSTRAR VECTOR
       for(int i=0; i<n; i++) {
           System.out.println("Letra: " + letras[i] + ":" + (int)letras[i]); 
       }
       
       
       
    }
    
}
