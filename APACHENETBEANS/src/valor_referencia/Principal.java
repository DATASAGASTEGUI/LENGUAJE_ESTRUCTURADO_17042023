package valor_referencia;

public class Principal {


    public static void main(String[] args) {
      String[] nombres = {"Luis","Carlos","Miguel"};
      String[] nombres1 = nombres.clone();
      cambiarVector(nombres);
      System.out.println("Principal Referencia " + nombres[1]);
      System.out.println("Principal Referencia o " + nombres1[1]);
    }
    
    public static void cambiarVector(String[] nombres) {
        nombres[1] = "Arturo";
        System.out.println("Funcion Referencia " + nombres[1]);
    }
    
}
