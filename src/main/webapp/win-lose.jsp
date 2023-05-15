<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Did you win?</title>
</head>
<body>

<c:choose>
    <c:when test="${didWin}">
        <h1>YOU WIN</h1>
    </c:when>
    <c:otherwise>
        <h2>YOU LOSE</h2>
    </c:otherwise>
</c:choose>


</body>
</html>
