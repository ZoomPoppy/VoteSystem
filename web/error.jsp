<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/22
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <style>

    body{width: 100%;height: 100%;overflow: hidden;margin: 0;font-family: 'microsoft yahei';background-image:url(../images/login_bg.jpg);}

  </style>
</head>
<body>
<center>
  <br><br><br><br><br><br>

<p>
  <h1 style="color: #f5f6f7">用户名或密码错误</h1>
  <a href='<s:url value="login.jsp"> </s:url>' >
    <button style="color: black" >返回重新登录</button></a>

</p>
</center>
</body>
</html>
