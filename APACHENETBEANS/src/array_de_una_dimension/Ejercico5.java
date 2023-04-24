package array_de_una_dimension;

import java.util.Scanner;

public class Ejercico5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Por favor introduzca 10 numeros guapeton");
            array[i] = sc.nextInt();

        }
        int max = array[0];
        int min = array[0];
        
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                System.out.println("Array [" + i + "]" + array[i] + " Maximo");
            } else if (min == array[i]) {
                System.out.println("Array [" + i + "]= " + array[i] + " Minimo");
            } else {
                System.out.println("Array [" + i + "]=" + array[i]);
            }
        }
    }

}
