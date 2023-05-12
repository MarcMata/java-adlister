
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/head.jsp"/>
<body>
<jsp:include page="partials/navbar.jsp"/>
    <h1>ADMIN</h1>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <div class="container">

        <h1>Welcome to your profile ${username}</h1>
        <p>Your language preference is ${language}</p>

        <h1>Viewing your profile Mr.${user}.</h1>
        <button><a href="logout">Logout</a></button>

    </div>

</body>
</html>
