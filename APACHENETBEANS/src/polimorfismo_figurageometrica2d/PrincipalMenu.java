package polimorfismo_figurageometrica2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrincipalMenu {

    static Scanner sc = new Scanner(System.in);

    static List<FiguraGeometrica2D> objetosfg_al = new ArrayList<FiguraGeometrica2D>();

    static String[] v = {"Triangulo", "Cuadrado", "Circulo", "Rectangulo"};

    public static void main(String[] args) {
        String opcion = "";
        boolean salir = true;

        while (salir) {
            MetodoMenu.cls();
            System.out.println("1. LLENAR EL ARRAYLIST CON OBJETOS ALEATORIOS");
            System.out.println("2. MOSTRAR TODOS LOS OBJETOS DEL ARRAYLIST");
            System.out.println("3. REMOVER TODOS LOS OBJETOS DEL ARRAYLIST");
            System.out.println("4. REMOVER TODOS LOS OBJETOS TRIANGULO EN EL ARRAYLIST");
            System.out.println("5. REMOVER TODOS LOS OBJETOS CIRCULO Y CUADRADO EN EL ARRAYLIST");
            System.out.println("6. MOSTRAR SOLAMENTE OBJETOS TRIANGULO PRESENTES EN EL ARRAYLIST");
            System.out.println("7. MOSTRAR SOLAMENTE LOS OBJETOS QUE SUPEREN UN AREA DETERMINADA");
            System.out.println("8. AÑADIR OBJETOS DE UN TIPO DETERMINADO");
            System.out.println("9. SALIR");

            System.out.println();

            System.out.print("INGRESAR OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    MetodoMenu.cls();
                    llenarArrayListAleatoriamente();
                    MetodoMenu.pause();
                    break;
                case "2":
                    MetodoMenu.cls();
                    mostrarTodosElementosArrayList();
                    MetodoMenu.pause();
                    break;
                case "3":
                    MetodoMenu.cls();
                    removerTodoObjetosArrayList();
                    MetodoMenu.pause();
                    break;
                case "4":
                    MetodoMenu.cls();
                    removerTodosObjetosTrianguloArryList();
                    MetodoMenu.pause();
                    break;
                case "5":
                    MetodoMenu.cls();
                    removerTodosObjetosCirculoyCuadradoArrayList();
                    MetodoMenu.pause();
                    break;
                case "6":
                    MetodoMenu.cls();
                    mostrarSoloObjetosTrianguloArrayList();
                    MetodoMenu.pause();
                    break;
                case "7":
                    MetodoMenu.cls();
                    mostrarSoloObjetosSuperenAreaDeterminada();
                    MetodoMenu.pause();
                    break;
                case "8":
                    MetodoMenu.cls();
                    anadirObjetosTipoDeterminado();
                    MetodoMenu.pause();
                    break;
                case "9":
                    salir = false;
            }
        };
        System.out.println("GRACIAS POR SU VISITA. ADIOS");
    }

    public static void llenarArrayListAleatoriamente() {
        System.out.println("1. LLENAR EL ARRAYLIST CON OBJETOS ALEATORIOS");
        System.out.println("---------------------------------------------");

        System.out.print("INGRESE EL NUMERO DE OBJETOS QUE DESEA CREAR? ");
        int no = sc.nextInt();

        FiguraGeometrica2D objetofg = null;

        for (int i = 0; i < no; i++) {
            int n = (int) (Math.random() * 4);

            if (v[n].equals("Triangulo")) {
                double base = Math.random() * 6;
                double altura = Math.random() * 6;
                objetofg = new Triangulo(base, altura);
            }

            if (v[n].equals("Circulo")) {
                double radio = Math.random() * 6;
                objetofg = new Circulo(radio);
            }

            if (v[n].equals("Cuadrado")) {
                double lado = Math.random() * 6;
                objetofg = new Cuadrado(lado);
            }

            if (v[n].equals("Rectangulo")) {
                double largo = Math.random() * 6;
                double ancho = Math.random() * 6;
                objetofg = new Rectangulo(largo, ancho);
            }
            objetosfg_al.add(objetofg);
        }
        System.out.println("OK");
    }

    public static void mostrarTodosElementosArrayList() {
        System.out.println("2. MOSTRAR TODOS LOS OBJETOS DEL ARRAYLIST");
        System.out.println("------------------------------------------");

        if (objetosfg_al.size() > 0) {
            System.out.printf("%8s %-10s %10s %10s\n", "NUMERO", "TIPO", "PERIMETRO", "AREA");
            System.out.printf("%8s %-10s %10s %10s\n", "------", "----", "---------", "----");
            for (int i = 0; i < objetosfg_al.size(); i++) {
                FiguraGeometrica2D objetofg = objetosfg_al.get(i);
                System.out.printf("%8d %-10s %10.2f %10.2f\n", (i + 1), objetofg.soy(), objetofg.perimetro(), objetofg.area());
            }
        } else {
            System.out.println("ARRAYLIST VACIO");
        }
    }

    public static void removerTodoObjetosArrayList() {
        System.out.println("3. REMOVER TODOS LOS OBJETOS DEL ARRAYLI");
        System.out.println("----------------------------------------");
        objetosfg_al.clear();
        System.out.println("OK");
    }

    public static void removerTodosObjetosTrianguloArryList() {
        System.out.println("4. REMOVER TODOS LOS OBJETOS TRIANGULO EN EL ARRAYLIST");
        System.out.println("------------------------------------------------------");
        List<FiguraGeometrica2D> objetosRemover = new ArrayList<>();
        for (FiguraGeometrica2D fg : objetosfg_al) {
            if (fg instanceof Triangulo) {
                objetosRemover.add(fg);
            }
        }
        objetosfg_al.removeAll(objetosRemover);
        System.out.println("OK");
    }

    public static void removerTodosObjetosTrianguloArryList1() {
        System.out.println("4. REMOVER TODOS LOS OBJETOS TRIANGULO EN EL ARRAYLIST");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < objetosfg_al.size(); i++) {
            FiguraGeometrica2D fg = null;
            if (fg instanceof Triangulo) {
                objetosfg_al.remove(fg);
                i--;
            }
        }
        System.out.println("OK");
    }

    public static void removerTodosObjetosCirculoyCuadradoArrayList() {
        System.out.println("5. REMOVER TODOS LOS OBJETOS CIRCULO Y CUADRADO EN EL ARRAYLIST");
        System.out.println("---------------------------------------------------------------");
        List<FiguraGeometrica2D> objetosRemover = new ArrayList<>();

        for (FiguraGeometrica2D fg : objetosfg_al) {
            if (fg instanceof Circulo || fg instanceof Cuadrado) {
                objetosRemover.add(fg);
            }
        }
        objetosfg_al.removeAll(objetosRemover);
        System.out.println("OK");
    }

    public static void mostrarSoloObjetosTrianguloArrayList() {
        System.out.println("6. MOSTRAR SOLAMENTE OBJETOS TRIANGULO PRESENTES EN EL ARRAYLIST");
        System.out.println("----------------------------------------------------------------");

        if (objetosfg_al.size() > 0) {
            System.out.printf("%8s %-10s %10s %10s\n", "NUMERO", "TIPO", "PERIMETRO", "AREA");
            System.out.printf("%8s %-10s %10s %10s\n", "------", "----", "---------", "----");
            for (int i = 0; i < objetosfg_al.size(); i++) {
                FiguraGeometrica2D objetofg = objetosfg_al.get(i);
                if (objetofg instanceof Triangulo) {
                    System.out.printf("%8d %-10s %10.2f %10.2f\n", (i + 1), objetofg.soy(), objetofg.perimetro(), objetofg.area());
                }
            }
        } else {
            System.out.println("ARRAYLIST VACIO");
        }

    }

    public static void mostrarSoloObjetosSuperenAreaDeterminada() {
        System.out.println("7. MOSTRAR SOLAMENTE LOS OBJETOS QUE SUPEREN UN AREA DETERMINADA");
        System.out.println("----------------------------------------------------------------");
        double areaMostrar = 0.0;
        System.out.print("INGRESE AREA? ");
        areaMostrar = sc.nextDouble();

        if (objetosfg_al.size() > 0) {
            System.out.printf("%8s %-10s %10s %10s\n", "NUMERO", "TIPO", "PERIMETRO", "AREA");
            System.out.printf("%8s %-10s %10s %10s\n", "------", "----", "---------", "----");
            for (int i = 0; i < objetosfg_al.size(); i++) {
                FiguraGeometrica2D objetofg = objetosfg_al.get(i);
                if (objetofg.area() > areaMostrar) {
                    System.out.printf("%8d %-10s %10.2f %10.2f\n", (i + 1), objetofg.soy(), objetofg.perimetro(), objetofg.area());
                }
            }
        } else {
            System.out.println("ARRAYLIST VACIO");
        }
    }

    public static void anadirObjetosTipoDeterminado() {
        System.out.println("8. AÑADIR OBJETOS DE UN TIPO DETERMINADO");
        System.out.println("----------------------------------------");
        int n = (int) (Math.random() * 4);
        FiguraGeometrica2D objetofg = null;
        if (v[n].equals("Triangulo")) {
            double base = Math.random() * 6;
            double altura = Math.random() * 6;
            objetofg = new Triangulo(base, altura);
        }

        if (v[n].equals("Circulo")) {
            double radio = Math.random() * 6;
            objetofg = new Circulo(radio);
        }

        if (v[n].equals("Cuadrado")) {
            double lado = Math.random() * 6;
            objetofg = new Cuadrado(lado);
        }

        if (v[n].equals("Rectangulo")) {
            double largo = Math.random() * 6;
            double ancho = Math.random() * 6;
            objetofg = new Rectangulo(largo, ancho);
        }
        objetosfg_al.add(objetofg);
        System.out.printf("%8s %-10s %10s %10s\n", "NUMERO", "TIPO", "PERIMETRO", "AREA");
        System.out.printf("%8s %-10s %10s %10s\n", "------", "----", "---------", "----");
        System.out.printf("%8d %-10s %10.2f %10.2f\n", 1, objetofg.soy(), objetofg.perimetro(), objetofg.area());
    }

}
