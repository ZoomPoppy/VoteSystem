<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<style type="text/css">
    <!--
    /*body {*/
        /*background-color: #869de3;*/
    /*}*/
    -->
    a { font-size: 12pt; text-decoration: none}
</style>
<body>
<center>
    <div align="left">
        <a href="main.jsp">
            <s:property value="%{getText('��ҳ')}" />
        </a>>>><s:property value="%{getText('�༭ҳ��')}" />
    </div>
    <font color="red"><s:actionerror /></font>
    <s:form action="updateVoteContext" theme="simple">
        <s:token />
       ͶƱ���⣺<s:property value="#session.vote.title" />
        <br>
        <br>
        <a
                href='<s:url action="addOneVoteContext"><s:param name="voteId" value="#session.vote.voteId" /></s:url>'><s:submit value="���ͶƱѡ��"/></a>
        <table>
            <s:iterator value="#session.list">
                <tr>
                    <td>
                        <s:property value="%{getText('ͶƱѡ��')}" />
                        <s:textfield name="context" value="%{context}" />
                    </td>
                    <td>
                        <a
                                href='<s:url action="delVoteContext"><s:param name="voteId" value="#session.vote.voteId" /><s:param name="votecontextId" value="votecontextId" /></s:url>'>
                            <s:submit  value="ɾ��"/>
                        </a>
                    </td>
                </tr>
            </s:iterator>
        </table>
        <s:property value="%{getText('ͶƱ����')}" />
        <s:radio list="#{'1':'��ѡ','0':'��ѡ'}" name="type"
                 value="#session.vote.type" />
        <br>
        <s:property value="%{getText('����')}" />
        <s:radio list="#{'1':'��','0':'��'}" name="publish"
                 value="#session.vote.publish" />
        <br>
        <s:submit key="����" />
    </s:form>
</center>
</body>
</html>
