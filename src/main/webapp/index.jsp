<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <jsp:include page="partials/head.jsp"/>
<body>
    <jsp:include page="login.jsp"/>


<%! int count = 0; %>
<% count += 1; %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Start Page"/>
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp"/>
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

    <% request.setAttribute("numbers", new int[]{222,777,31,7,14,3}); %>
    <ul>
        <c:forEach items="${numbers}" var="number">
            <li>${number}</li>
        </c:forEach>
    </ul>


    <% request.setAttribute("five", 5); %>
    <c:choose>
        <c:when test="${five > 3}">
            <p>Expression 1 is true</p>
        </c:when>
        <c:when test="${five > 2}">
            <p>Expression 2 is false</p>
        </c:when>
        <c:otherwise>
            <p>Both expressions are false</p>
        </c:otherwise>
    </c:choose>

    <c:if test="false">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="true">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
