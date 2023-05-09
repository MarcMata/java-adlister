<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equals("POST")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String adminUsername = "admin";
        String adminPassword = "password";

        if(username.equalsIgnoreCase(adminUsername) && password.equals(adminPassword)){
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>

<html>
    <jsp:include page="partials/head.jsp"/>
    <body>
    <jsp:include page="partials/navbar.jsp"/>
        <form action="login.jsp" method="POST">
            <label for="username">Username</label>
            <input type="text" name="username" id="username">
            <label for="password">Password</label>
            <input type="password" name="password" id="password">
            <input type="submit" value="submit">
        </form>
    </body>

</html>
