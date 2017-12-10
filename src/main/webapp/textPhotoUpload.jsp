<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/10 0010
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/PhotographyPics/filesUpload" method="post" enctype="multipart/form-data">
    <input type="text" name="album_id"><br>
    file:<input type="file" name="file"><br>
    file:<input type="file" name="file"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
