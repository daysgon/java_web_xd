<%--
  Created by IntelliJ IDEA.
  User: xbfddn
  Date: 2023/7/5
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>表单及其美化</title>
</head>
<style>
    body{
        background-image: url(landscape.jpg);
        background-position: center center;
        background-size: cover;}
    .demo{
        padding: 50px;
        height: 80%;
        width: 40%;
        margin: 0px auto;
        background-color:azure;}
    .div{
        width: 300px;
        margin: 0 auto;
        padding: 15px;}
    p{
        color: red;
        float:left;
        margin-left: 20%;}
</style>
<body><div class="demo">
    <div class="div" style="font-size: 20px;color:red;">请注册个人信息:</div>
    <p>*</p><div class="div">
    姓名：<input id="Na" type="text" class="inputs" onchange="Name()"/>
    <div id="name" class="red" style="color: red;"></div></div>
    <div class="div">
        性别：<input name="sex" type="radio" value="男" checked/>男 <input name="sex" type="radio" value="女"/>女</div>
    <div class="div">
        出生日期：<select id="year"><script type="text/javascript">
        for(var i=2000;i<=2022;i++){
            document.write("<option value="+i+">"+i+"</option>");}
    </script></select>年
        <select id="month"><script type="text/javascript">
            for(var i=1;i<=12;i++){
                document.write("<option value="+i+">"+i+"</option>");}
        </script></select>月
        <select id="day"><script type="text/javascript">
            for(var i=1;i<=31;i++){
                document.write("<option value="+i+">"+i+"</option>");}
        </script></select>日</div>
    <p>*</p><div class="div">
    院校名称：<input id="Un" type="text" class="inputs" onchange="University()"/>
    <div id="un" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    所属学院：<input id="Co" type="text" class="inputs" onchange="College()"/>
    <div id="co" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    专业班级：<input id="Cl" type="text" class="inputs" onchange="Class()"/>
    <div id="cl" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    个人学号：<input id="Num" type="text" class="inputs" onchange="Number()"/>
    <div id="num" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    注册用户名：<input id="user" type="text"  class="inputs" onchange="checkUser()"/>
    <div id="userId" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    请输入密码：<input id="pwd" type="password"  class="inputs" onchange="checkPwd()"/>
    <div id="pwdId" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    请确认密码：<input id="repwd" type="password"  class="inputs" onchange="checkRepwd()"/>
    <div id="repwdId" class="red" style="color: red;"></div></div>
    <p>*</p><div class="div">
    输入电子邮箱：<input id="email" type="text"  class="inputs" onchange="test()" />
    <div id="emailId" class="red" style="color: red;"></div></div>
    <div class="div">
        <input name="sub" type="submit" value="注册" onchange="test()"/>
        <input name="cancel" type="reset" value="清除"/></div>
    </div>

    </div>
</body></html>


<script type="text/javascript" language="javascript">
    function Name(){
        var Na=document.getElementById("Na").value;
        var reg=/^[\u4e00-\u9fa5]{0,}$/;
        if (!reg.test(Na)){
            document.getElementById("name").innerHTML="姓名只能由汉字组成";
            return false;}
        document.getElementById("name").innerHTML="输入成功";
        return true;}
    function University(){
        var Un=document.getElementById("Un").value;
        var reg=/^[\u4e00-\u9fa5]{0,}$/;
        if (!reg.test(Un)){
            document.getElementById("un").innerHTML="学校名称由汉字组成";
            return false;}
        document.getElementById("un").innerHTML="输入成功";
        return true;}
    function College(){
        var Co=document.getElementById("Co").value;
        var reg=/^[\u4e00-\u9fa5]{0,}$/;
        if (!reg.test(Co)){
            document.getElementById("co").innerHTML="学院名称由汉字组成";
            return false;}
        document.getElementById("co").innerHTML="输入成功";
        return true;}
    function Class(){
        var Cl=document.getElementById("Cl").value;
        var reg=/^[\u4e00-\u9fa5]{0,}$/;
        if (!reg.test(Cl)){
            document.getElementById("cl").innerHTML="数字请输入大写形式";
            return false;}
        document.getElementById("cl").innerHTML="输入成功";
        return true;}
    function Number(){
        var Num=document.getElementById("Num").value;
        var reg=/^\d{11}$/;
        if (!reg.test(Num)){
            document.getElementById("num").innerHTML="学号必须为11位数字";
            return false;}
        document.getElementById("num").innerHTML="输入成功";
        return true;}
    function checkUser(){
        var user=document.getElementById("user").value;
        var reg=/^\w{4,12}$/;
        if (!reg.test(user)){
            document.getElementById("userId").innerHTML="由字母、数字和下划线组成的4-16位字符";
            return false;}
        document.getElementById("userId").innerHTML="输入成功";
        return true;}
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
    function checkEmail(){
        var email=document.getElementById("email").value;
        var reg=/^\w+@\w+(\.[a-zA-Z]{2,3}){1,2}$/;
        if (!reg.test(email)){
            document.getElementById("emailId").innerHTML="Email格式不正确,例如web@sohu.com";
            return false;}
        document.getElementById("emailId").innerHTML="输入成功";
        return true;}
    function test(){
        if (!Name()||!University()||!College()||!Class||!Number()||!checkUser()||!checkEmail()||!checkPwd()||!checkRepwd()){
            alert("请将注册信息填写完整!");
            return false;}
        return true;}
</script>