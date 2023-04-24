package polimorfismo;

public class PrincipalPolimorfismo {

    public static void main(String[] args) {

        FiguraGeometrica2D[] vector = {
            new Triangulo(2.2, 3.1),
            new Circulo(1.5),
            new Triangulo(3.4, 2.6),
            new Rectangulo(7.7, 8.1),
            new Cuadrado(8.1),
            new Cuadrado(9.2)
        };
        //MOSTRAR EL AREA DE TODOS LOS OBJETOS TRIANGULOS
        for (int i = 0; i < vector.length; i++) {
            FiguraGeometrica2D fg = vector[i];
            if (fg instanceof Triangulo) {
                System.out.println("Area Triangulo: " + fg.area());
                System.out.println("Nº Dimensiones: " + fg.numeroDimension());
            }
        }

        //MOSTRAR EL AREA DE TODOS LOS OBJETOS
        for (int i = 0; i < vector.length; i++) {
            FiguraGeometrica2D fg = vector[i];
            System.out.println("Area " + fg.soy() + ": " + fg.area());
        }

    }

}
