<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<div align="center">
    <h1>Calculator</h1>
    <hr>
    <form method="get" action="/calculator">
        <td><input type="number" name="fistnum" value="0"></td>
        <td><input type="number" name="secondnum" value="0"></td>
        <br><br>
        <td><input type="submit" name="calculate" value="Addition"></td>
        <td><input type="submit" name="calculate" value="Subtraction"></td>
        <td><input type="submit" name="calculate" value="Multiplication"></td>
        <td><input type="submit" name="calculate" value="Division"></td>
        <br><br>
        <h2>Result: ${result}</h2>
    </form>
</div>
</body>
</html>
