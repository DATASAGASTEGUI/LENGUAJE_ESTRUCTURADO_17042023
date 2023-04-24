<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <center>
        <h1>TABLA DE MULTIPLICAR</h1>

                <%
                    int n = 2;
                    for (int i = n; i <= 12; i++) {
                        for (int j = 1; j <= 12; j++) {
                %>

        <input type="text" value="<%=i%>" style="text-align:center; width:20px;"/>
        <input type="text" value="x" style="text-align:center; width:20px;"/>
        <input type="text" value="<%=j%>" style="text-align:center; width:20px;" />
        <input type="text" value="=" style="text-align:center; width:20px;"/>
        <input type="text" value="<%= i * j%>" style="text-align:center; width:20px;" />
        <br>

        <%      
                }
                out.print("<br><br>");

            }
        %>
    </center>
    </body>
</html>

<%--
http://localhost:8080/PROYECTOWEB/tablamultiplicar/index1.jsp
--%>
