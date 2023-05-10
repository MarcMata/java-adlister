<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 5/10/23
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a Color</title>
</head>
<body>

    <form action="/viewcolor" method="POST">
        <label for="color-picker">Select a color for your background: </label>
        <input type="text" name="color-picker" id="color-picker">
    </form>

</body>
</html>
