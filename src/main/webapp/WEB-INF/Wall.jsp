<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: center;
        }
    </style>

</head>

<body>

<h1>
    <%--List of posts actually published--%>
   Pełna lista aktualnych postów (wpisów)
</h1>

<%int counter = 1;%>

<ol>
    <c:forEach var="i" items="${entryList}">

        <table>

            <tr>

                <th>Id</th>
                <th>Data utworzenia wpisu</th>
                <th>Status</th>
                <th style="width:100px">Type</th>
                <th>Dokonujący wpisu wg nazwy opisowej konta</th>
                <th>Treść postu (wpisu)</th>
            </tr>

            <tr>
                <td><%=counter%></td>
                <td>${i.getData()}</td>
                <td>${i.getStatus()}</td>
                <td style="width:100px">${i.getTape()}</td>
                <td>${i.getUsers().getNameOfAcount()}</td>
                <td>${i.getContentOfEntry()}</td>
            </tr>

            <% counter = counter + 1;%>

        </table>
        <br>

    </c:forEach>
</ol>

<a href="/dodajWpis"><h2>DodajWpis</h2></a>

</body>

</html>