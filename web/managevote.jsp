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
            <s:property value="%{getText('主页')}" />
        </a>
        >>><a href="findVote.action"><s:property value="%{getText('所有投票信息')}"></s:property> </a>
        >>> <s:property value="%{getText('编辑页面')}" />
    </div>
    <font color="red"><s:actionerror /></font>
<center>
    <s:form action="updateVoteContext"  theme="simple">
        <s:token />
       投票主题：<s:property value="#session.vote.title" />
        <br>
        <br>
        <span style="position:relative  ;">
                <a style="color: #2A00AA;" href='<s:url action="addOneVoteContext"><s:param name="voteId" value="#session.vote.voteId" /></s:url>'><s:property value="%{getText('添加投票选项')}" /></a>

        </span>

        <table>
            <s:iterator value="#session.list">
                <tr>
                    <td>
                        <p>
                            投票选项:&nbsp;&nbsp;<s:textfield name="context" value="%{context}" />
                            <a style="color: red";
                                    href='<s:url action="delVoteContext"><s:param name="voteId" value="#session.vote.voteId" /><s:param name="voteContextId" value="votecontextId" /></s:url>'>
                                <s:property   value="%{getText('删除')}"/>
                            </a>
                        </p>

                    </td>
                </tr>
            </s:iterator>
        </table>
        <s:property value="%{getText('投票类型')}" />
        <s:radio list="#{'1':'单选','0':'多选'}" name="type"
                 value="#session.vote.type" />
        <br>
        <s:property value="%{getText('公开')}" />
        <s:radio list="#{'1':'是','0':'否'}" name="publish"
                 value="#session.vote.publish" />
        <br>
        <s:submit key="更新" />
    </s:form>
</center>
</body>
</html>
