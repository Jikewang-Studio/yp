<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/27
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有用户信息</title>
</head>
<body>
<table>
    <tr>
        <th>昵称</th>
        <th>手机号</th>
        <th>邮箱</th>
        <th>该用户约拍次数</th>
    </tr>
    <c:forEach items="${pageInfo.pageInfo}" var="user">
        <tr>
            <th>${user.userName}</th>
            <th>${user.phoneNumber}</th>
            <th>${user.email}</th>
            <th>${user.userSuccessTimes}</th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
