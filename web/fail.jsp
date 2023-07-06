<%--
  Created by IntelliJ IDEA.
  User: xbfddn
  Date: 2023/7/5
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${msg}   --%>
<script type="text/javascript" language="javascript">
    alert("${msg}");                                            // 弹出错误信息
    window.location="/index/login.jsp" ;                            // 跳转到登录界面
</script>
</body>
</html>
