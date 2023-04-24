package archivos_csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Lectura {

    public static void main(String[] args) {
        String nra = "data\\transacciones.csv";
        String fila = "";

        List<Transacciones> transacciones = new ArrayList<Transacciones>();

        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        double pagot = 0.0;
        double pagoc = 0.0;
        double totalE = 0.0;
        double totalI = 0.0;
        double totalA = 0.0;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;

            while ((fila = br.readLine()) != null) {
                //System.out.println(fila);
                String[] partes = fila.split(";");
                if (i != 0) {
                    Transacciones t = new Transacciones(Integer.parseInt(partes[0]),
                            partes[1],
                            partes[2],
                            Double.parseDouble(partes[3]),
                            partes[4],
                            partes[5]);
                    transacciones.add(t);
                }
                i++;
            }
            for (Transacciones e : transacciones) {
                if (e.getFormaPago().equalsIgnoreCase("Contado")) {
                    pagoc = pagoc + e.getVentas();
                } else {
                    pagot = pagot + e.getVentas();
                }

            }
            if (pagoc > pagot) {
                System.out.println("Se ha pagado mas al contado");
                System.out.println("Se ha pagado al contado " + pagoc + " frente al pago en tarjeta " + pagot);
            } else {
                System.out.println("Se ha pagado mas en tarjeta");
                System.out.println("Se ha pagado al tarjeta " + pagot + " frente al pago en contado " + pagoc);
            }

            for (Transacciones e : transacciones) {
                if (e.getCategoria().equals("Electrodoméstico")) {
                    totalE = totalE + e.getVentas();
                } else if (e.getCategoria().equals("Informática")) {
                    totalI = totalI + e.getVentas();
                } else {
                    totalA = totalA + e.getVentas();
                }
            }
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/categoria.csv"));
            String fila2 = "CATEGORIA; TOTAL DE VENTAS";
            bw.write(fila2 + "\n");
            fila2 = "Electrodoméstico; " + totalE;
            bw.write(fila2 + "\n");
            fila2 = "Informática; " + totalI;
            bw.write(fila2 + "\n");
            fila2 = "Audio y Television; " + totalA;
            bw.write(fila2 + "\n");
            bw.close();

        } catch (Exception e) {
            System.out.println("ERROR ARCHIVO");

        }

        /*
        String nra1 = "data/resumn.csv";
        FileWriter fw = null;
        BufferedWriter bw = null;
        String fila1 = "";

        try {
            f = new File(nra1);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            fila1 = "FORMA PAGO;VENTA TOTAL";
            bw.write(fila1 + "\n");
            fila1 = "Contado;" + (int)pagoc;
            bw.write(fila1 + "\n");
            fila1 = "Tarjeta;" + (int)pagot;
            bw.write(fila1 + "\n");
            bw.flush();
        } catch (Exception e) {

        } */
    }

}
