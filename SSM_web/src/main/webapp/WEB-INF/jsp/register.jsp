<%--
  Created by IntelliJ IDEA.
  User: huo
  Date: 2019/7/16
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<font color="red">
    <%-- 提示信息--%>
    <span id="message">${msg}</span>
</font>
<form action="${pageContext.request.contextPath }/Account/register"
      method="post">
    <br/> 用户名:<input type="text" name="username"/><br/>
    密&nbsp&nbsp&nbsp码:<input type="text" name="password"/><br/> <input
        type="submit" value="注册"/>
</form>
</body>
</html>
