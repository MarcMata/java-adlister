<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order the Za</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<h1>Order the Za</h1>
    <form action="/pizza-order" method="POST">
        <label for="crust">Select your crust type: </label>
        <select name="crust" id="crust">
            <option value="normal">Normal</option>
            <option value="thin">Thin</option>
            <option value="thick">Thick</option>
            <option value="stuffed">Stuffed</option>
        </select>
        <br>
        <label for="sauce-type">Select your sauce: </label>
        <select name="sauce-type" id="sauce-type">
            <option value="marinara">Marinara</option>
            <option value="bbq">BBQ</option>
            <option value="alfredo">Alfredo</option>
        </select>
        <br>
        <p>Select your Toppings: </p>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" name="toppings" value="pepperoni" id="pepperoni">
        <label for="sausage">Sausage</label>
        <input type="checkbox" name="toppings" value="sausage" id="sausage"><br>
        <label for="bacon">Bacon</label>
        <input type="checkbox" name="toppings" value="bacon" id="bacon">
        <label for="pineapple">Pineapple</label>
        <input type="checkbox" name="toppings" value="pineapple" id="pineapple"><br>
        <br>

        <label for="address">Address: </label>
        <input type="text" name="address" id="address">
        <br>

        <input type="submit" value="submit">
    </form>


</body>
</html>
