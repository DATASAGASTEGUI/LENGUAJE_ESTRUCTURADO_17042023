<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAGINA JSP</title>
    </head>
    <body>
        <%-- DECLARACIONES --%>

        <%-- EXPRESIONES --%>
        <h1><%= titulo%></h1>
        <%
            int n1 = 5;
            int n2 = 7;
            int suma = suma(n1, n2);
            out.print("<h4>Suma: </h4>" + "<h6>" + suma + "</h6>");
        %>

        <%--
http://localhost:8080/PROYECTOWEB/introduccion/index.jsp
        --%>






        <%-- SCRIPTLETS --%>

    </body>
</html>









<%!
    String titulo = "INTRODUCCION JSP";

    public int suma(int n1, int n2) {
        return n1 + n2;
    }
%>
