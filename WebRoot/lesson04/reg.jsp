<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function checkSubmit(){
			document.forms[0].submit();
		}
	</script>
  </head>
  
  <body>
  <a href="${pageContext.request.contextPath}/mid?a=zh_CN">中文</a>|<a href="${pageContext.request.contextPath}/mid?a=en_GB">英文</a>
    <form action="<%=path %>/myreg" method="post">
    	<s:message code="userName"></s:message>:<input type="text" name="userName" /><font color=red>
    		<form:errors path="user.userName"></form:errors></font>
    	<br/>
    	<s:message code="password"></s:message>:<input type="password" name="password" />
    		 <font color=red><form:errors path="user.password"></form:errors></font>
    	<br/>
    	<s:message code="repassword"></s:message>:<input type="password" name="repassword" />
    		<font color=red><form:errors path="user.repassword"></form:errors></font>
    	<br/>
    	<s:message code="email"></s:message>:<input type="text" name="email"/>
    		<font color=red><form:errors path="user.email"></form:errors></font>
    	<br/>
    	<s:message code="age"></s:message>:<input type="text" name="age" />
    		<font color=red><form:errors path="user.age"></form:errors></font>
    	<br/>
    	<s:message code="phone"></s:message>:<input type="text" name="phone"/>
    		<font color=red><form:errors path="user.phone"></form:errors></font>
    	<br/>
    	<!-- 时间输入格式 yyyy-MM-dd-->
    	<s:message code="date"></s:message>:<input type="text" name="date"/>
    		<font color=red><form:errors path="user.date"></form:errors></font>
    	<br/>
    	<!-- 网址 http://www.baibu.com  http://ip:端口--> 
    	<s:message code="webAddress"></s:message>:<input type="text" name="webAddress"/>
    		<font color=red><form:errors path="user.webAddress"></form:errors></font>
    	<br/>
   		<input type="button" onclick="checkSubmit()" value="<s:message code="register"></s:message>" name="register"/>		
    </form><br/>
  </body>
</html>
