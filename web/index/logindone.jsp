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
    <link rel="stylesheet" type="text/css" href="/css/style.css">
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
                        <li><a href="/test/adminList">管理员中心</a></li>
                    </c:when>
                    <c:when test="${user.role==1}">
                        <li><a href="/test/saleList">卖家个人中心</a></li>
                    </c:when>
                    <c:when test="${user.role==2}">
                        <li><a href="/test/buyerList">买家个人中心</a></li>
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
                    <%--<c:forEach items="${user}" var="u">--%>
                    <%--<tr>--%>
                    <li><a href="" target="_blank">您好！${user.username}用户，欢迎登录</a></li>
                    <li></li>
                    <li><a href="/index/login" target="_blank" >切换账号</a></li>
                    <li></li>
                    <li><a href=""></a></li>
                    <%--</tr>--%>
                    <%--</c:forEach>--%>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
</header>
<!--end header -->

<!-- start banner_x -->
<div class="banner_x center">
    <a href="./index.html" target="_blank"><div class="logo fl"></div></a>
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
                <div>
                    <c:choose><c:when test="${(s.parentId==f.id)&&(s.active==1)}">
                        <div class="xuangou_left fl">
                            <a href="">
                                    <%--<div class="img fl"><img src="./image/xm5-80.jpg" alt=""></div>--%>

                                <span class="fl">${s.name}</span>

                                <div class="clear"></div>
                            </a>
                        </div>
                        <div class="xuangou_right fr"><a href="./proList?hid=${s.id}" target="_blank">具体产品</a></div>
                    </c:when></c:choose>

                    <div class="clear"></div>
                </div>
            </tr>
            </c:forEach>
            <div class="clear"></div>
    </div>
</div>
</a>
    <%--</td>--%>

</li>
</tr>
</c:forEach>
</ul>
</div>

</div>



<div class="sub_banner center">
    <div class="sidebar fl">
        <div class="fl"><a href=""><img src="./image/hjh_01.gif"></a></div>
        <div class="fl"><a href=""><img src="./image/hjh_02.gif"></a></div>
        <div class="fl"><a href=""><img src="./image/hjh_03.gif"></a></div>
        <div class="fl"><a href=""><img src="./image/hjh_04.gif"></a></div>
        <div class="fl"><a href=""><img src="./image/hjh_05.gif"></a></div>
        <div class="fl"><a href=""><img src="./image/hjh_06.gif"></a></div>
        <div class="clear"></div>
    </div>
    <div class="datu fl"><a href=""><img src="./image/hongmi4x.png" alt=""></a></div>
    <div class="datu fl"><a href=""><img src="./image/xiaomi5.jpg" alt=""></a></div>
    <div class="datu fr"><a href=""><img src="./image/pinghengche.jpg" alt=""></a></div>
    <div class="clear"></div>


</div>
<!-- end banner -->
<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>

<!-- start danpin -->
<div class="danpin center">

    <div class="biaoti center">小米明星单品</div>
    <div class="main center">
        <div class="mingxing fl">
            <div class="sub_mingxing"><a href=""><img src="./image/pinpai1.png" alt=""></a></div>
            <div class="pinpai"><a href="">小米MIX</a></div>
            <div class="youhui">5月9日-21日享花呗12期分期免息</div>
            <div class="jiage">3499元起</div>
        </div>
        <div class="mingxing fl">
            <div class="sub_mingxing"><a href=""><img src="./image/pinpai2.png" alt=""></a></div>
            <div class="pinpai"><a href="">小米5s</a></div>
            <div class="youhui">5月9日-10日，下单立减200元</div>
            <div class="jiage">1999元</div>
        </div>
        <div class="mingxing fl">
            <div class="sub_mingxing"><a href=""><img src="./image/pinpai3.png" alt=""></a></div>
            <div class="pinpai"><a href="">小米手机5 64GB</a></div>
            <div class="youhui">5月9日-10日，下单立减100元</div>
            <div class="jiage">1799元</div>
        </div>
        <div class="mingxing fl">
            <div class="sub_mingxing"><a href=""><img src="./image/pinpai4.png" alt=""></a></div>
            <div class="pinpai"><a href="">小米电视3s 55英寸</a></div>
            <div class="youhui">5月9日，下单立减200元</div>
            <div class="jiage">3999元</div>
        </div>
        <div class="mingxing fl">
            <div class="sub_mingxing"><a href=""><img src="./image/pinpai5.png" alt=""></a></div>
            <div class="pinpai"><a href="">小米笔记本</a></div>
            <div class="youhui">更轻更薄，像杂志一样随身携带</div>
            <div class="jiage">3599元起</div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="peijian w">
    <div class="biaoti center">配件</div>
    <div class="main center">
        <div class="content">
            <div class="remen fl"><a href=""><img src="./image/peijian1.jpg"></a>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span>新品</span></div>
                <div class="tu"><a href=""><img src="./image/peijian2.jpg"></a></div>
                <div class="miaoshu"><a href="">小米6 硅胶保护套</a></div>
                <div class="jiage">49元</div>
                <div class="pingjia">372人评价</div>
                <div class="piao">
                    <a href="">
                        <span>发货速度很快！很配小米6！</span>
                        <span>来至于mi狼牙的评价</span>
                    </a>
                </div>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span style="background:#fff"></span></div>
                <div class="tu"><a href=""><img src="./image/peijian3.jpg"></a></div>
                <div class="miaoshu"><a href="">小米手机4c 小米4c 智能</a></div>
                <div class="jiage">29元</div>
                <div class="pingjia">372人评价</div>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span style="background:red">享6折</span></div>
                <div class="tu"><a href=""><img src="./image/peijian4.jpg"></a></div>
                <div class="miaoshu"><a href="">红米NOTE 4X 红米note4X</a></div>
                <div class="jiage">19元</div>
                <div class="pingjia">372人评价</div>
                <div class="piao">
                    <a href="">
                        <span>发货速度很快！很配小米6！</span>
                        <span>来至于mi狼牙的评价</span>
                    </a>
                </div>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span style="background:#fff"></span></div>
                <div class="tu"><a href=""><img src="./image/peijian5.jpg"></a></div>
                <div class="miaoshu"><a href="">小米支架式自拍杆</a></div>
                <div class="jiage">89元</div>
                <div class="pingjia">372人评价</div>
                <div class="piao">
                    <a href="">
                        <span>发货速度很快！很配小米6！</span>
                        <span>来至于mi狼牙的评价</span>
                    </a>
                </div>
            </div>
            <div class="clear"></div>
        </div>
        <div class="content">
            <div class="remen fl"><a href=""><img src="./image/peijian6.png"></a>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span style="background:#fff"></span></div>
                <div class="tu"><a href=""><img src="./image/peijian7.jpg"></a></div>
                <div class="miaoshu"><a href="">小米指环支架</a></div>
                <div class="jiage">19元</div>
                <div class="pingjia">372人评价</div>
                <div class="piao">
                    <a href="">
                        <span>发货速度很快！很配小米6！</span>
                        <span>来至于mi狼牙的评价</span>
                    </a>
                </div>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span style="background:#fff"></span></div>
                <div class="tu"><a href=""><img src="./image/peijian8.jpg"></a></div>
                <div class="miaoshu"><a href="">米家随身风扇</a></div>
                <div class="jiage">19.9元</div>
                <div class="pingjia">372人评价</div>
            </div>
            <div class="remen fl">
                <div class="xinpin"><span style="background:#fff"></span></div>
                <div class="tu"><a href=""><img src="./image/peijian9.jpg"></a></div>
                <div class="miaoshu"><a href="">红米4X 高透软胶保护套</a></div>
                <div class="jiage">59元</div>
                <div class="pingjia">775人评价</div>
            </div>
            <div class="remenlast fr">
                <div class="hongmi"><a href=""><img src="./image/hongmin4.png" alt=""></a></div>
                <div class="liulangengduo"><a href=""><img src="./image/liulangengduo.png" alt=""></a></div>
            </div>
            <div class="clear"></div>
        </div>
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
</body>
</html>