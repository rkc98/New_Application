<%-- 
    Document   : User_Login
    Created on : Dec 19, 2019, 4:35:50 PM
    Author     : Anuj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="User_login1" method="post">  
            
            Name:<input type="text" name="username" placeholder="Enter Name"/><br/><br/>  
Password:<input type="password" name="userpass" placeholder="Enter password" /><br/><br/>  

<input type="submit" value="login"/>  

        </form>
    </body>
</html>
