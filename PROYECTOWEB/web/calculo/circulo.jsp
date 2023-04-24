<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CALCULAR PERIMETRO Y AREA DEL CIRCULO</h1>
        <%
            String radio = "";
            String area = "";
            String perimetro = "";
            if (request.getParameter("calcular") != null) {
                try {
                    double[] resultado = new double[2];
                    radio = request.getParameter("radio");
                    calcular(resultado, Double.parseDouble(radio));
                    perimetro = String.valueOf(resultado[1]);
                    area = String.valueOf(resultado[0]);
                } catch (Exception e) {

                }
            }

            if (request.getParameter("nuevo") != null) {
                radio = "";
                area = "";
                perimetro = "";
            }
        %>



        <form action=''>
            <!--ENTRADA-->
            <input type='text' name='radio' value='<%=radio%>' placeholder='RADIO' />
            <!--SALIDA-->
            <input type='text' name='radio' value='<%=perimetro%>' placeholder='PERIMETRO' />
            <input type='text' name='radio' value='<%=area%>' placeholder='AREA' />
            <!--ACCION-->
            <input type='submit' name='calcular' value='CALCULAR' />
            <input type='submit' name='nuevo' value='NUEVO' />
        </form>


    </body>
</html>

<%!
    public double redondear2decimales(double numero) {
        return Math.round(numero * 100) / 100.0;
    }

    public void calcular(double[] resultado, double radio) {
        resultado[0] = redondear2decimales(Math.PI * radio * radio); // Area
        resultado[1] = redondear2decimales(2 * Math.PI * radio); // Perimetro
    }
%>
