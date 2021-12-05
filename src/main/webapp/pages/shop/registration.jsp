<%--
  Created by IntelliJ IDEA.
  User: dima2
  Date: 05.12.2021
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">
    <!-- Bootstrap core CSS -->
    <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

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
    <link href="signin.css" rel="stylesheet">
    <title>Registration</title>
</head>
<body class="text-center">
<jsp:include page="/pages/_header.jsp"/>
<div class="container">
    <div class="row justify-center-center">
        <div class="col-sm-3">
            <form action="/shop/registration" method="post">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">login</label>
                    <input type="text" name="login" class="form-control" id="exampleInputEmail1"
                           aria-describedby="emailHelp" placeholder="shop12345" required>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword2" class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword2"
                           placeholder="jY5s6j1YI82Q" required>
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail3" class="form-label">Shop name</label>
                    <input type="text" name="name" class="form-control" id="exampleInputEmail3"
                           aria-describedby="emailHelp" placeholder="My shop" required>
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail4" class="form-label">Phone number</label>
                    <input type="tel" pattern="^\+375 \((17|29|25|33|44)\) [0-9]{3}-[0-9]{2}-[0-9]{2}$"
                           name="phoneNumber" class="form-control" id="exampleInputEmail4"
                           aria-describedby="emailHelp" placeholder="+375 (29) 123-45-67" required>
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail5" class="form-label">email</label>
                    <input type="email" name="email" class="form-control" id="exampleInputEmail5"
                           aria-describedby="emailHelp" placeholder="mail@gmail.com" required>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <main class="form-signin">
                <form>
                    <img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
                    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

                    <div class="form-floating">
                        <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                        <label for="floatingInput">Email address</label>
                    </div>
                    <div class="form-floating">
                        <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
                        <label for="floatingPassword">Password</label>
                    </div>

                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
                    <p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
                </form>
            </main>


            <c:if test="${requestScope.alert!=null}">
                <div class="alert alert-danger" role="alert">
                        ${requestScope.alert}
                </div>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>
