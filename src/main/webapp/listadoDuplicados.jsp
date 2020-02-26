<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de butacas duplicadas</title>
    </head>
    <body>
        <h1>Listado de butacas duplicadas</h1>
        <ul>
            <c:forEach items="${entradas}" var="entrada">
                <li> Sala: ${entrada.sala} <br> Asiento: ${entrada.asiento}</li>
            </c:forEach>
        </ul>

    </body>
</html>
