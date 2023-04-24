package operadores_binarios;

public class OperacionesBinarias {

    public static void main(String[] args) {
        //OPERACIONES BINARIAS
        byte a = 5;
        byte b = 3;
        byte c = 5 & 3;
        byte d = 5 | 3;
        byte e = ~(5);//0101=5 =  1010=10 INVESTIGAR
        System.out.println("And: " + c);
        System.out.println("Or: " + d);
        System.out.println("Not: " + e);

        //SEPARAR LAS PARTES DE UNA IP
        //String[] ipred = new 
        
        String mascara = "255.224.0.0";
        
        String[] p_mascara = mascara.split("\\.");
        String ip = "10.31.255.254";
        String[] p_ip = ip.split("\\.");
        for (String s : p_ip) {
             System.out.println(s);
        }
        
        //CONVERSION STRING A BYTE
        int x1 = Integer.parseInt(p_ip[0]);
        //String c = x1 + "." +x2 + "."
        
        //COMPARAR CADENAS
        String c1 = "hola";
        String c2 = "HOLA";
        if(c1.equals(c2)) {
            System.out.println("IGUALES");
        }else {
            System.out.println("DIFERENTES");
        }
        
        
        
        
        
        
        
        
    }

}
