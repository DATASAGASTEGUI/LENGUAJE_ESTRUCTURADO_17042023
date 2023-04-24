package ecuacion_cuadratica_sin_metodo;

import java.util.Scanner;

public class SolucionCuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEFINIR DATOS
        int a, b, c;
        double x1, x2, d;
        //ENTRADA
        System.out.print("Ingrese A? ");
        a = sc.nextInt();
        System.out.print("Ingrese B? ");
        b = sc.nextInt();
        System.out.print("Ingrese C? ");
        c = sc.nextInt();
        //PROCESO - SALIDA
        //AX^2 + BX + C = 0
        if (a != 0) {
            d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("NO SOLUCION REAL");
            } else {
                x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        } else {
            System.out.println("NO ES ECUACION CUADRATICA");
        }
    }

}
