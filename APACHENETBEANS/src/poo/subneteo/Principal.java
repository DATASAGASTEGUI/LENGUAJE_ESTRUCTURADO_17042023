package poo.subneteo;

public class Principal {

    public static void main(String[] args) {
        //10.128.0.1	10.159.255.254
        Subneteo s1 = new Subneteo("10.128.0.1","10.159.255.254");
        
        Subneteo.cabecera();
        s1.cuerpo(0);
        
        System.out.println(Subneteo.mascara);
    }
    
}
