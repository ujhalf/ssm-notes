<%--
  Created by IntelliJ IDEA.
  User: 86130
  Date: 2020/12/2
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>入门程序</h3>
<a href="account/findAll">查询所有</a>
<h3>测试保存</h3>
<form action="account/save" method="post">
    姓名:<input type="text" name="name"></br>
    金额:<input type="text" name="money"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>
