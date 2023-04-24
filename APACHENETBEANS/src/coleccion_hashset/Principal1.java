package coleccion_hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal1 {

    public static void main(String[] args) {
       //Set<Integer> numeros = new HashSet<Integer>();
       Set<Integer> numeros = new TreeSet<Integer>();
       //MOSTRAR TODOS LOS NUMEROS DISTINTOS GENERADOS
       for(int i=0; i<15; i++) {
           numeros.add((int)(Math.random()*30 + 1)); //[1,30]
       }
       
       System.out.println("Lista:" + numeros);
       
       
       
       
    }

}
