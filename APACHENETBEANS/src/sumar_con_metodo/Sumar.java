package sumar_con_metodo;

import java.util.Scanner;

public class Sumar {

    public static void main(String[] args) {
        //DEFINIR DATOS
        int suma;
        //ENTRADA
        int[] n = entrada();
        //PROCESO
        suma = sumar(n[0], n[1]);
        //SALIDA
        imprimir(suma);
    }

    //TIPO_RETORNO NOMBREFUNCION(PARAMETROS RECIBE)
    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static void imprimir(int suma) {
        System.out.println("Suma: " + suma);
    }

    public static int[] entrada() {
        Scanner sc = new Scanner(System.in);
        int[] n = {0, 0};
        System.out.print("Ingrese n1? ");
        n[0] = sc.nextInt();
        System.out.print("Ingrese n2? ");
        n[1] = sc.nextInt();
        return n;
    }

}
