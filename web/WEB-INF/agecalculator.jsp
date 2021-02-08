<%-- 
    Document   : agecalculator
    Created on : Feb 8, 2021, 3:04:04 AM
    Author     : judeaquino
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method ="post" action="age" >
            Enter your age: <input type="text" name="age"><br>
            
            <p>${emptyMessage}</p>
          <input type="submit" value="Age next birthday"> 
        </form>
             <a href="arithmethic"> Arithmethic Calculator </a>
    </body>
</html>
