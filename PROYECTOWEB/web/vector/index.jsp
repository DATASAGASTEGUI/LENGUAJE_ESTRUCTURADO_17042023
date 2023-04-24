<%-- 
    Document   : index
    Created on : 17-may-2023, 14:22:40
    Author     : Tecnicos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vector 1</title>
    </head>
    <body>
        <h1>EJERCICIO 1: MOSTRAR UN VECTOR ENTEROS</h1>
        <%
            int[] v = new int[10];
            for (int i = 0; i < v.length; i++) {
                v[i] = (int) (Math.random() * 6 + 1);
                out.print(v[i] + "  ");
            }
        %>


    </body>
</html>




