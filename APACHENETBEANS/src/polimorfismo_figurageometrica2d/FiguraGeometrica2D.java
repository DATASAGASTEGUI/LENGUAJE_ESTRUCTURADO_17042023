package polimorfismo_figurageometrica2d;


public abstract class FiguraGeometrica2D {
    
    public abstract double area();
    public abstract double perimetro();
    public abstract String soy();
    public String numeroDimension() {
        return "Dos dimensiones";
    }
    
}
