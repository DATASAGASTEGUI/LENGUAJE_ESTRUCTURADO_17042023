package operadores_binarios;

import java.util.Scanner;

public class Mascara_Subred {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mascara = "255.224.0.0";
        
        //DEFINIR DATOS
        String ip1r, ip2r, ip1, ip2;
        String[] p_ip1, p_ip2, p_mascara;
        
        String resultado;
        
        int[] ipred_1 = new int[4];
        int[] ipred_2 = new int[4];
        
        //ENTRADA
        System.out.print("Ingrese IP1? ");
        ip1 = sc.next();
        System.out.print("Ingrese IP2? ");
        ip2 = sc.next();
        
        //PROCESO
        p_ip1 = ip1.split("\\.");
        p_ip2 = ip2.split("\\.");
        p_mascara = mascara.split("\\.");
        
        for(int i=0; i<ipred_1.length; i++) {
            ipred_1[i] =  Integer.parseInt(p_ip1[i]) & Integer.parseInt(p_mascara[i]);
            ipred_2[i] =  Integer.parseInt(p_ip2[i]) & Integer.parseInt(p_mascara[i]);
        }
        
        ip1r = ipred_1[0] + "." + ipred_1[1] + "." + ipred_1[2] + "." + ipred_1[3];
        ip2r = ipred_2[0] + "." + ipred_2[1] + "." + ipred_2[2] + "." + ipred_2[3];
        
        if(ip1r.equals(ip2r)) {
           resultado = "PERTENECE MISMA RED"; 
        }else {
           resultado = "NO PERTENECE MISMA RED"; 
        }
      
        //SALIDA
        
        System.out.printf("%-17s %-17s %-17s %-17s   %-30s\n","HOST1","HOST2", "RED1","RED2","RESULTADO");
        System.out.printf("%-17s %-17s %-17s %-17s   %-30s\n","-----","-----", "----","----","---------");
        System.out.printf("%-17s %-17s %-17s %-17s   %-30s\n",ip1,ip2, ip1r,ip2r,resultado);
    }
    
}
