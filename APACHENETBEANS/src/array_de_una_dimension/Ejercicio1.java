package array_de_una_dimension;

public class Ejercicio1 {

    public static void main(String[] args) {
       int j = 0;
       int[] num = new int[12];
       num[0] = 39;
       num[1] = -2;
       num[4] = 0;
       num[6] = 14;
       num[8] = 5;
       num[9] = 120;
       System.out.println("FOR");
       for(int i=0; i<num.length; i++) {
           System.out.println("num[" + i + "] = " + num[i]);
       }
       System.out.println("FOREACH");
       for(int numero: num) {
           System.out.println("num[" + j + "] = " + numero);
           j++;
       }
        
        
        
    }
    
}
