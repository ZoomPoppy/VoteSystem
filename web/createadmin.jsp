<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zz
  Date: 2015/6/19
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<font color="red"><s:fielderror/><s:actionerror/></font>
<center>

  <s:form action="createAdmin" theme="simple">
    <table  width="344" height="300">
      <tr>
        <td><s:text name="输入用户名" /></td>
        <td><s:textfield name="name"/></td>
      </tr>
      <tr>
        <td><s:text name="输入密码"/></td>
        <td><s:textfield name="newpwd1"/></td>
      </tr>
      <tr>
        <td><s:text name="再次输入密码"/></td>
        <td><s:textfield name="newpwd2"/></td>
      </tr>

    </table>
    <tr>
      <td><s:submit key="submit"/></td>
    </tr>
  </s:form>

</center>
</body>
</html>
