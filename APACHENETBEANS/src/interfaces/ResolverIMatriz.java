package interfaces;

public class ResolverIMatriz implements IOperacionesMatriz, IUtil {

    @Override
    public void ejercicio1() {
        int[][] matriz = new int[3][6];

        matriz[0][0] = 0;
        matriz[0][1] = 30;
        matriz[0][2] = 2;
        matriz[0][5] = 5;
        matriz[1][0] = 75;
        matriz[1][4] = 0;
        matriz[2][2] = -2;
        matriz[2][3] = 9;
        matriz[2][5] = 11;
        
        imprimirMatrizEntero(matriz);
        
    }

    @Override
    public void imprimirMatrizEntero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if((i == 0 && j == 0) || (i == 1 && j == 4)) {
                    System.out.print(0 + " ");
                }
                if(matriz[i][j] != 0) {
                   System.out.print(matriz[i][j] + " ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
