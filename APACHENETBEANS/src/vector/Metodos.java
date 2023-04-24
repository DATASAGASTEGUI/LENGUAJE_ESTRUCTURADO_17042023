package vector;

public class Metodos {

    public static void cabecera() {
        System.out.format("%-10s%-5s%-10s%-5s%-10s\n",
                "NOMBRE",
                "EDAD",
                "ESTATURA",
                "SEXO",
                "ESCASADO");
        System.out.format("%-10s%-5s%-10s%-5s%-10s\n",
                "------",
                "----",
                "--------",
                "----",
                "--------");
    }

    public static void cuerpo() {
        for (int i = 0; i < Datos.edades.length; i++) {
            System.out.format("%-10s%-5d%-10.2f%-5c%-10s\n",
                    Datos.nombres[i],
                    Datos.edades[i],
                    Datos.estaturas[i],
                    Datos.sexo[i],
                    Datos.esCasado[i]);
        }

    }
}
