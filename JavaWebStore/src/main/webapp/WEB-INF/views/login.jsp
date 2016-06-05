<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <form class="login-form" action="?${_csrf.parameterName}=${_csrf.token}" method="post">
      <input type="text" name="username" placeholder="username"/>
      <input type="password" name="password" placeholder="password"/>
      <button type="submit">login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
</html>