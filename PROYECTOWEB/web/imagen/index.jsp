<%@page contentType="text/html" pageEncoding="UTF-8"%>

<style>
    .redondo {
        width: 200px;
        height: 200px;
        border: 2px solid black;
        border-radius: 100px;
    }
</style>

<%!
    int[] codigo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] nombre = {"Mario", "Vanessa", "Javier", "Miguel", "Carlos", "Luis", "Melissa", "María", "Arturo", "Jose"};
%>

<form action="" method="post">
    <p>
        Seleccione una persona para ver su imagen(ComboBox selelección simple)
        <select name="cboPersona" size="1">
            <option selected>Seleccionar</option>
            <option value="9">Arturo</option>
            <option value="5">Carlos</option>
            <option value="3">Javier</option>
            <option value="10">Jose</option>
            <option value="6">Luis</option>
            <option value="1">Mario</option>
            <option value="8">María</option>
            <option value="7">Melissa</option>
            <option value="4">Miguel</option>
            <option value="2">Vanessa</option>
        </select>
        <input type="submit" name="accion" value="Enviar" />
    </p>
</form>

<%
    if (request.getParameter("accion") != null) {
        String codigo = request.getParameter("cboPersona");
        if (codigo.equalsIgnoreCase("Seleccionar")) {
            out.println("ComboBox codigo de persona no seleccionado" + "</br>");
        } else {
            int index = Integer.parseInt(codigo);
            out.println("Código de persona: " + codigo + " " + nombre[index - 1] + "</br>");
            String ruta = request.getContextPath() + "/imagen/imagen/" + index + ".png";
%>
<img class="redondo" src="<%= ruta%>">
<%
            out.println("Ruta: " + ruta);
        }
    }
%>

<!--<!--

http://localhost:8080//PROYECTOWEB/imagen/index.jsp

-->
