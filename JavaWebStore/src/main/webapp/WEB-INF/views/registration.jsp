<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

</head>

  <body>

   <div class="login-page">
  <div class="form">
    
    <form:form class="login-form" method="POST" action="?${_csrf.parameterName}=${_csrf.token}" modelAttribute="user">
        <form:input type="text" path="login" placeholder="login"/>
        <form:errors type="text" path="login"/>
		<form:input type="password" path = "password" placeholder="password"/>
		<form:errors type="text" path="password"/>
		<form:input type="text" path = "emailAdress" placeholder="E-mail adress"/>
		<form:errors type="text" path="emailAdress"/>
		<form:input type="text" path = "phoneNamber" placeholder="Mobile number"/>
		<form:errors type="text" path="phoneNamber"/>  
        <button type="submit" >create</button>
        <p class="message">Already registered? <a href="signIn">Sign In</a></p>
    </form:form>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
</html>