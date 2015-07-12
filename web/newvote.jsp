<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<style type="text/css">
    <!--
    -->
    a { font-size: 12pt; text-decoration: none}
</style>
<body>
<a href="main.jsp">主页</a>>>>投票信息
<center>
    <br>
    <br>
    <br>
    <s:property value="%{getText('输入投票信息')}" />
    <br>
    <br>
    <font color="red">
        <s:fielderror/>
        <s:actionerror/>
    </font>
    <s:form action="newVote" theme="simple">
        <s:token />
        <table>
            <tr>
                <td><s:text name="投票名称"/></td>
                <td><s:textfield name="title" /></td>
            </tr>

            <tr>
                <td><s:text name="选项个数"/></td>
                <td><s:textfield name="contextCount" /></td>
            </tr>
            <tr>
                <td><s:text name="投票类型"/></td>
                <td><s:select list="#{'1':'单选','0':'多选'}" name="type" /></td>
            </tr>
            <tr>
                <td><s:text name="公开"/></td>
                <td><s:select list="#{'1':'是','0':'否'}" name="publish" /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><s:submit value="下一步"/></td>
            </tr>
        </table>
    </s:form>
</center>
</body>
</html>
