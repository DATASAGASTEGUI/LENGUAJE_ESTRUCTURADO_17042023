package operadores_binarios;

import java.util.Scanner;

public class Crear_Mascara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //DEFINIR DATOS
        int subredes;
        double calculo;
        int n = 0;
        
        System.out.print("Ingresear el número de subredes: ");
        subredes = sc.nextInt();
        
        for(int i=1; i<10; i++) {
           calculo = Math.pow(2,i);
           if(calculo >= subredes) {
               n = i;
               break;
           }
        }
        System.out.println("N: " + n);
        
    }
    
}
