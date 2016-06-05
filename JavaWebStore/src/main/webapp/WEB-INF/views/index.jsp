<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebStore</h1>
	
	<p><a href="registration">Registration</a></p>
	
	<sec:authorize access="!isAuthenticated()">
            <p><a  href="<c:url value="/login" />" role="button">Sign in</a></p>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Ваш логін: <sec:authentication property="${user.userId}" /></p>
            <p><a href="<c:url value="/logout" />" role="button">Sign out</a></p>

        </sec:authorize>
        <p><security:authorize
        access="isAuthenticated() and hasRole('ROLE_ADMIN')">
        Це буде бачити тільки адмін
    </security:authorize></p>
    <p><security:authorize access="!isAuthenticated()">
        Це буде бачити користувач який не залогінився
    </security:authorize></p>
    <p><security:authorize
        access="isAuthenticated() and principal.username!='${user.userId}' and !hasRole('ROLE_ADMIN')">
        Це буде бачити користувач який залогінився він не являється власником сторінки і він не адмін
    </security:authorize></p>
    <p><security:authorize
        access="isAuthenticated() and principal.username=='${user.userId}'">
        Це буде бачити користувач який є власником сторінки
        </security:authorize></p>
      <p>  <security:authorize access="hasRole('ROLE_USER')">
        Це буде бачити тільки користувач з роллю "користувач"
        </security:authorize></p>
</body>
</html>