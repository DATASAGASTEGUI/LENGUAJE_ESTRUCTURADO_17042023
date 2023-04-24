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
            if (request.getParameter("accion") != null) {
                try {
                    n1 = request.getParameter("n1").trim();
                    n2 = request.getParameter("n2").trim();
                    resultado = String.valueOf(Integer.parseInt(n1) + Integer.parseInt(n2));
                } catch (Exception e) {
                    resultado = "ENTRADA INCORRECTA";
                }
            }

        %>
        <form action="">
            <!--ENTRADA-->
            <input type="text" name="n1" value="<%=n1%>" placeholder="NUMERO 1" />
            <input type="text" name="n2" value="<%=n2%>" placeholder="NUMERO 2" />
            <!--SALIDA-->
            <input type="text" value="<%=resultado%>" placeholder="RESULTADO" disabled />
            <!--ACCION-->
            <input type="submit" name="accion" value="SUMAR" />
        </form>
    </body>
</html>
