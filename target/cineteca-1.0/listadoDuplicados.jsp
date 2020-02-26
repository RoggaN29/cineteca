<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de butacas duplicadas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h3 style="text-align: center;margin: 20px 0px">Listado de butacas duplicadas</h3>
            <div class="row">
                <div class="col-12 col-md-4 offset-md-4">
                    <ul class="list-group">
                        <c:forEach items="${entradas}" var="entrada">
                            <li class="list-group-item list-group-item-action list-group-item-warning">
                                Sala: ${entrada.sala} ->
                                Asiento: ${entrada.asiento}
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
