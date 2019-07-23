<%--
  Created by IntelliJ IDEA.
  User: liuhao
  Date: 2019/4/30
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <center>
        <table>
            <form action="registerServlet" method="post" style="padding-top:-700px;">
                username:<input type="text" name="username" value=""><br><br>
                password:    <input type="password" name="password" value=""><br><br>
                verify pswd: <input type="password" name="verify pswd" value>
                sex:     <input type="sex" name="sex" value=""><br><br>
                home:    <input type="home" name="home" value=""><br><br>
                info     <input type="info" name="info" value=""><br><br>
                <input type="submit" value="register" name="register">
            </form>
        </table>

    </center>
</body>
</html>
