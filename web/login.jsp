
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
	<%--<title>The Entrar-shadow Website form | w3layouts</title>--%>
		<meta charset="GBK">
		<%--<link href="css/style.css" rel='stylesheet' type='text/css' />--%>
		<%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
		<%--<script type="application/x-javascript">--%>
			<%--addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);--%>
			<%--function hideURLbar(){ window.scrollTo(0,1);--%>
			<%--}--%>
		<%--</script>--%>
		<%--<!--webfonts-->--%>
		<%--<link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,300,600,700' rel='stylesheet' type='text/css'>--%>
		<%--<!--//webfonts-->--%>
</head>
<body>
	 <!-----start-main---->
	 <br><br><br><br><br><br>
	 <div >
		 <center>
			 <div >
				 <h1>用户登录</h1>
				 <form action="login.action">
					 <p>
						 <input name="name" type="text" class="text" value="请输入用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入用户名';}" >
					 </p>
					 <p>
						 <input name="password" type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">

					 </p>
					 <div >
						 <input type="submit"  value="登录"/>
					 </div>
					 <p><a href="createadmin.jsp">
						 注册
					 </a></p>
				 </form>
			 </div>
		 </center>

			<!--//End-login-form-->
			 <!-----start-copyright---->
   					<!--<div class="copy-right">-->
						<!--<p>Template by <a href="http://w3layouts.com">w3layouts</a></p> -->
					<!--</div>-->
				<!-----//end-copyright---->
		</div>
			 <!-----//end-main---->
		 		
</body>
</html>