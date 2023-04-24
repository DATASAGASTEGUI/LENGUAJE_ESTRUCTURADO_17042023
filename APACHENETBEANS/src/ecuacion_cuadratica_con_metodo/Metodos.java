package ecuacion_cuadratica_con_metodo;

import java.util.Scanner;

public class Metodos {

    public static int[] entrada() {
        Scanner sc = new Scanner(System.in);
        int[] n = {0, 0, 0};
        System.out.print("Ingrese A? ");
        n[0] = sc.nextInt();
        System.out.print("Ingrese B? ");
        n[1] = sc.nextInt();
        System.out.print("Ingrese C? ");
        n[2] = sc.nextInt();
        return n;
    }

    public static String proceso(int a, int b, int c) {
        double d, x1, x2;
        String resultado;
        if (a != 0) {
            d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                resultado = "NO SOLUCION REAL";
            } else {
                x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                resultado = "X1: " + x1 + "\n" + "X2: " + x2;
            }
        } else {
            resultado = "NO ES ECUACION CUADRATICA";
        }
        return resultado;
    }

    public static void salida(String resultado) {
        System.out.println(resultado);
    }

}
