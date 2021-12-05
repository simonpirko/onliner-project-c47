<%--
  Created by IntelliJ IDEA.
  User: dima2
  Date: 03.12.2021
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Authorization</title>
</head>
<%--<jsp:include page="/pages/_header.jsp"/>--%>
<body>
<div class="container">
    <div class="row justify-center-center">
        <div class="col-sm-3">
            <form action="authorization" method="post">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">login</label>
                    <input type="text" name="username" class="form-control" id="exampleInputEmail1"
                           aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <c:if test="${requestScope.message!=null}">
                <div class="alert alert-danger" role="alert">
                        ${requestScope.message}
                </div>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>
