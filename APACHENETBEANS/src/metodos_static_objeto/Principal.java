package metodos_static_objeto;

import wisl.MetodosUtil;

public class Principal {

    public static void main(String[] args) {
        //HACER UN METODO QUE REDONDE UN NUMERO REAL A DOS DECIMALES
        double estatura = 1.479;

        System.out.println("Estatura : " + MetodosUtil.redondearDecimales1(estatura));

        MetodosUtil mu = new MetodosUtil();
        System.out.println("Estatura : " + mu.redondearDecimales2(estatura));
        
        System.out.println("Estatura : ");
        
        mu.redondearDecimales3(estatura);
    }

}
