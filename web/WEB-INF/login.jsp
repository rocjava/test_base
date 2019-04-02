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
    <meta http-equiv="Content-Type" content="test/html; charset=UTF-8">
    <title>登录</title>
</head>
<body>
    <fieldset>
        <legend>登录</legend>
        <br>
        <form action="login.do" method="post" name="login">
            <label for="userName">用户名</label>
            <input type="text" name="userName" id="userName">
            <br><br>
            <label for="passCode">密&nbsp;&nbsp;&nbsp;码</label>
            <input type="text" name="passCode" id="passCode">
            <br><br>
            <button type="submit">登录</button>
        </form>
    </fieldset>
</body>
</html>
