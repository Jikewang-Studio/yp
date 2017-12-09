<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/9 0009
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>textAlbum</title>
</head>
<body>
createAlbum:<br>
<form action="/album/createAlbum.action" method="post">
    photographer_id:<input type="text" name="photographer_id"><br>
    albumName:<input type="text" name="albumName"><br>
    alnumAddress:<input type="text" name="alnumAddress"><br>
    <input type="submit" name="submit">
</form>
getPhotoIdAndUrlByAlbumId:<br>
<form action="/album/getPhotoIdAndUrlByAlbumId" method="post">
    AlbumId:<input type="text" name="AlbumId"><br>
    <input type="submit" name="submit">
</form>
</body>
</html>
