<%--
  Created by IntelliJ IDEA.
  User: jgt44
  Date: 2019/7/14
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick11" method="post">
    <input type="text" name="list[0].name"><br>
    <input type="text" name="list[0].age"><br>
    <input type="text" name="list[1].name"><br>
    <input type="text" name="list[1].age"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
