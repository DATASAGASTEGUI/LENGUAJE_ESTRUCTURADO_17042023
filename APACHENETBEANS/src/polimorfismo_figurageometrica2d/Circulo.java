package polimorfismo_figurageometrica2d;

public class Circulo extends FiguraGeometrica2D {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
       return Math.PI * Math.pow(this.radio,2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String soy() {
        return "Circulo";
    }

}
