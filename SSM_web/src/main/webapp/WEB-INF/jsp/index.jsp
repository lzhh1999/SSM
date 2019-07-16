<%--
  Created by IntelliJ IDEA.
  User: huo
  Date: 2019/7/15
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script>
        // #username识别id   .username识别name
        function check() {
            var username = $(".username").val();
            var balance = $(".balance").val();
            if (username == "" || balance == "") {
                $("#message").text("账号或密码不能为空！");
                return false;
            }
            return true;
        }
    </script>
</head>
<font color="red">
    <%-- 提示信息--%>
    <span id="message">${msg}</span>
</font>
<br/>
<form action="${pageContext.request.contextPath }/Account/deteleAccount " onsubmit="return check()"
      method="post">
    删除用户 <br/> 用户名:<input type="text" name="username"/><br/> <input
        type="submit" value="删除"/>
</form>
<br/>
<br/>
<form action="${pageContext.request.contextPath }/Account/addAccount" onsubmit="return check()"
      method="post">
    添加用户<br/> 用户名:<input type="text" name="username"/><br/>
    余&nbsp&nbsp&nbsp额:<input type="text" name="balance"/><br/> <input
        type="submit" value="添加"/>
</form>
<br/>
<br/>
<form
        action="${pageContext.request.contextPath }/Account/findAccountByUsername" onsubmit="return check()"
        method="post">
    查询用户<br/> 用户名:<input type="text" name="username"/><br/> <input
        type="submit" value="查询"/>
</form>
<a href="${pageContext.request.contextPath}/Account/logout">退出登录</a>
</body>
</html>
