<%--
  Created by IntelliJ IDEA.
  User: dima2
  Date: 13.12.2021
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Mobile phones page</title>
</head>
<body>
<jsp:include page="/pages/_header.jsp"/>
<div class="container-fluid">
    <div class="col-sm-12 pt-1">
        <div class="row">
            <c:forEach var="mobile" items="${requestScope.productList}">
            <div class="container-fluid">
                <h1>Mobile phones</h1>
                <p>${mobile.model}</p>
            </div>
            </c:forEach>
        </div>
        <div class="row pt-3">
            <div class="col-sm-2">
                Фильтр
            </div>

<%--                <c:forEach var="mobile" items="${sessionScope.productList}">--%>
<%--                    <p>${mobile.model}</p>--%>
                <div class="col-sm-7">
                    <div class="row" style="min-height: 150px;">
                        <div class="col col-lg-3">
                            <img src="${mobile.linkPhoto}"
                                 class="rounded" alt="...">
                        </div>
                        <div class="col col-lg-9">
                            <p>Model</p>
                            <div>
                                <h5 class="card-title">от 2999р.</h5>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="col-sm-3 m-auto">
                    <div class="row">
                        <div class="col-sm-4">
                            <h5 class="card-title">от 2999р.</h5>
                        </div>
                        <div class="col-sm-8">
                            <button type="button" class="btn btn-primary btn-sm">35 предложений</button>
                        </div>
                    </div>

                </div>
<%--                </c:forEach>--%>

        </div>
    </div>
</div>
</body>
</html>
