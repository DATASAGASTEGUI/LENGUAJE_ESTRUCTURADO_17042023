package interfaces;

public class ResueltoWalter implements TareasRealizar, OperacionesVector, OperacionesMatriz {

    @Override
    public int restar(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int sumar(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int muntiplicacion(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int convertirVectorBinarioDecimal(String[] vectorBinario) {
        int x = 0;
        int acu = 0;
        int e = -1;
        for (int i = 0, j = (vectorBinario.length - 1); i < vectorBinario.length; i++, j--) {
            x = Integer.parseInt(vectorBinario[i]);//"1"
            if (x == 1 || x == 0) {
                acu = acu + x * (int) Math.pow(2, j);
            } else {
                acu = e;
                break;
            }
        }
        return acu;
    }

    @Override
    public int convertirVectorBinarioDecimal(String cadenaBinario) {
        int x = 0;
        int acu = 0;
        int e = -1;
        for (int i = 0, j = (cadenaBinario.length() - 1); i < cadenaBinario.length(); i++, j--) {
            // x = Integer.parseInt(cadenaBinario.charAt(i)+ "");//'1'
            x = Integer.parseInt(String.valueOf(cadenaBinario.charAt(i)));
            if (x == 1 || x == 0) {
                acu = acu + x * (int) Math.pow(2, j);
            } else {
                acu = e;
                break;
            }
        }
        return acu;
    }

    @Override
    public int convertirVectorBinarioDecimal(int numeroBinario) {//101
        String cadena = String.valueOf(numeroBinario);//"101"
        String[] vectorBinario = cadena.split("");//{"1","0","1"}

        int x = 0;
        int acu = 0;
        int e = -1;
        for (int i = 0, j = (vectorBinario.length - 1); i < vectorBinario.length; i++, j--) {
            x = Integer.parseInt(vectorBinario[i]);//"1"
            if (x == 1 || x == 0) {
                acu = acu + x * (int) Math.pow(2, j);
            } else {
                acu = e;
                break;
            }
        }
        return acu;

        /*
        String cadenaBinario = String.valueOf(numeroBinario);//"101"
        int x = 0;
        int acu = 0;
        int e = -1;
        for (int i = 0, j = (cadenaBinario.length() - 1); i < cadenaBinario.length(); i++, j--) {
            // x = Integer.parseInt(cadenaBinario.charAt(i)+ "");//'1'
            x = Integer.parseInt(String.valueOf(cadenaBinario.charAt(i)));
            if (x == 1 || x == 0) {
                acu = acu + x * (int) Math.pow(2, j);
            } else {
                acu = e;
                break;
            }
        }
        return acu;
         */
    }

    @Override
    public int convertirVectorBinarioDecimal(char[] vectorCaracterBinario) {
        String cadenaBinario = String.valueOf(vectorCaracterBinario);//
        int x = 0;
        int acu = 0;
        int e = -1;
        for (int i = 0, j = (cadenaBinario.length() - 1); i < cadenaBinario.length(); i++, j--) {
            // x = Integer.parseInt(cadenaBinario.charAt(i)+ "");//'1'
            x = Integer.parseInt(String.valueOf(cadenaBinario.charAt(i)));
            if (x == 1 || x == 0) {
                acu = acu + x * (int) Math.pow(2, j);
            } else {
                acu = e;
                break;
            }
        }
        return acu;
    }

    @Override
    public long convertirVectorDecimalBinario(long numeroDecimal) {//5
        Long c, r, n;
        n = numeroDecimal;
        String acu = "";

        while (n >= 2) {
            c = n / 2;//2
            r = n % 2;//1
            acu = r + acu;
            n = c;
        }              //8421
        acu = n + acu;//"1011"    6=110
        return Long.parseLong(acu);//101
        /* 
       String cadenaBinario = Integer.toBinaryString(numeroDecimal);//"101"
       return Integer.parseInt(cadenaBinario);//101
         */
    }

    @Override
    public void convierteCeroLosParesy1Impares(int[][] matriz) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0) {
                   matriz[i][j] = 0;
                }else {
                   matriz[i][j] = 1; 
                }
            }
        }
    }

}
