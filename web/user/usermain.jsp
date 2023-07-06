<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>个人中心-订单</title>
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
            <div class="ddzx">后台管理</div>
            <div class="subddzx">
                <ul>
                    <li><a href="/user/usermain" style="color:#ff6700;font-weight:bold;">我的订单</a></li>
                    <li><a href="/user/self_info">个人信息</a></li>


                </ul>
            </div>

        </div>
        <div class="rtcont fr" style="overflow: scroll">
            <div class="panel admin-panel">
                <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>

                <table class="table table-hover text-center">
                    <tr>
                        <th width="100" style="text-align:left; padding-left:20px;">订单号</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">商品</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">卖家</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">单价</th>
                        <th width="100" style="text-align:left; padding-left:20px;">数量</th>
                        <th width="100" style="text-align:left; padding-left:20px;">订单创建时间</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">收货地址</th>
                        <th>操作</th>
                    </tr>
                    <volist name="list" id="vo">
                        <c:forEach items="${all}" var="u">
                        <tr>
                            <td style="text-align:left; padding-left:20px;">${u.orderId}</td>
                            <td>${u.goodName}</td>
                            <td>${u.sellerName}</td>
                            <td>${u.price}</td>
                            <td>${u.amount}</td>
                            <td>${u.createTime}</td>
                            <td>${u.address}</td>
                            <td><div class="button-group"> <a class="button border-main" href="/user/orderUpdate?id=${u.orderId}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="/user/orderDelete?id=${u.orderId}"><span class="icon-trash-o"></span> 删除</a></td></td>
                        </tr>
                        </c:forEach>

                </table>
                <div class="biaotou ml40"><span>总价:</span></div><div type="text" class="price ml40" >${totalPrice}￥</div>
                <div class="fukuan" ><a href="">立即付款</a></div>
            </div>
        </div>
    </div>
    <div class="clear"></div>
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