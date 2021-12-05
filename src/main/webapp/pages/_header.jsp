<%--
  Created by IntelliJ IDEA.
  User: artemarosevic
  Date: 3.12.21
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">FakeOnliner</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
            <div class="row margin-top: 100%" >
                <form class="d-flex" action="/search" method="post">
                    <input class="form-control me-2" type="search" placeholder="Search"
                           style="width:870px; height: 30px" ; aria-label="Search">
                    <button class="btn btn-outline-success" type="submit"><i class="bi bi-search"></i></button>
                </form>
            </div>
            <c:if test="${sessionScope.user == null}">
                <a class="btn btn-outline-success" href="/shopRegistration" role="button"><i class="bi bi-shop"></i></a>
                <a class="btn btn-outline-primary" href="/basketUserNull" role="button"><i class="bi bi-basket"></i></a>
                <a class="btn btn-outline-info" href="/signIn" role="button"><i
                        class="bi bi-box-arrow-in-right"></i></a>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <a class="nav-link">${sessionScope.user.name}</a>
                <a class="btn btn-outline-success" href="/profile"><i class="bi bi-person-circle"></i></a>
                <a class="btn btn-outline-primary" href="/basketUser" role="button"><i class="bi bi-basket"></i></a>
                <a class="btn btn-outline-danger" href="/logout"><i class="bi bi-box-arrow-right"></i></a>
            </c:if>
        </div>
    </div>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</body>
</html>