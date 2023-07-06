<%--
  Created by IntelliJ IDEA.
  User: 熊祖俊
  Date: 2023/7/4
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>星火小仓</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
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
    <a href="" target="_blank"><div class="logo fl"></div></a>
    <a href=""><div class="ad_top fl"></div></a>
    <div class="nav fl">
        <ul>
            <li><a href="" target="_blank"></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
            <li><a href=""></a></li>
        </ul>
    </div>
    <div class="search fr">
        <form action="" method="post">
            <div class="text fl">
                <input type="text" class="shuru"  placeholder="&nbsp&nbsp贴片型铝电解电容&nbsp;">
            </div>
            <div class="submit fl">
                <input type="submit" class="sousuo" value="搜索"/>
            </div>
            <div class="clear"></div>
        </form>
        <div class="clear"></div>
    </div>
</div>
<!-- end banner_x -->

<!-- start banner_y -->
<div class="banner_y center">
    <div class="nav">

        <ul>
            <c:forEach items="${fhandle}" var="f">
            <tr>
                <li>


                    <a>${f.name}
                            <%--<td>${u.name}--%>
                        <div class="pop">
                            <div class="left fl">
                                <c:forEach items="${all}" var="s">
            <tr>
                <c:choose><c:when test="${(s.parentId==f.id)&&(s.active==1)}">
                    <div>
                        <div class="xuangou_left fl">
                            <a>
                                <span class="fl">${s.name}</span>
                                <div class="clear"></div>
                            </a>
                        </div>
                        <div class="xuangou_right fr"><a href="/proList?hid=${s.id}" target="_blank">具体产品</a></div>
                        <div class="clear"></div>
                    </div>
                </c:when></c:choose>
            </tr>
            </c:forEach>
            <div class="clear"></div>
    </div>
</div>
</a>

</li>
</tr>
</c:forEach>
</ul>
</div>

</div>




<!-- start danpin -->

<footer >
    <div class="mt21">
        星火小仓：做最好的电子元件商城
        <br>
        欢迎联系我们：100800600
        <br>
        地址：西安电子科技大学南校区
    </div>

</footer>
</body>
</html>