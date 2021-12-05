<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">FakeOnliner</a>
        <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
            <form class="d-flex m-2" action="/search" method="post">
                <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success  m-2" type="submit"><i class="bi bi-search"></i></button>
            </form>

            <c:if test="${sessionScope.user == null}">
            <form class="d-flex m-2" action="/shop/registration" method="post">
                <a class="btn btn-outline-success" href="/shop/registration" role="button"><i class="bi bi-shop"></i></a>
            </form>
            <form class="d-flex m-2" action="/" method="post">
                <a class="btn btn-outline-primary" href="/basketUserNull" role="button"><i class="bi bi-basket"></i></a>
            </form>
            <form class="d-flex m-2" action="/user/authorization" method="post">
                <a class="btn btn-outline-info" href="/user/authorization" role="button"><i
                        class="bi bi-box-arrow-in-right"></i></a>
                </c:if>
            </form>
            <c:if test="${sessionScope.user != null}">
            <a class="nav-link">${sessionScope.user.name}</a>
            <form class="d-flex m-2" action="/search" method="post">
                <a class="btn btn-outline-success" href="/profile"><i class="bi bi-person-circle"></i></a>
            </form>
            <form class="d-flex m-2" action="/search" method="post">
                <a class="btn btn-outline-primary" href="/basketUser" role="button"><i class="bi bi-basket"></i></a>
            </form>
            <form class="d-flex m-2" action="/search" method="post">
                <a class="btn btn-outline-danger" href="/logout"><i class="bi bi-box-arrow-right"></i></a>
                </c:if>
            </form>
        </div>
    </div>
</nav>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>