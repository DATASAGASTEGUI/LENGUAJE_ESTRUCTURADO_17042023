<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FECHA DEL SISTEMA</h1>
        <%
             Date d = new Date();
             String today = DateFormat.getDateInstance().format(d);
             String[] parte = today.split("-");
             
             //out.println("Fecha: " + today); //22-may-2023
             String fecha = parte[0] + " de " + parte[1] + " de " + parte[2];
             
             switch(parte[1]) {
                 case "may": parte[1] = "MAYO";
                 case "jun": parte[1] = "JUNIO";
             }

        %>
        
        DIA<input type='text' value="<%=parte[0]%>" style="text-align:center"/>
        MES<input type='text' value="<%=parte[1]%>" style="text-align:center"/>
        AÑO<input type='text' value="<%=parte[2]%>" style="text-align:center"/>
        FECHA<input type="text" value="<%=fecha%>" style="text-align:center"/>



    </body>
</html>

<%--
http://localhost:8080/PROYECTOWEB/fecha/index.jsp
--%>
