package valor_referencia;

public class Principal3 {

    public static void main(String[] args) {
       System.out.println("DARLE VALORES A LOS ATRIBUTOS");
       Alumno a = new Alumno();
       entradaValoresAtributos(a);
       
       
       System.out.println("MOSTRAR LOS VALORES DE LOS ATRIBUTOS");
       mostrarValoresAtributos(a);
        
    }
    
    public static void entradaValoresAtributos(Alumno a) {
        a.setId(5);
        a.setNombre("Luis");
    }
    
    public static void mostrarValoresAtributos(Alumno a) {
        System.out.println("Id      : " + a.getId());
        System.out.println("Nombre : " + a.getNombre());
    }
}

class Alumno {
    
    private int id;
    private String nombre;

    public Alumno() {
    }

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}





