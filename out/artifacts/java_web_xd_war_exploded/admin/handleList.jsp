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
                    <li><a href="">商品管理</a></li>
                    <li><a href="">评价晒单</a></li>
                </ul>
            </div>

        </div>
        <div class="rtcont fr">
            <div class="panel admin-panel">
                <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
                <div class="padding border-bottom">
                    <ul class="search" style="padding-left:10px;">
                        <li> <a class="button border-main icon-plus-square-o" href="/back/addlist"> 添加内容</a> </li>



                        <li>
                            <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                            <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
                    </ul>
                </div>
                <table class="table table-hover text-center">
                    <tr>
                        <th width="100" style="text-align:left; padding-left:20px;">ID</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">品类名</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">parent_id</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">是否有效</th>
                        <th  width="100" style="text-align:left; padding-left:20px;">操作</th>
                    </tr>
                    <volist name="list" id="vo">
                        <c:forEach items="${allhandles}" var="u">
                        <tr>
                            <td style="text-align:left; padding-left:20px;">${u.id}</td>
                            <td>${u.name}</td>
                            <td>${u.parentId}</td>
                            <td>${u.active}</td>




                            <td><div class="button-group"> <a class="button border-main" href="/back/update?id=${u.id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="/back/delete?id=${u.id}"><span class="icon-trash-o"></span> 删除</a></td></td>
                        </tr>
                        </c:forEach>
                </table>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
</div>


<!-- self_info -->

<footer class="mt20 center">
    <div class="mt20">星火小仓：做最好的电子元件商城</div>

</footer>
</body>
</html>