package array_de_una_dimension;

public class Ejercicio4 {


    public static void main(String[] args) {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        
        for(int i=0; i<20; i++){
            numero[i]= (int)(Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }
        
        System.out.printf("%8s  %10s  %6s \n" , "Numero",  "Cuadrado","Cubo");
        System.out.printf("%8s  %10s  %6s \n" , "------",  "--------","----");
    
        for(int i=0; i<20; i++){
            System.out.printf("%8d  %10d  %6d \n" ,numero[i] ,  cuadrado[i],cubo[i]);
        }
    }
    
}
