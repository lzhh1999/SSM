<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <script>
        // 判断是登录账号和密码是否为空
        // #username识别id   .username识别name
        function check() {
            var usercode = $("#username").val();
            var password = $("#password").val();
            if (usercode == "" || password == "") {
                $("#message").text("账号或密码不能为空！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<font color="red">
    <%-- 提示信息--%>
    <span id="message">${msg}</span>
</font>
<form action="${pageContext.request.contextPath }/Account/login" method="post" onsubmit="return check()">
    <!-- name与后台交互 -->
    账&nbsp;号：<input id="username" type="text" name="username"/>
    密&nbsp;码：<input id="password" type="password" name="password"/>
    <br/><br/>

    <input type="submit" value="登录"/>
</form>
<a href="${pageContext.request.contextPath}/Account/toregister">注册</a>
</body>
</html>