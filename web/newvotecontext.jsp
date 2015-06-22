<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/20
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html><style type="text/css">
  <!--
  body {
    background-color: #869de3;
  }
  -->
  a { font-size: 12pt; text-decoration: none}
</style>
<body>
<a href="main.jsp">
  <s:property value="%{getText('主页')}" />
</a>&gt;&gt;&gt;<s:property value="%{getText('创建投票')}" />
<center>
  <s:property value="%{getText('输入投票选项内容')}" />
  <br>
  <br>
  <br>
  <s:form action="newVoteContext" theme="simple">
    <s:token/>
    <s:bean name="org.apache.struts2.util.Counter" id="counter">
      <s:param name="first" value="1" />
      <s:param name="last" value="#session.contextcount"/>
      <s:iterator>
        <s:property value="%{getText('第')}" />
        <s:property /><s:property value="%{getText('项')}" />
        <s:textfield name="context" value=""/>
        <br>
        <br>
      </s:iterator>
      <s:submit key="下一步" />
    </s:bean>
  </s:form>

</center>
</body>
</html>