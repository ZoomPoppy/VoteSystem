<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="a" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/21
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

</head>
<body>
<center>
  <h1>投票管理系统</h1>
</center>
现在的时间是：<br><br>
<%
  java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  java.util.Date currentTime = new java.util.Date();
  String strdate = formatter.format(currentTime);
%>
<%= strdate%>
<br>
<p>
  登陆者： <s:property value="%{getText('welcome')}" />
						<STRONG><s:property value="#session.admin.name" /></STRONG>
  <input type="button" onclick="javascript:logout()" value="注销">
  <script>

    function logout(){
      window.location.href = "logout.action";
    }
  </script>
</p>

<p>
登陆时间：<STRONG><s:property value="#session.admin.logintime" /></STRONG>
</p>

<input type="button" onclick="javascript:newVote()" value="新建投票">
<script>

  function newVote(){
    window.location.href = "newvote.jsp";
  }
</script>
<input type="button" onclick="javascript:findVote()" value="查找投票">
<script>


  function findVote(){
    window.location.href = "findVote";
  }
</script>
<%--<input type="button" onclick="javascript:a()" value="">--%>
<%--<input type="button" onclick="javascript:a()" value="新建投票">--%>

</body>
</html>
