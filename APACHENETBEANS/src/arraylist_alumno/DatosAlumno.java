
package arraylist_alumno;

import java.util.ArrayList;
import java.util.List;

public class DatosAlumno {
    
    static int[] id = {1, 2, 3, 4, 5, 6};
    static String[] nombre = {"Miguel","Carlos","Cesar","Sylvia","María","Arturo"};
    static double[] estatura = {1.70,1.71,1.72,1.73,1.74,1.75};
    static boolean[] casado = {true,false,true,false,true,false};
    
    /*
    ID   NOMBRE ESTATURA   CASADO
    --   ------ --------   ------
     1   Miguel 1.71       true     
     2   Carlos 1.72       false
    ...
    */
    
    public static List<Alumno> getListaObjetosAlumno() {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        for(int i=0; i<id.length; i++) {
            Alumno objetoAlumno = new Alumno(id[i],nombre[i],estatura[i],casado[i]);
            alumnos_al.add(objetoAlumno);
        }
        return alumnos_al;
    }
    
    
    
}
