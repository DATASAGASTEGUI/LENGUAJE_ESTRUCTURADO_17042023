package valor_referencia;

public class Principal2 {

    public static void main(String[] args) {
        int[] vector1 = new int[5];
        System.out.println("LLENAR VECTOR");
        entradaVector(vector1);

        System.out.println("MOSTRAR VECTOR");
        mostrarVector(vector1);
    }

    public static void entradaVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 6 + 1);
        }
    }

    public static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");
        }
    }

}
