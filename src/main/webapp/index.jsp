

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int count = 0; %>
<% count += 1; %>
<html>
<head>
    <title><%="Title"%></title>
</head>
<body>
<%--this is a jsp comment--%>
<!--this is an html comment-->
    <h1>Implicit objects in action: </h1>
    <p>Path: <%= request.getRequestURL()%></p>
    <p>Query String: <%= request.getQueryString()%></p>
    <p>"name" parameter: <%=request.getParameter("name")%></p>
    <p>"Method" attribute <%=request.getMethod()%></p>

    <h1>Count is <%=count%></h1>

    <h2>EL / Expression Language</h2>
    <p>"name" parameter: ${param["name"]}</p>

    <p>${2 + 2}</p>

    <c:if test="false">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="true">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
