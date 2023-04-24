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
        <h1>ELIMINAR UN ALUMNO POR SU ID</h1>

        <%
            String id = "";
            boolean bandera = false;
            if (request.getParameter("accionEliminar") != null) {
                String url = "jdbc:mysql://localhost:3306/instituto";
                String user = "root";
                String password = "";
                Connection conexion = null;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conexion = DriverManager.getConnection(url, user, password);
                    id = request.getParameter("idAlumno");

                    String query = "DELETE FROM Alumno WHERE idAlumno = ?";
                    PreparedStatement ps = conexion.prepareStatement(query);
                    ps.setInt(1, Integer.parseInt(id));
                    int x = ps.executeUpdate();//1

                    if (x != 1) {
                        id = "NO EXISTE";
                    } else {
                        id = "ALUMNO ELIMINADO";
                    }
                } catch (Exception e) {

                }
            }
            
            if(request.getParameter("accionMostrar") != null) {
               response.sendRedirect("../basedatos/mostrar.jsp");
            }
        %>


        <form>
            <!--ENTRADA-->
            <input type="text" name="idAlumno" value="<%=id%>" />
            <!--ACCION-->
            <input type="submit" name="accionEliminar" value="ELIMINAR" />
            <input type="submit" name="accionMostrar" value="MOSTRAR" />
        </form>        
    </body>
</html>

