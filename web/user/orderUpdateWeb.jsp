<%--
  Created by IntelliJ IDEA.
  User: pzy
  Date: 2023/7/5
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>个人中心-信息</title>
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
                    <a href="/index/login" target="_blank">退出登录</a>|<a href="/index/register" target="_blank" >注册</a>|<a href="/index">返回首页</a>
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
            <div class="ddzx">订单中心</div>
            <div class="subddzx">
                <ul>
                    <li><a href="/user/usermain" >我的订单</a></li>
                    <li><a href="/user/self_info" style="color:#ff6700;font-weight:bold;">个人中心</a></li>

                </ul>
            </div>


        </div>
        <div class="rtcont fr">
            <div class="grzlbt ml40">修改订单</div>
            <form action="/user/doOrderUpdate">
                <input hidden="hidden" value="${order.orderId}" name="id">
                <div class="biaotou ml40"><span>商品:</span></div><div type="text" class="xinxi ml40" >${order.goodName} </div>
                <div class="biaotou ml40"><span>价格:</span></div><div type="text" class="xinxi ml40" >${order.price} </div>
                <div class="biaotou ml40"><span>数量：</span></div><input type="text" class="xinxi ml40" value="${order.amount}" name="amount" data-validate="required:请输入购买数量" />
                <div class="biaotou ml40"><span>地址:</span></div><input type="text" class="xinxi ml40" value="${order.address}" name="address" data-validate="required:请输入收货地址" />
                <%--<div class="xiugai ml40"><span><submit href="/user/doInfoUpdate">确认修改</submit></span></div>--%>
                <input class="xiugai" type="submit" value="确认修改">

            </form>




        </div>

        <div class="clear"></div>
    </div>
</div>
<!-- self_info -->

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
