<%-- 
    Document   : arithmeticcalculator
    Created on : June 1, 2021, 3:01:41 AM
    Author     : 809562
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    <a href="../../src/java/servlets/ArithmeticCalculatorServlet.java"></a>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
       
        <form method="post" action="arithmetic">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
        <input type="submit" value="+" name="add" >
        <input type="submit" value="-" name="minus">
        <input type="submit" value="*" name="multiply">
        <input type="submit" value="%" name="modulos">
        <br>
        </form>
        <p>Result: ${result}</p>
        <a href="age"> Age Calculator </a>
            
          
    </body>
</html>
