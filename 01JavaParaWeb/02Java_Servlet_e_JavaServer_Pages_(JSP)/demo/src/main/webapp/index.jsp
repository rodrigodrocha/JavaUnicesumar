<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bem-vindo!</title>
</head>
<body>
    <h2>Digite seu nome: </h2>
    <form action="hello-servlet" method="post">
        <input type="text" name="nome">
        <input type="submit" value="Enviar">
    </form>
</body>
</html>