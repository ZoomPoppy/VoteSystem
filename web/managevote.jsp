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

    <div align="left">
        <a href="main.jsp">
            <s:property value="%{getText('��ҳ')}" />
        </a>
        >>><a href="findVote.action"><s:property value="%{getText('����ͶƱ��Ϣ')}"></s:property> </a>
        >>> <s:property value="%{getText('�༭ҳ��')}" />
    </div>
    <font color="red"><s:actionerror /></font>
<center>
    <s:form action="updateVoteContext"  theme="simple">
        <s:token />
       ͶƱ���⣺<s:property value="#session.vote.title" />
        <br>
        <br>
        <span style="position:relative  ;">
                <a style="color: #2A00AA;" href='<s:url action="addOneVoteContext"><s:param name="voteId" value="#session.vote.voteId" /></s:url>'><s:property value="%{getText('���ͶƱѡ��')}" /></a>

        </span>

        <table>
            <s:iterator value="#session.list">
                <tr>
                    <td>
                        <p>
                            ͶƱѡ��:&nbsp;&nbsp;<s:textfield name="context" value="%{context}" />
                            <a style="color: red";
                                    href='<s:url action="delVoteContext"><s:param name="voteId" value="#session.vote.voteId" /><s:param name="voteContextId" value="votecontextId" /></s:url>'>
                                <s:property   value="%{getText('ɾ��')}"/>
                            </a>
                        </p>

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
