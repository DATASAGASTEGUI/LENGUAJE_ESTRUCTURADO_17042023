package poo.subneteo;

public class Subneteo {

    //CONSTANTE COMUN A TODOS LOS OBJETOS
    static String mascara = "255.224.0.0";

    //ATRIBUTOS
    private String ip1; //10.32.0.1
    private String ip2;

    public Subneteo() {
    }

    public Subneteo(String ip1, String ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    public String getIp1() {
        return ip1;
    }

    public void setIp1(String ip1) {
        this.ip1 = ip1;
    }

    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2;
    }

    public String subred1() {
        String ipsubred1;
        int[] subred1 = new int[4];
        String[] p_ip1, p_mascara;           //0  1  2 3
        p_ip1 = this.ip1.split("\\.");//10,32,0,1
        p_mascara = mascara.split("\\.");
        for (int i = 0; i < p_ip1.length; i++) {
            subred1[i] = Integer.parseInt(p_ip1[i]) & Integer.parseInt(p_mascara[i]);
        }
        ipsubred1 = subred1[0] + "." + subred1[1] + "." + subred1[2]
                + subred1[3];
        return ipsubred1;
    }

    public String subred2() {
        String ipsubred2;
        int[] subred1 = new int[4];
        String[] p_ip2, p_mascara;           //0  1  2 3
        p_ip2 = this.ip2.split("\\.");//10,32,0,1
        p_mascara = mascara.split("\\.");
        for (int i = 0; i < p_ip2.length; i++) {
            subred1[i] = Integer.parseInt(p_ip2[i]) & Integer.parseInt(p_mascara[i]);
        }
        ipsubred2 = subred1[0] + "." + subred1[1] + "." + subred1[2]
                + subred1[3];
        return ipsubred2;
    }

    public String evaluacion() {
        if(subred1().equals(subred2())) {
           return "IGUAL SUBRED";
        }else {
           return "DISTINTA SUBRED";
        }
            
    }

    public static void cabecera() {
        System.out.printf("%-3s  %16s  %16s  %16s  %16s  %16s\n", "N", "IP-1", "IP-2", "SUBRED-IP1", "SUBRED-IP2", "EVALUACION");
        System.out.printf("%-3s  %16s  %16s  %16s  %16s  %16s\n", "-", "----", "----", "----------", "---------", "----------");
    }

    public void cuerpo(int i) {
        System.out.printf("%-3s  %16s  %16s  %16s  %16s  %16s\n", i, this.getIp1(), this.getIp2(), this.subred1(), this.subred2(), this.evaluacion());
    }

}
