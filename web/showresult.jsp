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
<a href="main.jsp">
    <s:property value="%{getText('主页')}" />
</a>
>>>
<s:property value="%{getText('所有投票')}" />
<center>
    <br><br>
    <table border="1" width="75%">
        <s:iterator value="#request.listInfo" status="st">
            <s:if test="#st.first==true">
                <tr bgcolor="#5e80e8" bordercolor="#5e80e8">
                    <td>
                        <div align="center">
                            <s:property value="%{getText('投票ID')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('投票名称')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('创建日期')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('创建者')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('投票状态')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('投票种类')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('编辑')}" />
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('投票')}"/>
                        </div>
                    </td>
                    <td>
                        <div align="center">
                            <s:property value="%{getText('删除投票')}"/>
                        </div>
                    </td>
                </tr>
            </s:if>
            <tr>
                <td>
                    <div align="center">
                        <s:property value="voteId" />
                    </div>
                </td>
                <td>
                    <div align="center">
                        <s:property value="title" />
                    </div>
                </td>
                <td>
                    <div align="center">
                        <s:property value="createdate" />
                    </div>
                </td>
                <td>
                    <div align="center">
                        <s:property value="adminname" />
                    </div>
                </td>
                <td>
                    <div align="center">
                        <s:property value="publish" />
                    </div>
                </td>
                <td>
                    <div align="center">
                        <s:property value="type" />
                    </div>
                </td>
                <td>
                    <div align="center">
                        <a href='<s:url action="checkAdmin"><s:param name="flag" value="1"/>
									<s:param name="voteId" value="voteId" /></s:url>' >
                            <s:property value="%{getText('编辑')}" /></a>
                    </div>
                </td>
                <td>
                    <div align="center">
                        <a href='<s:url action="voting"><s:param name="voting" value="1"/>
									<s:param name="voteId" value="voteId" /></s:url>' >
                            <s:property value="%{getText('投票')}" /></a>
                    </div>
                </td>
                <td>
                    <div align="center">
                        <a href='<s:url action="checkAdmin"><s:param name="flag" value="0"/>
									<s:param name="voteId" value="voteId" /></s:url>' >
                            <s:property value="%{getText('删除')}" /></a>
                    </div>
                </td>
            </tr>
        </s:iterator>
    </table>
</center>
</body>
</html>