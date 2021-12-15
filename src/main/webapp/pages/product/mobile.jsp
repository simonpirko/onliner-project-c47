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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
        /*.row.content {*/
        /*    height: 1500px*/
        /*}*/

        /* Set gray background color and 100% height */
        .sidenav {
            background-color: #f1f1f1;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }

            .row.content {
                height: auto;
            }
        }
    </style>
</head>
<body>
<jsp:include page="/pages/_header.jsp"/>
<%--<div class="container mt-5 mb-5">--%>
<%--<div style="row">--%>
<%--    <div class="form-check">--%>
<%--        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">--%>
<%--        <label class="form-check-label" for="flexCheckDefault">--%>
<%--            Default checkbox--%>
<%--        </label>--%>
<%--    </div>--%>
<%--    <div class="form-check">--%>
<%--        <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" checked>--%>
<%--        <label class="form-check-label" for="flexCheckChecked">--%>
<%--            Checked checkbox--%>
<%--        </label>--%>
<%--    </div>--%>
<%--    <div class="col-md-10 d-flex justify-content-end row">--%>
<%--        <c:forEach var="mobile" items="${requestScope.productList}">--%>
<%--            <div class="col-md-10 mt-2">--%>
<%--                <div class="row p-2 bg-white border rounded" style="min-height: 200px">--%>
<%--                    <div class="col-md-3 mt-1"><img class="rounded mx-auto d-block" src="${mobile.linkPhoto}"></div>--%>
<%--                    <div class="col-md-6 mt-1">--%>
<%--                        <h5>${mobile.model}</h5>--%>
<%--                        <p class="text-justify text-truncate para mb-0">${mobile.description}<br><br></p>--%>
<%--                    </div>--%>
<%--                    <div class="align-items-center align-content-center col-md-3 border-left mt-1">--%>
<%--                        <div class="d-flex flex-row align-items-center">--%>
<%--                            <h4 class="mr-1">от ${mobile.price}</h4>--%>
<%--                        </div>--%>
<%--                        <div class="d-flex flex-column mt-4">--%>
<%--                            <button class="btn btn-primary btn-sm" type="button">35 предложений</button>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </c:forEach>--%>
<%--    </div>--%>
<%--</div>--%>
<%--</div>--%>


<%--<div class="container-fluid">--%>
<%--    <div class="row content">--%>
<%--        <div class="col-sm-3 sidenav">--%>
<%--            <h4>Filters</h4>--%>
<%--        </div>--%>
<%--        <div class="col-sm-9">--%>
<%--            <div class="col-2"></div>--%>
<%--            <h4><small>${requestScope.message}</small></h4>--%>
<%--            <hr>--%>

<%--            <c:forEach var="product" items="${requestScope.productList}">--%>
<%--                <div class="col-9">--%>
<%--                    <h2>${product.model}</h2>--%>
<%--                    <h5><span class="glyphicon glyphicon-time"></span> Post by Jane Dane, Sep 27, 2015.</h5>--%>
<%--                    <h5><span class="label label-danger">${product.brand}</span> <span class="label label-primary">Rating: ${product.averageRating}</span>--%>
<%--                    </h5><br>--%>
<%--                    <p>${product.description}</p>--%>
<%--                    <br><br>--%>
<%--                        &lt;%&ndash;                <h4><small>RECENT POSTS</small></h4>&ndash;%&gt;--%>

<%--                </div>--%>
<%--                <hr>--%>
<%--            </c:forEach>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<div class="container">
    <div class="row">
        <h1>${requestScope.message}</h1>
    </div>
    <div class="row">
        <div class="col-sm-3 sidenav">
            <h4>Filters</h4>
        </div>
        <div class="col-sm-9">
            <c:forEach var="product" items="${requestScope.productList}">
            <div class="row">
                <div class="col-8 col-sm-2">
                    <div class="col-md-3 mt-1">
                    <img class="rounded mx-auto d-block" style="max-width: 100px;max-height: 130px" src="${product.linkPhoto}">
                    </div>
                </div>
                <div class="col-8 col-sm-8">
                    <h2>${product.model}</h2>
                    <h5><span class="glyphicon glyphicon-time"></span> ${product.marketLaunchDate}</h5>
                    <h5><span class="label label-danger">${product.brand}</span> <span class="label label-primary">Rating: ${product.averageRating}</span>
                    </h5><br>
                    <p>${product.description}</p>
                    <br><br>
                </div>
                <div class="col-4 col-sm-2 align-items-center align-content-center border-left mt-1">
                    <div class="d-flex flex-row align-items-center">
                        <h4 class="mr-1">от ${product.price}</h4>
                    </div>
                    <div class="d-flex flex-column mt-4">
                        <button class="label label-primary" type="button">35 предложений</button>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
    </div>
</div>

<footer class="container-fluid">
    <p>Footer Text</p>
</footer>


</body>
</html>
