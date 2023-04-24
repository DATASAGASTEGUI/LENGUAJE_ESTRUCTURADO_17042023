
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MATRIZ</h1>
        <%
            int[][] matriz = new int[3][6];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = (int) (Math.random() * 6 + 1);
                }
            }

            out.print("<table border='1' cellspacing='5' cellpadding='5'>");
            for (int i = 0; i < matriz.length; i++) {
                out.print("<tr>");
                for (int j = 0; j < matriz[0].length; j++) {
                    out.print("<td>"+matriz[i][j]+"</td>");
                }
                out.print("</tr>");
            }
            out.print("</table>");
            //http://localhost:8080/PROYECTOWEB/matriz/index.jsp
        %>




    </body>
</html>
