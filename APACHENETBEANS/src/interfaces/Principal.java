package interfaces;

public class Principal {

    public static void main(String[] args) {
        {
            ResueltoWalter tr = new ResueltoWalter();
            //8    4   2   1        
            String[] vectorBinario = {"1", "0", "1", "7"};

            int x = tr.convertirVectorBinarioDecimal(vectorBinario);
            if (x != -1) {
                System.out.println("Decimal: " + x);
            } else {
                System.out.println("ERROR");
            }
        }

        {
            ResueltoWalter tr = new ResueltoWalter();
            //8    4   2   1        
            String cadenaBinario = "1011";

            int x = tr.convertirVectorBinarioDecimal(cadenaBinario);
            if (x != -1) {
                System.out.println("Decimal: " + x);
            } else {
                System.out.println("ERROR");
            }
        }

        {
            ResueltoWalter tr = new ResueltoWalter();

            int numeroBinario = 1017;

            int x = tr.convertirVectorBinarioDecimal(numeroBinario);
            if (x != -1) {
                System.out.println("Decimal: " + x);
            } else {
                System.out.println("ERROR");
            }
        }

        {
            ResueltoWalter tr = new ResueltoWalter();

            char[] vectorCaracterBinario = {'1', '0', '1', '7'};

            int x = tr.convertirVectorBinarioDecimal(vectorCaracterBinario);
            if (x != -1) {
                System.out.println("Decimal: " + x);
            } else {
                System.out.println("ERROR");
            }
        }

        {
            ResueltoWalter tr = new ResueltoWalter();
            long numeroDecimal = 12456;
            long numeroBinario = tr.convertirVectorDecimalBinario(numeroDecimal);
            System.out.println("Numero Binario: " + numeroBinario);
        }

        {
            ResueltoWalter tr = new ResueltoWalter();
            int[][] matriz = {{5, 10, 7, 4, 2},
            {2, 4, 7, 8, 2}
            };//2*5 = filasXcolumnas
            
            //int[][] matrizCopia = matriz.clone();

            int[][] matrizCopia = new int[matriz.length][matriz[0].length];
            
            for(int i=0; i<matriz.length; i++) {
                for(int j=0; j<matriz[0].length; j++) {
                    matrizCopia[i][j] = matriz[i][j];
                }
            }

            tr.convierteCeroLosParesy1Impares(matrizCopia);

            System.out.println("Filas    : " + matrizCopia.length);
            System.out.println("Columnas : " + matrizCopia[0].length);

            for (int i = 0; i < matriz.length; i++) {//2
                for (int j = 0; j < matriz[i].length; j++) {//5
                    System.out.print(matriz[i][j] + "   ");
                }
                System.out.println();
            }

            for (int i = 0; i < matrizCopia.length; i++) {//2
                for (int j = 0; j < matrizCopia[i].length; j++) {//5
                    System.out.print(matrizCopia[i][j] + "   ");
                }
                System.out.println();
            }

        }

    }

}
