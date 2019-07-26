<%--
  Created by IntelliJ IDEA.
  User: jgt44
  Date: 2019/7/14
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var list=new Array();
        list.push({"name":"zhagnsan","age":23});
        list.push({"name":"lisi","age":21});
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick12",
            data:JSON.stringify(list),
            contentType:"application/json;charset=utf-8"
        })
    </script>
</head>
<body>

</body>
</html>
