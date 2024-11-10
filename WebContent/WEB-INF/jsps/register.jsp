<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
   
    
<!DOCTYPE html>
<html>
<head>

<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>



<sf:form method="post" action="${pageContext.request.contextPath}/createaccount" modelAttribute
="registration">

<table class="formtable">
<tr><td class="label">User Name: </td><td><sf:input class="control" path="username"  /><br/><sf:errors path="username" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Email: </td><td><sf:input class="control"  path="email" /><br/><sf:errors path="email" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Password: </td><td><sf:input class="control"  path="password"  rows="10" cols="10"></sf:input><sf:errors path="text" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Confirm Password: </td><td><input class="control"  path="confpassword"/>
<tr><td class="label"> </td><td><input class="control"  value="Create Account" type="submit" /></td></tr>
</table>

</sf:form>

</body>
</html>