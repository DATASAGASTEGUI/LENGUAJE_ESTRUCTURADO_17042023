package matriz_estatica;

public class Matriz_Llenar_Recorrer {

    public static void main(String[] args) {
        //DECLARAR UNA MATRIZ ESTATICA
        int[][] numeros = {{2, 3, 4, 5},
        {7, 8, 9, 1},
        {4, 2, 3, 8}};//3(Fila)*4(Columna)

        //RECORRER
        for (int i = 0; i < numeros.length; i++) {//FILAS
            for (int j = 0; j < numeros[0].length; j++) {//COLUMNAS
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] piramide = {{1},
        {1, 1, 1},
        {1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1}};
        
        int e = (1+4*2)/2;//2 1 0
        for (int i = 0; i < piramide.length; i++) {//FILAS
            
            //ESPACIOS ANTES DE IMPRIMIR 1
            for(int k=0; k<e; k++) {
               System.out.print(" "); 
            }
            
            
            for (int j = 0; j < piramide[i].length; j++) {//COLUMNAS
                System.out.print(piramide[i][j]);
            }
            e--;
            System.out.println();
        }
    }
}
