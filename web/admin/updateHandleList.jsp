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
                    <li><a href="/admin/userlist" >用户管理</a></li>
                    <li><a href="/admin/handlelist" style="color:#ff6700;font-weight:bold;">品类管理</a></li>
                    <li><a href="/admin/goodslist">商品管理</a></li>

                </ul>
            </div>

        </div>
        <div class="rtcont fr">

            <div class="grzlbt ml40">修改品类</div>
            <form action="/admin/doupdatehandlelist">
                <input type="text" hidden="hidden" name="id" value="${handle.id}" />
                <div class="biaotou ml40"><span>品类名:</span></div><input type="text" class="xinxi ml40" value="${handle.name}" name="name" data-validate="required:请输入品类名" />

                <div class="biaotou ml40"><span>父类名:</span></div>
                <select type="text" class="xinxi ml40" name="parentId" >
                    <option value="0">一级品类</option>
                    <c:forEach items="${allparenthandles}" var="i">
                        <option <c:if test="${i.id==handle.parentId}">selected="selected" </c:if>value="${i.id}">${i.name} </option>
                    </c:forEach>
                </select>

                <div class="biaotou ml40"><span>是否有效:</span></div>
                <select type="text" class="xinxi ml40" name="active" >
                    <option value="">请选择是否有效</option>
                    <option value="0">无效</option>
                    <option value="1">有效</option>

                </select>
                <%--<div class="xiugai ml40"><span><submit href="/user/doInfoUpdate">确认修改</submit></span></div>--%>
                <input class="xiugai" type="submit" value="确认修改">

            </form>




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
