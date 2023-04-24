package ecuacion_cuadratica_con_metodo;

public class SolucionCuadratica {
    //AX^2 + BX + C = 0
    public static void main(String[] args) {
        //DEFINIR DATOS
        int a, b, c;
        String resultado;
        //ENTRADA
         int[] n = Metodos.entrada();
        a = n[0]; b = n[1]; c = n[2];
        //PROCESO
        resultado = Metodos.proceso(a, b, c);
        //SALIDA
        Metodos.salida(resultado);
    }
    
}
