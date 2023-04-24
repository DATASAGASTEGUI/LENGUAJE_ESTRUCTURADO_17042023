package interfaces;


public interface OperacionesVector {//CONTRATO
   /*
    Recibiras un vector "String[] vectorBinario = {"1","0","1"}"
    Tiene que retornarte 5 como entero
    Incorrecto -1
    */
   public int convertirVectorBinarioDecimal(String[] vectorStringBinario);//{"1","0","1"}"
   public int convertirVectorBinarioDecimal(String cadenaBinario);//"101"
   public int convertirVectorBinarioDecimal(int numeroBinario);//101
   public int convertirVectorBinarioDecimal(char[] vectorCaracterBinario);//{'1','0','1'}
   
   public long convertirVectorDecimalBinario(long numeroDecimal);//5 --> 101
   
}

/*
Polimmorfismo:
Implementar de distintas maneras un método
*/
