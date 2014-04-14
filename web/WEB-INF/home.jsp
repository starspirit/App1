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
    <h1>Admin Panel</h1>
    <hr />
    <a href="${pageContext.request.contextPath}/EmployeeNavController?flag=add">Add an Employee</a><br/>
    <a href="${pageContext.request.contextPath}/EmployeeNavController?flag=list">Show Employees</a><br/>
    <a href="${pageContext.request.contextPath}/EmployeeNavController?flag=find">Find an Employee</a><br/>
    <a href="${pageContext.request.contextPath}/LoginAction?flag=logout">Log out</a><br/>
</body>
</html>
