<%--
  Created by IntelliJ IDEA.
  User: 86130
  Date: 2020/12/2
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>success</h3>

${list}

<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
