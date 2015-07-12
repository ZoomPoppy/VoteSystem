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
  <%--<style>--%>
    <%--body{width: 100%;height: 100%;overflow: hidden;margin: 0;font-family: 'microsoft yahei';background-image:url(../images/login_bg.jpg);}  </style>--%>
</head>
<body>
<center>
  <h1 >投票管理系统</h1>
</center>
现在的时间是：<br><br>
<SCRIPT LANGUAGE="JavaScript">

  function gettime(){
    var d =  new Date().toLocaleString();

    document.getElementById("t").innerHTML =d;
    window.setTimeout("gettime()",1000);
  }
  window.onload = gettime;
</SCRIPT>
<div id="t"></div>


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

  <div>

    <p>
      <input style="margin: 2cm" type="button" onclick="javascript:newVote()" value="发起投票">
      <script>

        function newVote(){
          window.location.href = "newvote.jsp";
        }
      </script>
      <input style="margin: 2cm" type="button" onclick="javascript:findVote()" value="所有投票">
      <script>


        function findVote(){
          window.location.href = "findVote";
        }
      </script>
    </p>

    <p>
      <input style="margin: 2cm" type="button" onclick="searchVote()" value="查找投票"/>
      <script>
        function searchVote(){
          window.location.href="searchvote.jsp"
        }
      </script>
      <input style="margin: 2cm" type="button" onclick="changePassword()" value="更改密码"/>
      <script>
        function changePassword(){
          window.location.href="changePswd.jsp"
        }
      </script>
    </p>

  </div>

</body>
</html>
