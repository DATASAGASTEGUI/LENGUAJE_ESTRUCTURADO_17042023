<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>TABLA DE MULTIPLICAR DADO EL NUMERO N</h1>

        <%
            String n = "";
            boolean bandera = false;
            if (request.getParameter("accion") != null) {
                try {
                    n = request.getParameter("n");
                    int x = Integer.parseInt(n);//FORZAR QUE SALTE LA EXCEPTION
                    bandera = true;
                } catch (Exception e) {
                    bandera = false;
                }
            }
        %>
        <form>
            <!--ENTRADA-->
            <input type="text" name="n" value="" placeholder="NUMERO"/>
            <!--ACCION-->
            <input type="submit" name="accion" value="MOSTRAR" />
        </form>

        <!--SALIDA-->
        <%
            if (bandera == true) {
                for (int i = 1; i <= 12; i++) {
        %>        

        <input type="text" value="<%=n%>" />
        <input type="text" value="X" />
        <input type="text" value="<%=i%>" />
        <input type="text" value="=" />
        <input type="text" value="<%=Integer.parseInt(n) * i%>" /><br>


        <%

                }
            }
        %>


    </body>
</html>
