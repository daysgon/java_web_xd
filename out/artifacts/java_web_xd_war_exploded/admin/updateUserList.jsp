<%--
  Created by IntelliJ IDEA.
  User: lyb
  Date: 2023/7/4
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: lyb
  Date: 2023/7/4
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>管理员-用户列表</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/pintuer.css">
    <link rel="stylesheet" type="text/css" href="../css/admin.css">
    <script src="../js/jquery.js"></script>
    <script src="../js/pintuer.js"></script>
</head>
<body>
<!-- start header -->

<!--end header -->
<!-- start banner_x -->
<div class="banner_x center">
    <a href="./index.html" target="_blank"><div class="logo fl"></div></a>
    <a href=""><div class="ad_top fl"></div></a>
    <div class="nav fl">
        <ul>
            <li><a href="">小米手机</a></li>
            <li><a href="">红米</a></li>
            <li><a href="">平板·笔记本</a></li>
            <li><a href="">电视</a></li>
            <li><a href="">盒子·影音</a></li>
            <li><a href="">路由器</a></li>
            <li><a href="">智能硬件</a></li>
            <li><a href="">服务</a></li>
            <li><a href="">社区</a></li>




        </ul>

    </div>
    <div class="navright fl">
        <ul>
            <li>
                <div  style="text-align: right">
                    <a href="./login.html" target="_blank">退出登录</a>|<a href="./register.html" target="_blank" >注册</a>|<a href="./self_info.html">返回首页</a>
                </div>

            </li>
        </ul>
    </div>

</div>
<!-- end banner_x -->
<!-- self_info -->
<div class="grzxbj">
    <div class="selfinfo center">
        <div class="lfnav fl">
            <div class="ddzx">后台管理</div>
            <div class="subddzx">
                <ul>
                    <li><a href="/admin/userlist" style="color:#ff6700;font-weight:bold;">用户管理</a></li>
                    <li><a href="/admin/handlelist">品类管理</a></li>
                    <li><a href="/admin/goodslist">商品管理</a></li>

                </ul>
            </div>

        </div>
        <div class="rtcont fr">
            <div class="panel admin-panel">
                <div class="panel-head"><strong class="icon-reorder"> 修改信息</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
                <div class="padding border-bottom">
                    <input type="text" hidden="hidden" name="id" value="${user.id}"   />
                    <div class="grzlbt ml40">我的资料</div>

                    <div class="subgrzl ml40"><span>昵称</span><span>${user.username}</span></div>
                    <div class="subgrzl ml40"><span>手机号</span><span>${user.phone}</span></div>
                    <div class="subgrzl ml40"><span>邮箱</span><span>${user.email}</span></div>
                    <div class="subgrzl ml40"><span>密码</span><span>${user.password}</span></div>

                    <div class="xiugai ml40"><span><a href="/admin/doUpdateUserList">修改</a></span></div>

                </div>

            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>



<!-- self_info -->

<footer class="mt20 center">
    <div class="mt20">星火小仓：做最好的电子元件商城</div>

</footer>
</body>
</html>
