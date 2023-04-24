package poo.alumno;

public class Principal {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Jaime",30,1.80,true,'H');
        Alumno a2 = new Alumno();
        
        System.out.println("Nombre a1 : " + a1.getNombre());
        a2.setNombre("Jose");
        System.out.println("Nombre a2 : " + a2.getNombre());
        
        System.out.println(a1);
        System.out.println(a1.toString());
        
        System.out.println(a1.evaluarEdad());
        
        //VECTOR DE UN TIPO DE DATO
        int[] ventero = {1,3};
        
        Alumno[] vobjetos = {a1,a2};
        
        for(Alumno a: vobjetos) {
            System.out.println(a.evaluarEdad());
        }
        
        
       
    }
}
