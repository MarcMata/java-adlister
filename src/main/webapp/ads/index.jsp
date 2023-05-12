<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>
  
    <title>Ads</title>
</head>
<body>

<h1>Ads</h1>
<h1>Here are all the Ads:</h1>

<c:forEach var="ad" items="${ads}">
  <div class="Ad">
    <p>Ad id: ${ad.id}</p>
    <h2>Subject: ${ad.title}</h2>
    <p>Description: ${ad.description}</p>
    <p>User id:${ad.userId}</p>
  </div>
</c:forEach>
  
</body>
</html>