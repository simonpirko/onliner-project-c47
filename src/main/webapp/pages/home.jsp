<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Zenbook
  Date: 03.12.2021
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mein window</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style>
        <%@include file="/pages/styles/home.css"%>
    </style>
</head>
<body>
<jsp:include page="/pages/_header.jsp"/>

<div class="row m-4">

    <div class="col-2 ">
        <h4 style="margin-left: 70px">
            Categories
        </h4>
        <div class="card"
             style="width: 250px; height: 125px;  left: 5px; margin-right: 20px; border-width: 5px; border-radius: 10%">
            <div class="list-group" id="list-tab" style="margin-top: 20px" role="tablist">
                <div class="d-grid gap-2">
                    <a href="#" class="btn btn-success">Mobile</a>
                    <a href="#" class="btn btn-success">Laptop</a>
                </div>
            </div>
        </div>
    </div>

    <div class="col-10" style="display: flex; flex-wrap: wrap; flex-direction: row; width: 1000px;">
        <c:forEach begin="0" items="product" end="${fn:length(sessionScope.homeProductList) - 1}" var="index">
            <div class="col-5">
                <div class="card mb-5" style="margin-right :150px; margin-left: 150px; height: 450px; width: 306px;">
                    <img class="card-img-top" style="width: 306px; height: 250px;" src= "${product.get(index).image}" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">${product.get(index).brand} ${product.get(index).model}</h5>
                        <p class="card-text">${product.get(index).description}</p>
                        <p class="text">Price: ${product.get(index).price}</p>
                        <a href="#" class="btn btn-outline-secondary">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-cart2" viewBox="0 0 16 16">
                                <path d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l1.25 5h8.22l1.25-5H3.14zM5 13a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z"/>
                            </svg>
                            Buy</a>
                        <a href="#" class="btn btn-outline-secondary">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-eye" viewBox="0 0 16 16">
                                <path d="M16 8s-3-5.5-8-5.5S0 8 0 8s3 5.5 8 5.5S16 8 16 8zM1.173 8a13.133 13.133 0 0 1 1.66-2.043C4.12 4.668 5.88 3.5 8 3.5c2.12 0 3.879 1.168 5.168 2.457A13.133 13.133 0 0 1 14.828 8c-.058.087-.122.183-.195.288-.335.48-.83 1.12-1.465 1.755C11.879 11.332 10.119 12.5 8 12.5c-2.12 0-3.879-1.168-5.168-2.457A13.134 13.134 0 0 1 1.172 8z"/>
                                <path d="M8 5.5a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5zM4.5 8a3.5 3.5 0 1 1 7 0 3.5 3.5 0 0 1-7 0z"/>
                            </svg>
                            View Product</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
