package poo.alumno;

public class Alumno {

    //ATRIBUTOS = VARIABLES DE INSTANCIA
    private String nombre;
    private int edad;
    private double estatura;
    private boolean casado;
    private char sexo;
    //private Coche coche;
    
    
    
    //CONSTRUCTOR
    public Alumno() {
    }

    public Alumno(String nombre, int edad, double estatura, boolean casado, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.casado = casado;
        this.sexo = sexo;
    }

    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //OTROS
    @Override
    public String toString() {
        return "Nombre  : " + nombre + "\n" +
               "Edad    : " + edad + "\n" +
               "Estatura: " + estatura + "\n" +
               "Casado  : " + casado + "\n" +
               "Sexo    : " + sexo + "\n";
    }
    
    public String evaluarEdad() {
        if(this.edad > 18) {
            return "Mayor Edad".toUpperCase();
        }else {
            return "Menor Edad";
        }
    }

}
