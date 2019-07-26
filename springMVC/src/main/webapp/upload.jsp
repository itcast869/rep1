<%--
  Created by IntelliJ IDEA.
  User: jgt44
  Date: 2019/7/16
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick17" method="post" enctype="multipart/form-data">
    姓名<input type="text" name="name"><br>
    文件<input type="file" name="uplaodFile"><br>
    文件<input type="file" name="uplaodFile"><br>
    <input type="submit" name="提交">
</form>

</body>
</html>
