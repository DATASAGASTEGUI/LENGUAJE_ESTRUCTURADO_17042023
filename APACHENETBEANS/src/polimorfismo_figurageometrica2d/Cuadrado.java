package polimorfismo_figurageometrica2d;

public class Cuadrado extends FiguraGeometrica2D {
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public double area() {
        return Math.pow(this.lado,2);
    }

    @Override
    public double perimetro() {
        return 4 * this.lado;
    }

    @Override
    public String soy() {
        return "Cuadrado";
    }
    
}
