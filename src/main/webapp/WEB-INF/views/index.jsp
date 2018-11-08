<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<div align="center">
    <h1>Calculator</h1>
    <hr>
    <form action="/result" method="get">
        <input type="text" name="fistnum" value="0">
        <input type="text" name="secondnum" value="0"><br><br>
        <input type="submit" name="cal" value="Addition(+)">
        <input type="submit" name="cal" value="Subtraction(-)">
        <input type="submit" name="cal" value="Multiplication(X)">
        <input type="submit" name="cal" value="Division(/)"><br><br>
        <h2>Result ${cal}: ${result}</h2>
    </form>
</div>

</body>
</html>
