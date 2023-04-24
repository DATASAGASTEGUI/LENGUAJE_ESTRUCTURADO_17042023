package vector_estatico_sin_metodo;

public class VectorEstatico {

    public static void main(String[] args) {
        int[] edades = {17, 20, 21, 24, 25, 28};
        double[] estaturas = {1.72, 1.69, 1.80, 1.45, 1.48, 1.60};
        //float[] estaturas = {1.72f,1.69f,1.80f,1.45f,1.48f,1.60f};
        String[] nombres = {"Luis", "Miguel",
            "Carlos", "Carmen",
            "María", "Arturo"};
        char[] sexo = {'H', 'H', 'H', 'M', 'M', 'H'};
        boolean[] esCasado = {true, false, true, false, true, true};

        //RECORRER VECTOR FORMAR UNA TABLA
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
        for (int i = 0; i < edades.length; i++) {
            System.out.format("%-10s%-5d%-10.2f%-5c%-10s\n",
                    nombres[i],
                    edades[i],
                    estaturas[i],
                    sexo[i],
                    esCasado[i]);
        }

    }

}
