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
        <h1>INSERTAR UN ALUMNO</h1>

        <%
            String nombre = "";
            String edad = "";
            String estatura = "";
            if (request.getParameter("insertar") != null) {
                nombre = request.getParameter("nombre");
                edad = request.getParameter("edad");
                estatura = request.getParameter("estatura");

                String url = "jdbc:mysql://localhost:3306/instituto";
                String user = "root";
                String password = "";
                Connection conexion = null;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conexion = DriverManager.getConnection(url, user, password);

                    String query = "INSERT INTO Alumno (nombre, edad, estatura) VALUES(?,?,?)";
                    PreparedStatement ps = conexion.prepareStatement(query);

                    if (nombre.length() > 0) {
                        ps.setString(1, nombre);
                        ps.setInt(2, Integer.parseInt(edad));
                        ps.setDouble(3, Double.parseDouble(estatura));
                        int x = ps.executeUpdate();
                    } else {
                        nombre = "campos vacios";
                    }
/*
                    if (x != -1) {
                        nombre = "INSERCION CORRECTA";
                    } else {
                        nombre = "ERROR";
                    }
*/
                } catch (Exception e) {
                    nombre = "ERROR 1";
                }

            }
        %>





        <form>
            <input type="text" name="nombre" value="<%=nombre%>" />
            <input type="text" name="edad" value="<%=edad%>" />
            <input type="text" name="estatura" value="<%=estatura%>" />
            <input type="submit" name="insertar" value="INSERTAR" />
        </form>

    </body>
</html>
