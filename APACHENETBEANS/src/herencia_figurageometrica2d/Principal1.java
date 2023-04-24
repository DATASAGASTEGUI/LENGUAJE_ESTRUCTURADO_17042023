package herencia_figurageometrica2d;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        /*
        Cuadrado cu = new Cuadrado(5);
        cu.nada();

        //System.out.prinln()
        List<FiguraGeometrica2D> lista = new ArrayList<FiguraGeometrica2D>();
        
        lista.add(new Cuadrado(2));
        lista.add(new Triangulo(5,6));
         */

        Circulo ci1 = new Circulo(2);
        Cuadrado cu1 = new Cuadrado(3);

        Triangulo t1 = new Triangulo(2, 3);
        Rectangulo r1 = new Rectangulo(5, 6);

        System.out.println("Circulo");
        ci1.nada();
        System.out.println("Cuadrado");
        cu1.nada();

        t1.nada();
        r1.nada();

    }

}
