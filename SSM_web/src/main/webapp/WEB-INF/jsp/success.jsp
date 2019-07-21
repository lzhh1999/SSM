<%--
  Created by IntelliJ IDEA.
  User: huo
  Date: 2019/7/21
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>自动调转</title>
    <style>
        p {
            text-align: center;
        }

        span {
            color: red;
        }
    </style>
</head>
<body>
<font color="red">
    <%-- 提示信息--%>
    <span id="message">${msg}</span>
</font>
<p>
    <span id="time">5</span>秒之后，自动跳转到<a href="${pageContext.request.contextPath }/Account/login">登录界面</a>...
</p>
<script>
    var second = 5;
    var time = document.getElementById("time");

    function showTime() {
        second--;
        if (second <= 0) {
            location.href = "${pageContext.request.contextPath }/Account/login";
        }
        time.innerHTML = second + "";

    }

    setInterval(showTime, 1000);
</script>
</body>
</html>