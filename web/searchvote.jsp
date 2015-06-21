<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/19
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html><head><style type="text/css">
  .top_div {
    background: #008ead;
    width: 100%;
    height: 400px;
  }</style>
</head><body>
<div class="top_div">
  <br><br><br><br>
  <center>
    <br><br><br><br>
    <font color="red">
    </font>
    <form id="searchVote" name="searchVote" action="searchVote" method="post">
      ÊäÈëËÑË÷Ãû³Æ
      <input name="title" value="" id="searchVote_title" type="text">
      <input id="searchVote_submit" name="submit" type="submit">

    </form>
  </center>
</div>
</body></html>