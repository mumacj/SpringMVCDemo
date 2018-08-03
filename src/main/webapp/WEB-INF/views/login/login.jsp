<%--
  Created by IntelliJ IDEA.
  User: NCJ
  Date: 2018/8/3
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body>
    <h2>测试</h2>
    <form action="/Login/login" method="get">
        <label style="width:50px;float:left;text-align:right;">用户名</label>
        <input name="username" type="text"/><br/>
        <label style="width:50px;float:left;text-align:right;">密码</label>
        <input name="password" type="text"/>
        <br>
        <input type="submit" value="登录"/>
    </form>
    <span style="color: red">
        ${errorMsg}
    </span>
</body>
</html>
