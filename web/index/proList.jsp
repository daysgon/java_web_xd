<%--
  Created by IntelliJ IDEA.
  User: xbfddn
  Date: 2023/7/5
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>${hName}</title>
    <link rel="stylesheet" type="text/css" href="../css/style1.css">
</head>
<body>

<!-- start header -->
<header>
    <div class="top center">
        <div class="left fl">
            <ul>
                <li><a href="https://www.szlcsc.com/" target="_blank">更多电子器件</a></li>
                <li>|</li>
                <li><a href=""></a></li>
                <li></li>
                <li><a href=""></a></li>
                <li></li>
                <li><a href=""></a></li>
                <li></li>
                <li><a href=""></a></li>
                <li></li>
                <li><a href=""></a></li>
                <li></li>
                <li><a href=""></a></li>
                <li></li>
                <li><a href="https://1839876.ma3you.cn/static/tourguide/content_show/index.html?v=20230519#/pages/article_view/article_view?article_id=AVwJd5M">人工客服</a></li>
                <li>|</li>
                <li><a href="">公益赞助</a></li>
                <li>|</li>
                <c:choose>
                    <c:when test="${user.role==0}">
                        <li><a href="/admin/userlist">管理员中心</a></li>
                    </c:when>
                    <c:when test="${user.role==1}">
                        <li><a href="/sell/handle">卖家个人中心</a></li>
                    </c:when>
                    <c:when test="${user.role==2}">
                        <li><a href="/user/usermain">买家个人中心</a></li>
                    </c:when>
                </c:choose>
                <li></li>
                <li><a href=""></a></li>
                <div class="clear"></div>
            </ul>
        </div>
        <div class="right fr">
            <div class="gouwuche fr"><a href="">购物车</a></div>
            <div class="fr">
                <ul>
                    <c:choose>
                        <c:when test="${user==null}">
                            <li><a href="/index/login" target="_blank">登录</a></li>
                            <li>|</li>
                            <li><a href="/index/register" target="_blank" >注册</a></li>
                            <li>|</li>
                        </c:when>
                        <c:when test="${user!=null}">
                            <li><a href="" target="_blank">您好！${user.username}用户，欢迎登录</a></li>
                            <li></li>
                            <li><a href="/index/login" target="_blank" >切换账号</a></li>
                            <li></li>
                            <li><a href=""></a></li>
                        </c:when>
                    </c:choose>

                    <%--&lt;%&ndash;<c:forEach items="${user}" var="u">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                    <%--<li><a href="" target="_blank">您好！${user.username}用户，欢迎登录</a></li>--%>
                    <%--<li></li>--%>
                    <%--<li><a href="/index/login" target="_blank" >切换账号</a></li>--%>
                    <%--<li></li>--%>
                    <%--<li><a href=""></a></li>--%>
                    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div></header>
<!--end header -->


<!-- start banner_x -->
<div class="banner_x center">
    <a href="/index/index" target="_blank"><div class="logo fl"></div></a>
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
    <div class="search fr">
        <form action="" method="post">
            <div class="text fl">
                <input type="text" class="shuru"  placeholder="小米6&nbsp;小米MIX现货">
            </div>
            <div class="submit fl">
                <input type="submit" class="sousuo" value="搜索"/>
            </div>
            <div class="clear"></div>
        </form>
        <div class="clear"></div>
    </div>
</div>

<div class="danpin center">

    <div class="biaoti center">${hName}</div>
    <div class="main center">
        <c:forEach items="${all}" var="g">
            <tr>
                <div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
                    <div class="sub_mingxing"><a href="/proDetails?id=${g.id}" target="_blank"> <img src="${g.img}" width="1" height="6"/></a></div>
                    <div class="pinpai"><a href="/proDetails?id=${g.id}" target="_blank">${g.goodsname}</a></div>
                    <%--<div class="youhui">5.16早10点开售</div>--%>
                    <div class="jiage">${g.price}元</div>
                </div>
            </tr>
        </c:forEach>



        <div class="clear"></div>
    </div>

</div>


<footer>
    <div class="mt20">
        星火小仓：做最好的电子元件商城
        <br>
        欢迎联系我们：100800600
        <br>
        地址：西安电子科技大学南校区
    </div>

</footer>

<!-- end danpin -->


</body>
</html>