package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        //LLENAR EL VECTOR
        for (int i = 0; i < 10; i++) {
            System.out.print("v[" + i + "] = ");
            v[i] = sc.nextInt();
        }
        //MOSTRAR INVERTIDO
        for(int i=v.length-1; i>=0; i--) {
            System.out.print(v[i] + "  ");
        }
    }
}
