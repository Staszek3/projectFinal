<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

</head>

<body>

<%--<h1>Please fill the data in the form below.</h1>--%>
<h1>Który wiersz chcesz usunać</h1>
<br>

<form action="/usunWpis" method="post">


    <input type="text" name="id"> Wpisz numer wiersza <br><br>

    <input type="submit" value="usunWiersz">
</form>
