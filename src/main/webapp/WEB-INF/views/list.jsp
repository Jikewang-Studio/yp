<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/19
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String path1 = request.getServletPath();
    System.out.println(path + "122121212121221" + path1);
%>

<html>
<head>
    <title>员工列表</title>
    <%--web路劲：
    不以/开始的相对路径，找资源，以当前资源的路径为标准，经常容易出问题。
    以/开始的相对路径，找资源，以服务器的路径为标准：（http://localhost:3306）；
      需要加上项目名
       http://localhost:3306/ssmcrud
    --%>
    <script type="text/javascript" src="static/js/jquery-1.9.1.min.js"></script>
    <%--引入样式--%>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>

<%--搭建显示页面--%>
<div class="container">
    <%--标题行--%>
    <div class="row">
        <div class="col-md-4">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%--按钮行--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>#</th>
                    <th>empName</th>
                    <th>gendr</th>
                    <th>email</th>
                    <th>deptName</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list}" var="emp">
                    <tr>
                        <th>${emp.empId}</th>
                        <th>${emp.empName}</th>
                        <th>${emp.gender=="M"?"男":"女"}</th>
                        <th>${emp.email}</th>
                        <th>${emp.department.deptName}</th>
                        <th>
                            <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑
                            </button>
                            <button class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
    <%--显示分页信息--%>
    <div class="row">
        <%--分页文字信息--%>
        <div class="col-md-6">
            当前${pageInfo.pageNum}页，总${pageInfo.pages},总${pageInfo.total}记录
        </div>
        <%--分页条信息--%>
        <div class="col-md-6">
             <nav aria-label="Page navigation">
                 <ul class="pagination">
                     <li>
                         <%--显示首页的页码--%>
                         <a href="#">首页</a>
                     </li>
                     <li>
                         <%--上一页的显示--%>
                         <a href="#" aria-label="Previous">
                             <span aria-hidden="true">&laquo;</span>
                         </a>
                     </li>
                     <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                         <c:if test="${page_Num == pageInfo.pageNum}">
                             <li class="active"><a href="#">${page_Num}</a> </li>
                         </c:if>
                         <c:if test="${page_Num != pageInfo.pageNum}">
                             <li><a href="/ssmcrud/emps?pn=${page_Num}">${page_Num}</a> </li>
                         </c:if>
                     </c:forEach>

                     <li>
                         <a href="#" aria-label="Next">
                             <%--下一页的显示--%>
                             <span aria-hidden="true">&raquo;</span>
                         </a>
                     </li>
                     <li>
                         <%--显示尾页的页码--%>
                         <a href="#">尾页</a>
                     </li>
                 </ul>

             </nav>
        </div>
    </div>
</div>
</body>
</html>
