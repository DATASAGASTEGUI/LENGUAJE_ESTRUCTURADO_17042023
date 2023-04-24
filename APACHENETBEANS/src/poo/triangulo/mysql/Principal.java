package poo.triangulo.mysql;

public class Principal {
    
    public static void main(String[] args) {
        //CREAR 100 OBJETOS TRIANGULOS
        Triangulo[] triangulo = new Triangulo[100];
        Triangulo t;
        double base; //[5,85]
        double altura; //[10,100]
        //int[] numero = new int[100];
        //LLENAR UN VECTOR CON 100 OBJETOS DE TIPO TRIANGULO
        for (int i = 0; i < 100; i++) {
            base = (Math.random() * 81 + 5);
            altura = (Math.random() * 91 + 10);
           // triangulo[i] = new Triangulo(base, altura);
        }
        //MOSTRAR TODOS LOS OBJETOS
        //N   BASE    ALTURA    AREA
        Triangulo.cabecera();
        for (int i = 0; i < 100; i++) {
            t = triangulo[i];
            t.cuerpo(i);
        }
        
    }
    
}
