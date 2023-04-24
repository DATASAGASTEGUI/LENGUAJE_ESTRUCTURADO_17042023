package herencia_figurageometrica2d;

public class Rectangulo extends FiguraGeometrica2D {
    
    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }

    @Override
    public double area() {
        return this.largo * this.ancho;
    }

    @Override
    public double perimetro() {
        return 2 * this.largo + 2 * this.ancho;
    }

    @Override
    public String soy() {
        return "Rectangulo";
    }
    
    
}
