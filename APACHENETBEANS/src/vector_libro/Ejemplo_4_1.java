package vector_libro;

import java.util.Scanner;

public class Ejemplo_4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        
        
        //DECLARAR Y DIMESION VECTOR(INICIALIZAR)
        int[] numeros = new int[10];
        //LLENAR EL VECTOR
        for(int i=0; i<numeros.length; i++) {
            System.out.print("Ingrese numero posicion " + i + " : ");
            numeros[i] = sc.nextInt();
        }
        //MOSTRAR
        for(int z: numeros) {
            System.out.print(z + "  ");
        }
        

    }
    
}
