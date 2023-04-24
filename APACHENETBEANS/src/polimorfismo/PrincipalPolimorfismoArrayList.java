package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalPolimorfismoArrayList {

    static Scanner sc = new Scanner(System.in);

    static List<FiguraGeometrica2D> listaObjetos = new ArrayList<FiguraGeometrica2D>();

    public static void main(String[] args) {

        String opcion = "";
        boolean salir = true;

        while (salir) {
            System.out.println("1. LLENAR EL ARRAYLIST");
            System.out.println("2. MOSTRAR TODOS LOS ELEMENTOS");
            System.out.println("3. LIMPIAR TODO EL ARRAYLIST");
            System.out.println("4. REMOVER TODOS LOS OBJETOS TRIANGULOS");
            System.out.println("5. REMOVER TODOS LOS OBJETOS CIRCULO Y CUADRADO");
            System.out.println("6. MOSTRAR SOLAMENTE OBJETOS TRIANGULO");
            System.out.println("7. MOSTRAR SOLAMENTE LOS OBJETOS QUE SUPEREN UN AREA DETERMINADA");
            System.out.println("8. AÑADIR OBJETOS DE UN TIPO DETERMINADO");
            System.out.println("9. SALIR");

            System.out.println("INGRESAR OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    llenarArrayListAleatoriamente();
                    break;
                case "2":
                    mostrarTodosElementosArrayList();
                    break;
                case "3":
                    //limpiarTodoArrayList();
                    break;
                case "4":
                    //removerTodosObjetosTriangulo();
                    break;
                case "5":
                    //removerTodosObjetosCirculoyCuadrado();
                    break;
                case "6":
                    //mostrarSoloObjetosTriangulo();
                    break;
                case "7":
                    //mostrarSoloObjetosSuperenAreaDeterminada();
                    break;
                case "8":
                    //anadirObjetosTipoDeterminado();
                    break;
                case "9":
                    salir = false;
            }
        };
        System.out.println("GRACIAS POR SU VISITA. ADIOS");
    }

    /*
    List<Integer> numeros = new ArrayList<Integer>();

    numeros.add (

    1);
    numeros.add (
    2);

        List<Triangulo> triangulos = new ArrayList<Triangulo>();

    triangulos.add (
    new Triangulo(3.4, 8.2));

        List<FiguraGeometrica2D> fg = new ArrayList<FiguraGeometrica2D>();

    fg.add (

    new Triangulo(2.2, 3.1));
    fg.add (

    new Circulo(1.5));
    fg.add (

    new Triangulo(3.4, 2.6));
    fg.add (

    new Rectangulo(7.7, 8.1));
    fg.add (

    new Cuadrado(8.1));
    fg.add (
    new Cuadrado(9.2));

    for (int i = 0;

    i< fg.size ();
    i

    
        ++) {
            FiguraGeometrica2D objetofg = fg.get(i);
        System.out.println("Area " + objetofg.soy() + ": " + objetofg.area());
    }
    //REMOVER TODOS LOS OBJETOS DEL ARRAYLISTE

    fg.clear ();

    if (fg.size () 
        > 0) {
            for (int i = 0; i < fg.size(); i++) {
            FiguraGeometrica2D objetofg = fg.get(i);
            System.out.println("Area " + objetofg.soy() + ": " + objetofg.area());
        }
    }

    
        else {
            System.out.println("ARRAYLIST VACIO");
    }
    //REMOVER SOLO LOS OBJETOS TRIANGULOS
     */
    public static void llenarArrayListAleatoriamente() {
        String[] v = {"Triangulo", "Cuadrado", "Circulo", "Rectangulo"};

        System.out.print("Número objetos crear? ");
        int nu = sc.nextInt();

        FiguraGeometrica2D fg = null;

        for (int i = 0; i < nu; i++) {
            int n = (int) (Math.random() * 4);

            if (v[n].equals("Triangulo")) {
                double base = Math.random() * 6;
                double altura = Math.random() * 6;
                fg = new Triangulo(base, altura);
            }

            if (v[n].equals("Circulo")) {
                double radio = Math.random() * 6;
                fg = new Circulo(radio);
            }

            if (v[n].equals("Cuadrado")) {
                double lado = Math.random() * 6;
                fg = new Cuadrado(lado);
            }

            if (v[n].equals("Rectangulo")) {
                double largo = Math.random() * 6;
                double ancho = Math.random() * 6;
                fg = new Rectangulo(largo, ancho);
            }
            listaObjetos.add(fg);

        }
        System.out.println("OBJETO CREADO Y AÑADIO ARRAYLIST");
    }

    public static void mostrarTodosElementosArrayList() {

    }

    public static void removerTodosObjetosTriangulo() {
        List<FiguraGeometrica2D> objetosRemover = new ArrayList<>();
        for (FiguraGeometrica2D fg : listaObjetos) {
            if (fg instanceof Triangulo) {
                objetosRemover.add(fg);
            }
        }
        listaObjetos.removeAll(objetosRemover);
    }

    public static void removerTodosObjetosTriangulo1() {
        for (int i = 0; i < listaObjetos.size(); i++) {
            FiguraGeometrica2D fg = null;
            if (fg instanceof Triangulo) {
                listaObjetos.remove(fg);
                i--;
            }
        }
    }

    public static void removerTodosObjetosCirculoyCuadrado() {
        List<FiguraGeometrica2D> objetosRemover = new ArrayList<>();

        for (FiguraGeometrica2D fg : listaObjetos) {
            if (fg instanceof Circulo || fg instanceof Cuadrado) {
                objetosRemover.add(fg);
            }
        }
        listaObjetos.removeAll(objetosRemover);

    }

    public static void mostrarSoloObjetosSuperenAreaDeterminada() {
        double areaMostrar = 2.00;
        for (int i = 0; i < listaObjetos.size(); i++) {
            FiguraGeometrica2D fg = null;
            if (fg.area() > areaMostrar) {
                System.out.println(fg);
            }
        }
    }
}
