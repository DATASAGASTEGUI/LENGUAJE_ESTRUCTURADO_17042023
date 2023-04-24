<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>SUMAR DOS NÚMEROS</h1>

        <%
            String resultado = "";
            String n1 = "";
            String n2 = "";
            String operacion = "";
            if (request.getParameter("accion") != null) {
                try {
                    n1 = request.getParameter("n1").trim();
                    n2 = request.getParameter("n2").trim();
                    operacion = request.getParameter("operacion");
                    switch (operacion) {
                        case "sumar":
                            resultado = String.valueOf(Double.parseDouble(n1) + Double.parseDouble(n2));
                            break;
                        case "restar":
                            resultado = String.valueOf(Double.parseDouble(n1) - Double.parseDouble(n2));
                            break;
                        case "multiplicar":
                            resultado = String.valueOf(Double.parseDouble(n1) * Double.parseDouble(n2));
                            break;
                        case "dividir":
                            resultado = String.valueOf(Double.parseDouble(n1) / Double.parseDouble(n2));
                            break;
                    }

                } catch (Exception e) {
                    resultado = "ENTRADA INCORRECTA";
                }
            }

        %>
        <form action="">
            <!--ENTRADA-->
            <input type="text" name="n1" value="<%=n1%>" placeholder="NUMERO 1" />
            <input type="text" name="n2" value="<%=n2%>" placeholder="NUMERO 2" />
            
            <input type="radio" name="operacion" value="sumar" />SUMAR
            <input type="radio" name="operacion" value="restar" />RESTAR
            <input type="radio" name="operacion" value="multiplicar" />MULTIPLICAR
            <input type="radio" name="operacion" value="dividir" />DIVIDIR
            
            <!--SALIDA-->
            <input type="text" value="<%=resultado%>" placeholder="RESULTADO" disabled />
            <!--ACCION-->
            <input type="submit" name="accion" value="CALCULAR" />
        </form>
    </body>
</html>
