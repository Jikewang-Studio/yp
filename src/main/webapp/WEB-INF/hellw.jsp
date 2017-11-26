<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/19
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>员工列表</title>
    <%--web路劲：
    不以/开始的相对路径，找资源，以当前资源的路径为标准，经常容易出问题。
    以/开始的相对路径，找资源，以服务器的路径为标准：（http://localhost:3306）；
      需要加上项目名
       http://localhost:3306/ssmcrud
    --%>
    <script type="text/javascript" src="/ssmcrud/static/js/jquery-1.9.1.min.js"></script>
    <%--引入样式--%>
    <link href="/ssmcrud/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css"  rel="stylesheet"/>
    <script src="/ssmcrud/static/bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>

<%--搭建系那是页面--%>
<div class="container">
    <%--标题行--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%--按钮行--%>
    <div class="row">
        <div class="col-md-12">
            <h2>哈哈</h2>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row"></div>
    <%--显示分页信息--%>
    <div class="row"></div>
</div>
</body>
</html>

