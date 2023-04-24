package arraylist_alumno;

public class Alumno {
    
    // ATRIBUTOS
    private int id;
    private String nombre;
    private double estatura;
    private boolean casado;

    // CONSTRUCTORES
    public Alumno() {
    }

    public Alumno(int id, String nombre, double estatura, boolean casado) {
        this.id = id;
        this.nombre = nombre;
        this.estatura = estatura;
        this.casado = casado;
    }
    
    // METODOS GET Y SET

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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    
    // OTROS METODOS

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", estatura=" + estatura + ", casado=" + casado + '}';
    }
    
}
