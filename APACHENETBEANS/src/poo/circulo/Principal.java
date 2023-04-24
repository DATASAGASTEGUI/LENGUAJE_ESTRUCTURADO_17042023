package poo.circulo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Circulo c;
        System.out.print("Cantidad objetos circulo? ");
        n = sc.nextInt();
        Circulo[] circulos = new Circulo[n];
        //LLENAR
        for(int i=0; i<n; i++) {
            circulos[i] = new Circulo(Math.random()*100+1);
        }
        //MOSTRAR
        Circulo.cabecera();
        for(int i=0; i<n; i++) {
            c = circulos[i];
            c.cuerpo(i);
        }
      
    }
    
}
