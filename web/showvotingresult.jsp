<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: zz--%>
  <%--Date: 2015/6/29--%>
  <%--Time: 21:49--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title></title>
</head>
<body>
<a href="main.jsp">
  <s:property value="%{getText('��ҳ')}"/>
</a>>>>
<a href="findVote.action"><s:property value="%{getText('����ͶƱ��Ϣ')}"></s:property> </a>
</a>>>>ͶƱ���
<br><br><br><br><br>
<center>
  <s:property value="%{getText('��ͶƱ��')}" />
  <s:property value="#session.totalcount" />
  <br>
  <s:property value="%{getText('ͶƱ����:')}" />
  <s:property value="#session.voting.title" />

  <table  border="1" width="50%" >
    <s:iterator value="#request.votingInfoList" status="st">
      <s:if test="#st.first==true">
        <tr bgcolor="#5e80e8" bordercolor="#5e80e8">
          <td>
            <div align="center">
              <s:property value="%{getText('ͶƱ��Ŀ')}" />
            </div>
          </td>
          <td>
            <div align="center">
              <s:property value="%{getText('ͶƱ��')}"/>
            </div>
          </td>
          <td>
            <div align="center">
              <s:property value="%{getText('ͶƱ�ٷֱ�')}"/>
            </div>
          </td>
        </tr>
      </s:if>

      <tr>
        <td>
          <div align="center">
            <s:property value="context"/>
          </div>
        </td>
        <td>
          <div align="center">
            <s:property value="count"/>
          </div>
        </td>
        <td>
          <div align="center">
            <s:property value="percent"/>
          </div>
        </td>
      </tr>
    </s:iterator>
  </table>

</center>
</body>
</html>
