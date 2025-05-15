<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Đăng ký</title>
</head>
<body>
<h2>Form đăng ký</h2>

<form:form method="post" action="/register"  accept-charset="UTF-8">
  Tên người dùng: <br/>
  <form:input path="name" /> <br/>
  <form:errors path="name" cssClass="error" /><br/>

  Email: <br/>
  <form:input path="email" /> <br/>
  <form:errors path="email" cssClass="error" /><br/>

  Số điện thoại: <br/>
  <form:input path="phone" /> <br/>
  <form:errors path="phone" cssClass="error" /><br/>

  <input type="submit" value="Đăng ký" />
</form:form>

</body>
</html>
