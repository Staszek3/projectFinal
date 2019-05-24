<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

</head>

<body>

<h1>Dane do rejestracji konta użytkownika</h1>
<br>

<form action="/rejestracja" method="post">
    <%--<input type="text" name="content"> Content<br><br>--%>

    <input type="text" name="login"> Wpisz swoj adres a-mail<br><br>
    <input type="text" name="password"> Podaj hasło<br><br>
    <input type="text" name="password"> Powtórz to samo hasło<br><br>
    <input type="text" name="uniqueNameOfAccont"> Unikatowa nazwa konta  <br><br>
    <input type="text" name="nameOfAcount"> Opisowa nazwa konta użytkownika<br><br>
    <input type="submit" value="Rejestruj">
        <a href="/wall"><h2>DodajWpis</h2></a>
</form>



</body>

</html>