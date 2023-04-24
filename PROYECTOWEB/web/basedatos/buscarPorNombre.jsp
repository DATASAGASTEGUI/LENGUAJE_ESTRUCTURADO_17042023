<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BUSCAR UN ALUMNO POR SU NOMBRE</h1>

        <%
            String nombrex = "";
            boolean bandera = false;
            if (request.getParameter("accion") != null) {
                String url = "jdbc:mysql://localhost:3306/instituto";
                String user = "root";
                String password = "";
                Connection conexion = null;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conexion = DriverManager.getConnection(url, user, password);
                    nombrex = request.getParameter("nombre");

                    String query = "SELECT * FROM Alumno WHERE nombre = ?";
                    PreparedStatement ps = conexion.prepareStatement(query);
                    ps.setString(1, nombrex);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        bandera = true;
                        int idAlumno = rs.getInt(1);
                        String nombre = rs.getString(2);
                        int edad = rs.getInt(3);
                        double estatura = rs.getDouble(4);
        %>          
        <input type="text" value="<%=idAlumno%>" />
        <input type="text" value="<%=nombre%>" />
        <input type="text" value="<%=edad%>" />
        <input type="text" value="<%=estatura%>" /><br>
        <%
                    }
                    if (bandera == false) {
                        nombrex = "NO EXISTE";
                    }
                } catch (Exception e) {

                }
            }
        %>


        <form>
            <!--ENTRADA-->
            <input type="text" name="nombre" value="<%=nombrex%>" />
            <!--ACCION-->
            <input type="submit" name="accion" value="MOSTRAR" />
        </form>        
    </body>
</html>
