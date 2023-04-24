<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>TABLA DE MULTIPLICAR</center></h1>
        <%
            int n = 2;

            out.print("<center><table border='2' width='20%'>");
            for (int i = n; i <= 12; i++) {
                for (int j = 1; j <= 12; j++) {
                    out.print("<tr style='text-align:center; color:blue;'>");
                    out.print("<td>" + i + "</td>"
                            + "<td>x</td>"
                            + "<td>" + j + "</td>"
                            + "<td>=</td>"
                            + "<td>" + (i * j) + "</td>");
                    out.print("</tr>");
                }
                out.print("<tr><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td><td>&nbsp;&nbsp;</td></tr>");
            }
            out.print("</table></center>");
        %>
    </body>
</html>

<%--
http://localhost:8080/PROYECTOWEB/tablamultiplicar/index.jsp
--%>

