<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>小米商城-个人中心</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
</head>
<body>
<!-- start header -->
<header>
    <div class="top center">
        <div class="left fl">
            <ul>
                <li><a href="http://www.mi.com/" target="_blank">小米商城</a></li>
                <li>|</li>
                <li><a href="">MIUI</a></li>
                <li>|</li>
                <li><a href="">米聊</a></li>
                <li>|</li>
                <li><a href="">游戏</a></li>
                <li>|</li>
                <li><a href="">多看阅读</a></li>
                <li>|</li>
                <li><a href="">云服务</a></li>
                <li>|</li>
                <li><a href="">金融</a></li>
                <li>|</li>
                <li><a href="">小米商城移动版</a></li>
                <li>|</li>
                <li><a href="">问题反馈</a></li>
                <li>|</li>
                <li><a href="">Select Region</a></li>
                <div class="clear"></div>
            </ul>
        </div>
        <div class="right fr">
            <div class="gouwuche fr"><a href="">我的订单</a></div>
            <div class="fr">
                <ul>
                    <li><a href="./login.html" target="_blank">登录</a></li>
                    <li>|</li>
                    <li><a href="./register.html" target="_blank" >注册</a></li>
                    <li>|</li>
                    <li><a href="./self_info.html">个人中心</a></li>
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
        <form action="" enctype="multipart/form-data" method="post">
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
<!-- end banner_x -->
<!-- self_info -->
<div class="grzxbj">
    <div class="selfinfo center">
        <div class="lfnav fl">
            <div class="ddzx">管理中心</div>
            <div class="subddzx" style="font-size: 16px;">
                <ul>
                    <li><a href="/sell/handle" >品类管理</a></li>
                    <li><a href="/sell/goods" style="color:#ff6700;font-weight:bold;">商品管理</a></li>
                    <li><a href="">团购订单</a></li>
                    <li><a href="">评价晒单</a></li>
                </ul>
            </div>
            <div class="ddzx">个人中心</div>
            <div class="subddzx" style="font-size: 16px;">
                <ul>
                    <li><a href="/sell/info">我的个人中心</a></li>
                    <li><a href="">消息通知</a></li>
                    <li><a href="">优惠券</a></li>
                    <li><a href="">收货地址</a></li>
                </ul>
            </div>
        </div>
        <div class="rtcont fr">
            ${users}
            <div class="panel admin-panel">
                <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
                <div class="body-content">
                    <form method="post" enctype="multipart/form-data" class="form-x" action="/sell/doGoodsAdd">
                        <div class="form-group">
                            <div class="label">
                                <label>商品名：</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input w50" value="" name="goodsname" data-validate="required:请输入商品名" />
                                <div class="tips"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label>商品价格：</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input w50" value="" name="price" data-validate="required:请输入商品价格" />
                                <div class="tips"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label>商品库存：</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input w50" value="" name="store" data-validate="required:请输入商品库存" />
                                <div class="tips"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label>商品描述：</label>
                            </div>
                            <div class="field">
                                <input type="text" class="input w50" value="" name="message" data-validate="required:请输入商品描述" />
                                <div class="tips"></div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="label">
                                <label>商品图片：</label>
                            </div>
                            <div class="field">
                                <input type="file" class="input w50" value="" name="img"  />
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="label">
                                <label>所属品类：</label>
                            </div>
                            <div class="field">
                                <select name="hid" class="input w50">
                                    <%--已有品类的列表 一级品类获取 下拉条的显示--%>
                                    <c:forEach items="${all}" var="i">
                                        <option value="${i.id}">${i.name}</option>
                                    </c:forEach>
                                </select>
                                <div class="tips"></div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="label">
                                <label>所属卖家：</label>
                            </div>
                            <div class="field">
                                <select name="uid" class="input w50">
                                    <%--已有品类的列表 一级品类获取 下拉条的显示--%>
                                        <option value="${user.id}">${user.username}</option>
                                </select>
                                <div class="tips"></div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="label">
                                <label>是否有效：</label>
                            </div>
                            <div class="field">
                                <select name="active" class="input w50">
                                    <option value="1">有效</option>
                                </select>
                                <div class="tips"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="label">
                                <label></label>
                            </div>
                            <div class="field">
                                <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <div class="clear"></div>
    </div>
</div>
<!-- self_info -->

<footer class="mt20 center">
    <div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
    <div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div>
    <div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
</footer>
</body>
</html>