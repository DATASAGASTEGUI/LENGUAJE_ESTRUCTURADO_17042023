package arraylist_alumno;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
       //1.OBTENER TODOS LOS REGISTROS DE UNA TABLA COMO UNA LISTA DE OBJETOS
       //DatosAlumno da = new DatosAlumno();
       
       List<Alumno> alumnos_al = DatosAlumno.getListaObjetosAlumno();
       
       //2. MOSTRAR TODOS LOS OBJETOS COMO UNA TABLA
       for(int i=0; i<alumnos_al.size(); i++) {
           Alumno objetoAlumno = alumnos_al.get(i);
           System.out.println(objetoAlumno);
       }
       
       
    }
    
}
