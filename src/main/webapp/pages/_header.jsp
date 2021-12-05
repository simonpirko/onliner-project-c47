<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<style>
    .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
    }

    @media (min-width: 768px) {
        .bd-placeholder-img-lg {
            font-size: 3.5rem;
        }
    }
</style>
<link href="headers.css" rel="stylesheet">
<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
    <symbol id="bootstrap" viewBox="0 0 118 94">
        <title>Bootstrap</title>
        <path fill-rule="evenodd" clip-rule="evenodd"
              d="M24.509 0c-6.733 0-11.715 5.893-11.492 12.284.214 6.14-.064 14.092-2.066 20.577C8.943 39.365 5.547 43.485 0 44.014v5.972c5.547.529 8.943 4.649 10.951 11.153 2.002 6.485 2.28 14.437 2.066 20.577C12.794 88.106 17.776 94 24.51 94H93.5c6.733 0 11.714-5.893 11.491-12.284-.214-6.14.064-14.092 2.066-20.577 2.009-6.504 5.396-10.624 10.943-11.153v-5.972c-5.547-.529-8.934-4.649-10.943-11.153-2.002-6.484-2.28-14.437-2.066-20.577C105.214 5.894 100.233 0 93.5 0H24.508zM80 57.863C80 66.663 73.436 72 62.543 72H44a2 2 0 01-2-2V24a2 2 0 012-2h18.437c9.083 0 15.044 4.92 15.044 12.474 0 5.302-4.01 10.049-9.119 10.88v.277C75.317 46.394 80 51.21 80 57.863zM60.521 28.34H49.948v14.934h8.905c6.884 0 10.68-2.772 10.68-7.727 0-4.643-3.264-7.207-9.012-7.207zM49.948 49.2v16.458H60.91c7.167 0 10.964-2.876 10.964-8.281 0-5.406-3.903-8.178-11.425-8.178H49.948z"></path>
    </symbol>
</svg>

<%--<nav class="navbar navbar-expand-lg navbar-dark bg-dark">--%>
<%--    <div>--%>
<%--        <a class="navbar-brand" href="/">FakeOnliner</a>--%>

<%--            <div class="row margin-top: 100%" >--%>
<%--                <form class="d-flex" action="/search" method="post">--%>
<%--                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">--%>
<%--                    <button class="btn btn-outline-success" type="submit"><i class="bi bi-search"></i></button>--%>
<%--                </form>--%>

<%--            <c:if test="${sessionScope.user == null}">--%>
<%--                <a class="btn btn-outline-success" href="/shop/registration" role="button"><i class="bi bi-shop"></i></a>--%>
<%--                <a class="btn btn-outline-primary" href="/basketUserNull" role="button"><i class="bi bi-basket"></i></a>--%>
<%--                <a class="btn btn-outline-info" href="/signIn" role="button"><i--%>
<%--                        class="bi bi-box-arrow-in-right"></i></a>--%>
<%--            </c:if>--%>
<%--            <c:if test="${sessionScope.user != null}">--%>
<%--                <a class="nav-link">${sessionScope.user.name}</a>--%>
<%--                <a class="btn btn-outline-success" href="/profile"><i class="bi bi-person-circle"></i></a>--%>
<%--                <a class="btn btn-outline-primary" href="/basketUser" role="button"><i class="bi bi-basket"></i></a>--%>
<%--                <a class="btn btn-outline-danger" href="/logout"><i class="bi bi-box-arrow-right"></i></a>--%>
<%--            </c:if>--%>
<%--            </div>--%>

<%--    </div>--%>
<%--</nav>--%>
<link href="headers.css" rel="stylesheet">
<header class="p-3 bg-dark text-white">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
                    <use xlink:href="#bootstrap"/>
                    FakeOnliner
                </svg>
            </a>
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="/" class="nav-link px-2 text-secondary">Home</a></li>
            </ul>

            <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
                <input type="search" class="form-control form-control-dark" placeholder="Search..." aria-label="Search">
            </form>

            <div class="text-end">
                <c:if test="${sessionScope.user == null}">
                    <a class="btn btn-outline-light me-2" href="/signIn" role="button">Login</a>
                    <a class="btn btn-outline-light me-2" href="/shop/registration" role="button">Sign-up</a>
                    <a class="btn btn-warning" href="/basketUserNull" role="button">Basket</a>
                </c:if>
                <c:if test="${sessionScope.user != null}">
                    <a class="nav-link">${sessionScope.user.name}</a>
                    <a class="btn btn-outline-light me-2" href="/profile">Profile</a>
                    <a class="btn btn-warning" href="/basketUser" role="button">Basket</a>
                    <a class="btn btn-outline-light me-2" href="/logout" role="button">Logout</a>
                </c:if>
            </div>
        </div>
    </div>
</header>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>