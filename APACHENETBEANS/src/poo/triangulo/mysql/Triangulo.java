package poo.triangulo.mysql;

public class Triangulo {

    //ATRIBUTOS: CARACTERISTICAS QUE DEFINEN AL OBJETO
    private int id;
    private double base;
    private double altura;
    //private double area; //Atributo Calculable

    //CONSTRUCTORES: INICIALIZAR CON VALORES LOS ATRIBUTOS DEL OBJETO
    public Triangulo() {
    }

    public Triangulo(int id, double base, double altura) {
        this.id = id;
        this.base = base;
        this.altura = altura;
    }

    //METODOS GET Y SET: ASIGNAR Y RECUPERAR VALORES DE UN OBJETO
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //OTROS

    @Override
    public String toString() {
        return "Triangulo{" + "id=" + id + ", base=" + base + ", altura=" + altura + '}';
    }

    public double area() {
        //return this.base * this.altura / 2;
        return this.getBase()*this.getAltura()/2;
    }

    public static void cabecera() {
        System.out.printf("%-3s  %6s  %-6s  %8s\n", "N", "BASE", "ALTURA", "AREA");
        System.out.printf("%-3s  %6s  %-6s  %8s\n", "-", "----", "------", "----");
    }
    
    public void cuerpo(int i) {
        System.out.printf("%-3d  %6.2f  %6.2f  %8.2f\n", i, this.getBase(), this.getAltura(), this.area());
    }

}
