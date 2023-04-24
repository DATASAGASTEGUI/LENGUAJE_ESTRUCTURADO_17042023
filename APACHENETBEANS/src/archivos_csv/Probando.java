package archivos_csv;

import java.util.Set;
import java.util.TreeSet;

public class Probando {

    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();
        ts.add("Hola");
        ts.add("Hola");
        ts.add("como");
        ts.add("hola");
        System.out.print(ts);
        
        for(String s: ts) {
            System.out.println(s);
        }
    }
    
}
