package herencia_figurageometrica2d;

public class Triangulo extends FiguraGeometrica2D {

    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

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

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double area() {
        return this.base * this.altura / 2;
    }

    @Override
    public double perimetro() {
        return 3 * this.base;
    }

    @Override
    public String soy() {
        return "Triangulo";
    }

    @Override
    public void nada() {
        System.out.println("estoy probando nada triangulo");
    }

}
