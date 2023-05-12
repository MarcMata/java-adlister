<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 5/10/23
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View color</title>
</head>
<body>
<style>
    body{
        <c:if test="${color != null}">
            background-color: ${color};
        </c:if>
    }
</style>

</body>
</html>
