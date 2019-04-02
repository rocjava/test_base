<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <h4>欢迎使用test_java_servlet系统!</h4>
    <div style="color: sandybrown;font-size: 17px;">你好，<%=session.getAttribute("userName")%></div>
</body>
</html>
