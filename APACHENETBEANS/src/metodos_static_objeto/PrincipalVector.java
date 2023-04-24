package metodos_static_objeto;

import java.util.Scanner;
import wisl.MetodosUtil;

public class PrincipalVector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int v[];
        
        System.out.print("Ingrese tamaño vector? ");
        n = sc.nextInt();
        
        v = new int[n];
        // LLENAR EL VECTOR CON NUMEROS ALEATORIOS 1,6
        for(int i=0; i<n; i++) {
            v[i] = (int) (Math.random()*6 + 1);
        }
        
        System.out.println("Promedio: " + MetodosUtil.promedioVector(v));
        
        
    }
    
}
