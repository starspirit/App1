<%--
  Created by IntelliJ IDEA.
  User: Xiang
  Date: 4/12/2014
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Admin Login</h1>
    <form action="${pageContext.request.contextPath}/LoginAction?flag=login" method="post" >
        <table>
            <tr><td>ID:</td><td><input type="text" name="id" /></td></tr>
            <tr><td>PW:</td><td><input type="password" name="pwd" /></td></tr>
            <tr><td><input type="submit" value="Log In" /></td><td><input type="reset" value="Reset" /></td></tr>
        </table>
    </form>
</body>
</html>
