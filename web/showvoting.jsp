<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/29
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="main.jsp">
  主页
</a>
>>>
<a href="findVote.action">
  所有投票
</a>>>>投票选项
<center>
  <s:property value="#session.vote2.title" />
  <s:form action="checkVoter">
    <s:if test="%{type==1}">
      <s:radio list="#request.map" name="context"/>
    </s:if>
    <s:else>
      <s:checkboxlist list="#request.map" name="context"/>
    </s:else>
    <br>
    <s:submit value="下一步" />
  </s:form>
</center>
</body>
</html>
