<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<%--<style type="text/css">--%>
    <%--<!----%>
    <%--body {--%>
        <%--background-color: #445de3;--%>
    <%--}--%>
    <%---->--%>
    <%--a { font-size: 12pt; text-decoration: none}--%>
<%--</style>--%>
<body>
<%--<a href="main.jsp"><s:property--%>
        <%--value="%{getText('mainpage')}" /> </a>>>>--%>
<%--<s:property value="%{getText('createvote')}" />--%>
<%-->>>--%>
<%--<s:property value="%{getText('createnewvote')}" />--%>
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
    <s:form action="newvoteValidate" theme="simple">
        <s:token />
        <table>
            <tr>
                <td><s:text name="ͶƱ����"/></td>
                <td><s:textfield name="title" /></td>
            </tr>
            <tr>
                <td><s:text name="ѡ�����"/></td>
                <td><s:textfield name="contextcount" /></td>
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
                <td><s:submit key="��һ��" /></td>
            </tr>
        </table>
    </s:form>
</center>
</body>
</html>
