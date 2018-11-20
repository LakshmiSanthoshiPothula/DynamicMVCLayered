<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>
<c:url var="myAction" value="checkRegister.obj"></c:url>

<form:form method="post" modelAttribute="login" action="checkRegister.obj">
Enter First Name:<form:input path="firstName"/><br/>
Enter lastName:<form:input path="lastName"/><br/>
Gender:<form:radiobutton path="gender" value="M" label="M"/>
Gender:<form:radiobutton path="gender" value="F" label="F"/><br/>
Enter Email:<form:input path="email"/><br/>
Select Skills:
<form:checkbox path="skillSet" value="java" label="Java"/>
<form:checkbox path="skillSet" value="struts" label="struts"/>
<form:checkbox path="skillSet" value="spring" label="spring"/>
<form:checkbox path="skillSet" value="hybernate" label="hybernate"/>
Select Your City:
<form:select path="city">
  <form:option value="blr" label="Bangalore"/>
  <form:option value="mys" label="Mysore"/>
  <form:option value="hyd" label="Hyderabad"/>

</form:select>

<input type="submit" value="Register"/>
</form:form>

</body>
</html>