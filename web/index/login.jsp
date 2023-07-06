<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>会员登录</title>
    <link rel="stylesheet" type="text/css" href="../css/login.css">
    <link rel="stylesheet" type="text/css" href="../css/style.css">

</head>
<body>
<!-- login -->
<div class="top center">
    <div class="logo center">
        <a href="/index/index.jsp" target="_blank"><img src="./image/logo.png" alt=""></a>
    </div>
</div>
<form  method="post" action="/index/doLogin" class="form center">
    <div class="login">
        <div class="login_center">
            <div class="login_top">
                <div class="left fl">会员登录</div>
                <div class="right fr">您还不是我们的会员？<a href="/index/register" target="_self">立即注册</a></div>
                <div class="clear"></div>
                <div class="xian center"></div>
            </div>
            <div class="login_main center">
                <div class="username">用户名:&nbsp;<input class="shurukuang" type="text" name="username" placeholder="请输入你的用户名" /></div>
                <div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;<input class="shurukuang" type="password" name="password" placeholder="请输入你的密码" /></div>
                <div class="username">
                    <div class="left fl">验证码:&nbsp;<input class="yanzhengma" type="text" name="checkCode" placeholder="请输入验证码"/></div>
                    <%--<div class="right fl"><img src="./image/rmcc.jpg"></div>--%>
                    <img alt="验证码" id="imagecode" src="<%= request.getContextPath()%>/imageServlet"/>

                    <%--<div class="login_top">--%>
                    <div class="panel-body" style="padding:50px; padding-bottom:200px; padding-top:20px;">
                        <div class="left fl">
                            超级管理员：<input type="radio" name="role" value="0">
                            卖家：<input type="radio" name="role" value="1">
                            买家：<input type="radio" name="role" value="2">
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="login_submit">
                <input class="submit" type="submit" name="submit" value="立即登录" >
            </div>

        </div>
    </div>
</form>
<footer>
    <div class="mt20">
        星火小仓：做最好的电子元件商城
        <br>
        欢迎联系我们：100800600
        <br>
        地址：西安电子科技大学南校区
    </div>

</footer>
</body>
</html>