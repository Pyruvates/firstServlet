<%--
  Created by IntelliJ IDEA.
  User: Koshkarov Vitaliy
  Date: 11.12.2019
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>First JSP</h1>
    <p>
        <%="Required string returned by Java"%>
    </p>

    <p>
        <% final int num = 42;%>
        <%= "Number: " + num%>
    </p>
</body>
</html>
