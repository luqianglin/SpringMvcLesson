<%@ tag language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ attribute name="tokenName" required="false" %>

<%
	String str=UUID.randomUUID().toString();
	String key=(tokenName==null?"myToken":tokenName);
	session.setAttribute(key, str);
 %>
 <input type='hidden' name='<%=key %>' value='<%=str %>'/>