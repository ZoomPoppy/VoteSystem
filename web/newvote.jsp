<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<style type="text/css">
    <!--
    -->
    a { font-size: 12pt; text-decoration: none}
</style>
<body>
<a href="main.jsp">��ҳ</a>>>>ͶƱ��Ϣ
<center>
    <br>
    <br>
    <br>
    <s:property value="%{getText('����ͶƱ��Ϣ')}" />
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
                <td><s:text name="ͶƱ����"/></td>
                <td><s:textfield name="title" /></td>
            </tr>

            <tr>
                <td><s:text name="ѡ�����"/></td>
                <td><s:textfield name="contextCount" /></td>
            </tr>
            <tr>
                <td><s:text name="ͶƱ����"/></td>
                <td><s:select list="#{'1':'��ѡ','0':'��ѡ'}" name="type" /></td>
            </tr>
            <tr>
                <td><s:text name="����"/></td>
                <td><s:select list="#{'1':'��','0':'��'}" name="publish" /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><s:submit value="��һ��"/></td>
            </tr>
        </table>
    </s:form>
</center>
</body>
</html>
