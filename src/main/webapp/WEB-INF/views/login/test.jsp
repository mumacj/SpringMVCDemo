<%--
  Created by IntelliJ IDEA.
  User: 10630
  Date: 2018/8/3
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Ajax</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body>
    <input type="text" id="username">
    <button onclick="checkUsername()">检测</button>
    <span id="show" style="color:red;"></span>
    <button onclick="getAllUsers()">全部用户</button>
    <script>
        function checkUsername() {
            var name = $("#username").val();
            $.ajax({
                url:"${pageContext.request.contextPath}/Login/CheckUsername",
                type:"post",
                data:{"username":name},
                dataType:"html",
                success: function(msg) {
                    $("#show").html(msg);
                }
            });
        }

        function getAllUsers() {
            $.ajax({
                url:"${pageContext.request.contextPath}/Login/getAllUsers",
                type:"post",
                dataType:"json",
                success:function (msg) {
                    $.each(msg,function (i,u) {
                        $("#show").append(("<p>" + u.id + "," + u.username + "," + u.password + "</p>"));
                    })
                }
            });
        }
    </script>
</body>
</html>
