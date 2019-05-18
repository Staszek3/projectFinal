<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

</head>

<body>

<%--<h1>Please fill the data in the form below.</h1>--%>
<h1>Prosze wpisać dane w poniższy formularz.</h1>
<br>

<form action="/nowyWpis" method="post">
    <%--<input type="text" name="content"> Content<br><br>--%>
    <textarea name="contentOfEntry" id=" " rows="3" cols="50">wpisz jakiś post po polsku; max 150 znaków</textarea><br><br>
    <input type="text" name="data"> Data wpisu (postu)<br><br>
    <input type="text" name="status"> Status wpisu<br><br>
    <input type="text" name="tape"> Typ wpisu  <br><br>
    <input type="text" name="nameOfAcount"> Opisowa nazwa konta użytkownika<br><br>
    <input type="submit" value="Add">
</form>

</body>

</html>