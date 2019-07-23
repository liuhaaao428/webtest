<%--
  Created by IntelliJ IDEA.
  User: liuhao
  Date: 2019/4/24
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.util.*"%>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1 style="text-align: center">
    别嫌丑了，再丑也是亲生的
</h1>
<center>
    <table>
        <form action="loginServlet" method="post" style="padding-top:-700px;">
            username:<input type="text" name="username" value=""><br><br>
            pswd:    <input type="password" name="password" value=""><br><br>
            <input type="submit" value="login" name="login">
        </form>
        <form action="register.jsp">
            <input type="submit" value="register">
        </form>
        <button action="WEB-INF/admin.jsp" mrthod="post" >
            admin
        </button>
    </table>
</center>
</body>
</html>
