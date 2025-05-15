<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Thêm nhân viên</title></head>
<body>
<h2>Thêm nhân viên</h2>

<form:form action="${pageContext.request.contextPath}/employees" method="post" modelAttribute="employee">
  <table>
    <tr>
      <td>Tên:</td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td>Email:</td>
      <td><form:input path="email"/></td>
    </tr>
    <tr>
      <td>Vị trí:</td>
      <td><form:input path="position"/></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="Thêm mới"/></td>
    </tr>
  </table>
</form:form>


</body>
</html>
