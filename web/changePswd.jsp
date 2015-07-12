<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/7/4
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="main.jsp">主页</a>
>>>
修改密码
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<center>
  <s:form action="changePswd" theme="simple"  >
    <s:token/>
    <table width="344" height="300">
      <tr>
        <td><s:text name="旧密码"/></td>
        <td><input type="password" name="password" /></td>      </tr>
      <tr>
        <td><s:text name="请输入新密码"/></td>
        <td><input type="password" name="newpwd1"/></td>      </tr>
      <tr>
        <td><s:text name="再次输入"/></td>
        <td><input type="password" name="newpwd2" /></td>
      </tr>

    </table>
    <tr>
      <td><s:submit key="submit" value="提交"/> </td>
    </tr>
  </s:form>
</center>
</body>
</html>
