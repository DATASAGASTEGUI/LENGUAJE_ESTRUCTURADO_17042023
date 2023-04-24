<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EJERCICIO DE MATRIZ 1</h1>
        <%
            int[][] matriz = new int[3][6];

            matriz[0][0] = 0;
            matriz[0][1] = 30;
            matriz[0][2] = 2;
            matriz[0][5] = 5;
            matriz[1][0] = 75;
            matriz[1][4] = 0;
            matriz[2][2] = -2;
            matriz[2][3] = 9;
            matriz[2][5] = 11;

            out.print("<table border='1' cellspacing='10' cellpadding='10'>");

            for (int i = 0; i < matriz.length; i++) {
                out.print("<tr style='text-align:center'>");
                for (int j = 0; j < matriz[0].length; j++) {
                    out.print("<td width='30'>");
                    if (matriz[i][j] == 0 && ((i == 0 && j == 0) || (i == 1 && j == 4))) {
                        out.print(matriz[i][j]);
                    } else {
                        if (matriz[i][j] != 0) {
                            out.print(matriz[i][j]);
                        } else {
                            out.print(" ");
                        }
                        out.print("</td>");
                    }
                }
                out.print("</tr>");
            }
            out.print("</table>");


        %>


    </body>
</html>
