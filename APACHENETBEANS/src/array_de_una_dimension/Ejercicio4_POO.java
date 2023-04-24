package array_de_una_dimension;

public class Ejercicio4_POO {

    public static void main(String[] args) {
        int[] numero = new int[20];
        Calculo.cabecera();
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            Calculo c = new Calculo(numero[i]);
            c.cuerpo();
        }
    }

}

class Calculo {

    //ATRIBUTO
    private int numero;

    public Calculo() {
    }

    public Calculo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int cuadrado() {
        return this.numero * this.numero;
    }

    public int cubo() {
        return cuadrado() * this.numero;
    }

    public static void cabecera() {
        System.out.printf("%8s  %10s  %6s \n", "Numero", "Cuadrado", "Cubo");
        System.out.printf("%8s  %10s  %6s \n", "------", "--------", "----");
    }

    public void cuerpo() {
        System.out.printf("%8d  %10d  %6d \n", this.numero, cuadrado(), cubo());
    }

}
