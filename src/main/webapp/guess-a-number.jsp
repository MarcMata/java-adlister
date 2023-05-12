<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 5/10/23
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a number</title>
</head>
<body>
<h2>Lets play a game!</h2>

    <form action="/guess" method="POST">
        <label for="numbers">Pick a number between 1 and 3: </label>
        <select name="numbers" id="numbers">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>

        <input type="submit" id="submit">
    </form>

</body>
</html>
