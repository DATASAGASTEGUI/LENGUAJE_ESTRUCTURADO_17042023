package wisl;

public class MetodosUtil {

    public static double redondearDecimales1(double numeroDecimal) {
        return Math.round(numeroDecimal * 100) / 100.0;
    }

    public double redondearDecimales2(double numeroDecimal) {
        return Math.round(numeroDecimal * 100) / 100.0;
    }

    public void redondearDecimales3(double numeroDecimal) {
        System.out.println(Math.round(numeroDecimal * 100) / 100.0);
    }

    public static double promedioVector(int[] v) {
        int acu = 0;
        for(int i=0; i<v.length; i++) {
            acu = acu + v[i];
        }
        return acu/v.length;
    }
}
