<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/7 0007
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
register:<br>
<form action="/photographer/register" method="post">
    id:<input type="text" name="userId"><br>
    name:<input type="text" name="realyName"><br>
    ID:<input type="text" name="ID_number"><br>
    sex:<input type="text" name="sex"><br>
    <input type="submit" value="submit">
</form>
changeIntro:<br>
<form action="/photographer/changeIntro" method="post">
    id:<input type="text" name="photographerId"><br>
    intro:<input type="text" name="intro"><br>
    <input type="submit" name="submit">
</form>
getPhotographerDetailsById:<br>
<form action="/photographer/getPhotographerDetailsById" method="post">
    id:<input type="text" name="photographerId"><br>
    <input type="submit" name="submit">
</form>
</body>
</html>
