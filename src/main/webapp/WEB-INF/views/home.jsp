<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-06-28
  Time: 오전 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>홈 jsp</h1>
<div>
    <c:forEach begin="1" end="3">
        <p>hello </p>
    </c:forEach>
</div>
<div>
    <c:forEach items="${studyList }" var="study">
        <p>name: ${study.name} : age : ${study.age}</p>
    </c:forEach>
</div>
</body>
</html>
