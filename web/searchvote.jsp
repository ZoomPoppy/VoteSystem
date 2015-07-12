<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/19
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html><head>
</head>
<body>
<a href="main.jsp">主页</a>
>>>查找页面
<div>
  <center>
    <br><br><br><br>
    <font color="red">
    </font>
    <form  id="searchVote" name="searchVote" action="searchVote" method="post">
      输入搜索名称
      <input name="title" value="" id="searchVote_title" type="text">
      <input id="searchVote_submit" name="submit" type="submit">

    </form>
  </center>
</div>
</body></html>