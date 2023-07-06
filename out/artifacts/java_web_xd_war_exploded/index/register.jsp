<%--
  Created by IntelliJ IDEA.
  User: xbfddn
  Date: 2023/7/5
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="/css/login.css">

</head>
<body>
<form  method="post" action="/index/doRegister">
    <div class="regist">
        <div class="regist_center">
            <div class="regist_top">
                <div class="left fl">会员注册</div>
                <div class="right fr"><a href="/index/index" target="_self">星火小仓</a></div>
                <div class="clear"></div>
                <div class="xian center"></div>
            </div>
            <div class="regist_main center">
                <div class="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;<input id="username" class="shurukuang" type="text" name="username" placeholder="请输入你的用户名"/><span>请填写唯一的用户名</span></div>
                <div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;<input id="pwd" class="shurukuang" type="password" name="password" placeholder="请输入你的密码" onchange="checkPwd()" onchange="checkRepwd()"/>
                    <span id="pwdId" class="red" style="color: red;">请输入6-12位字符</span></div>
                <div class="username">确认密码:&nbsp;&nbsp;<input id="repwd" class="shurukuang" type="password" name="repassword" placeholder="请确认你的密码" onchange="checkRepwd()"/>
                    <span id="repwdId" class="red" style="color: red;">两次密码要输入一致哦</span>
                </div>
                <div class="username">手&nbsp;&nbsp;机&nbsp;&nbsp;号:&nbsp;&nbsp;<input id="phone" class="shurukuang" type="text" name="phone" placeholder="请填写正确的手机号" onchange="Phone()"/>
                    <span id="phoneId" class="red" style="color: red;">填写下手机号吧，方便我们联系您！</span>
                </div>
                <div class="username">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:&nbsp;&nbsp;<input id="email" class="shurukuang" type="text" name="email" placeholder="请填写正确的邮箱号" onchange="checkEmail()"/>
                    <span id="emailId" class="red" style="color: red;">填写下邮箱吧，方便我们联系您！</span>
                </div>
                <div class="username">角&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;色:&nbsp;&nbsp;
                        <select id="role" name="role" class="shurukuang" >
                            <option value="1">卖家</option>
                            <option value="2">买家</option>
                        </select>
                </div>
                <div class="username">
                    <div class="left fl">验&nbsp;&nbsp;证&nbsp;&nbsp;码:&nbsp;&nbsp;<input id="yzm" class="yanzhengma" type="text" name="checkCode" placeholder="请输入验证码" onchange="test()"/></div>
                    <img alt="验证码" id="imagecode" src="<%= request.getContextPath()%>/imageServlet"/>
                    <%--<div class="right fl"><img src="/index/image/rmcc.jpg"></div>--%>
                    <div class="clear"></div>
                </div>
                <%--<form action="<%= request.getContextPath()%>/loginServlet" method="get" >--%>
            </div>
            <div class="regist_submit">
                <input class="submit" type="submit" name="submit" value="立即注册" >
            </div>

        </div>
    </div>
</form>
</body>
</html>



<script>

    function checkPwd(){
        var pwd=document.getElementById("pwd").value;
        var reg=/^[a-zA-Z0-9]{4,12}$/;
        var reg1=/^\d{4,12}$/;
        if (!reg.test(pwd)){
            document.getElementById("pwdId").innerHTML="密码长度为6-12个字符";
            return false;}
        if (reg1.test(pwd)){
            document.getElementById("pwdId").innerHTML="密码设置太简单";
            return false;}
        document.getElementById("pwdId").innerHTML="输入成功";
        return true;}
    function checkRepwd(){
        var repwd=document.getElementById("repwd").value;
        var pwd=document.getElementById("pwd").value;
        if (pwd!=repwd){
            document.getElementById("repwdId").innerHTML="两次输入的密码不一致";
            return false;}
        document.getElementById("repwdId").innerHTML="输入成功";
        return true;}
    function Phone(){
        var phone=document.getElementById("phone").value;
        var reg=/^\d{11}$/;
        if (!reg.test(phone)){
            document.getElementById("phoneId").innerHTML="手号必须为11位数字";
            return false;}
        document.getElementById("phoneId").innerHTML="输入成功";
        return true;}
    function checkEmail(){
        var email=document.getElementById("email").value;
        var reg=/^\w+@\w+(\.[a-zA-Z]{2,3}){1,2}$/;
        if (!reg.test(email)){
            document.getElementById("emailId").innerHTML="Email格式不正确,例如web@sohu.com";
            return false;}
        document.getElementById("emailId").innerHTML="输入成功";
        return true;}
    function test(){
        if (!checkPwd()||!checkRepwd()||!Phone()||!checkEmail()){
            alert("请将注册信息填写完整!");
            return false;}
        return true;}
</script>