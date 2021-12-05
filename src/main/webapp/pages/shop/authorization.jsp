<%--
  Created by IntelliJ IDEA.
  User: dima2
  Date: 05.12.2021
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<jsp:include page="/pages/_header.jsp"/>
<c:if test="${requestScope.message!=null}">
    <div class="alert alert-danger" role="alert">
            ${requestScope.message}
    </div>
</c:if>
</body>
</html>
