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
    <script>
        //页面加载完成后执行事件
        window.onload = function () {
            //1.给表单绑定onsubmit事件
            document.getElementById("form").onsubmit = function () {
                //调用验证方法
                return checkUsername() && checkPassword();
                //给用户名和密码框分别绑定离焦事件
            }
            document.getElementById("username").onblur = checkUsername;
            document.getElementById("password").onblur = checkPassword;
        }

        //验证用户名
        function checkUsername() {
            //获取用户名的值
            var username = document.getElementById("username").value;
            //定义正则表达式
            ///^[\u4E00-\u9FA5\uf900-\ufa2d\w]{4,16}$/中文、英文、数字、下划线
            var reg_username = /^\w{6,12}$/;
            //判断值是否符合正则的规则
            var flag = reg_username.test(username);
            //提示信息
            var s_username = document.getElementById("s_username");

            if (flag) {
                //提示绿色对勾
                s_username.innerHTML = "<font color='green'>√<font>";
            } else {
                //提示红色用户名有误
                s_username.innerHTML = "<font color='red'>请输入6到12位用户名<font>";
            }
            return flag;
        }

        //验证密码
        function checkPassword() {
            //获取用户名的值
            var password = document.getElementById("password").value;
            //定义正则表达式
            var reg_password = /^\w{6,12}$/;
            //判断值是否符合正则的规则
            var flag = reg_password.test(password);
            //提示信息
            var s_password = document.getElementById("s_password");

            if (flag) {
                //提示绿色对勾
                s_password.innerHTML = "<font color='green'>√<font>";
            } else {
                //提示红色用户名有误
                s_password.innerHTML = "<font color='red'>请输入6到12位用户名<font>";
            }
            return flag;
        }
    </script>
</head>
<body>
<span id="message">${msg}</span>
<form action="${pageContext.request.contextPath }/Account/register" id="form"
      method="get">
    <br/> 用户名:<input type="text" name="username" id="username" placeholder="请输入用户名"/>
    <span id="s_username"></span><br/>
    密&nbsp&nbsp&nbsp码:<input type="password" name="password" id="password" placeholder="请输入密码"/>
    <span id="s_password"></span><br/>
    <input type="submit" value="注册"/>&nbsp&nbsp&nbsp<input type="reset" value="重新输入"><br/>
    <a href="${pageContext.request.contextPath }/Account/login">返回登录页面</a>
</form>
</body>
</html>
