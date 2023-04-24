package array_de_una_dimension;

public class Ejercicio2 {

    public static void main(String[] args) {
        String acu = "";
        char[] simbolo = new char[9];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        for(int i=0; i<simbolo.length; i++) {
          System.out.println("simbolo[" + i + "] = " + simbolo[i]);  
        }
        
        for(int i=0; i<simbolo.length; i++) {
            acu = acu + simbolo[i];
        }
        System.out.println("Cadena: " + acu);
        
        System.out.println((int)simbolo[5]);
        
        
    }
    
}
