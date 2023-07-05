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
                        <li>搜索：</li>
                        <li>首页
                            <select name="s_ishome" class="input" onchange="changesearch()" style="width:60px; line-height:17px; display:inline-block">
                                <option value="">选择</option>
                                <option value="1">是</option>
                                <option value="0">否</option>
                            </select>
                            &nbsp;&nbsp;
                            推荐
                            <select name="s_isvouch" class="input" onchange="changesearch()"  style="width:60px; line-height:17px;display:inline-block">
                                <option value="">选择</option>
                                <option value="1">是</option>
                                <option value="0">否</option>
                            </select>
                            &nbsp;&nbsp;
                            置顶
                            <select name="s_istop" class="input" onchange="changesearch()"  style="width:60px; line-height:17px;display:inline-block">
                                <option value="">选择</option>
                                <option value="1">是</option>
                                <option value="0">否</option>
                            </select>
                        </li>
                        <if condition="$iscid eq 1">
                            <li>
                                <select name="cid" class="input" style="width:200px; line-height:17px;" onchange="changesearch()">
                                    <option value="">请选择分类</option>
                                    <option value="">产品分类</option>
                                    <option value="">产品分类</option>
                                    <option value="">产品分类</option>
                                    <option value="">产品分类</option>
                                </select>
                            </li>
                        </if>
                        <li>
                            <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                            <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
                    </ul>
                </div>
                <table class="table table-hover text-center">
                    <tr>
                        <th width="100" style="text-align:left; padding-left:20px;">ID</th>
                        <th>用户名</th>
                        <th>密码</th>
                        <th>手机</th>
                        <th>邮箱</th>
                        <th>是否有效</th>
                        <th width="10%">角色</th>
                        <th width="310">创建时间</th>
                        <th>操作</th>
                    </tr>
                    <volist name="list" id="vo">
                        <c:forEach items="${allusers}" var="u">
                        <tr>
                            <td style="text-align:left; padding-left:20px;">${u.id}</td>
                            <td>${u.username}</td>
                            <td>${u.password}</td>
                            <td>${u.phone}</td>
                            <td>${u.email}</td>
                            <td>${u.active}</td>
                            <td>${u.role}</td>
                            <td>${u.createTime}</td>
                            <td><div class="button-group"> <a class="button border-main" href="/back/update?id=${u.id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="/back/delete?id=${u.id}"><span class="icon-trash-o"></span> 删除</a> <a class="button border-red" href="/back/active?id=${u.id}"><span class="icon-trash-o"></span> 激活</a></div></td>
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
    <div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
    <div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div>
    <div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
</footer>
</body>
</html>