<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 10.12.2021
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<jsp:include page="/pages/_header.jsp"/>
<div>
    <center>
        <h1>
            Продукты
        </h1>
        <a class="btn btn-primary" href="#" style="float: right" role="button">Create product</a>
    </center>
</div>
<div class="row justify-center m-5">
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Brand</th>
            <th scope="col">Model</th>
            <th scope="col">Launch date</th>
            <th scope="col">Category</th>
            <th scope="col">Price</th>
            <th scope="col">Rating</th>
        </tr>
        </thead>
        <c:if test="${sessionScope.productList != null}">
            <form action="/admin/products" method="post">
                <c:forEach begin="0" end="${fn:length(productList) - 1}" var="index">
                    <tbody>
                    <label><input type="text" name="productNumber" hidden value="${index}"></label>
                    <tr>
                        <th scope="row">${index + 1}</th>
                        <td>${sessionScope.productList.get(index).brand}</td>
                        <td>${sessionScope.productList.get(index).model}</td>
                        <td>${sessionScope.productList.get(index).marketLaunchDate}</td>
                        <td>${sessionScope.productList.get(index).category}</td>
                        <td>${sessionScope.productList.get(index).image}</td>
                        <td>${sessionScope.productList.get(index).price}</td>
                        <td>${sessionScope.productList.get(index).averageRating}</td>
                        <td>
                            <button type="submit" name="productOperation" class="btn btn-warning" value="openProduct">Open
                            </button>
                        </td>
                        <td>
                            <button type="submit" name="productOperation" class="btn btn-success" value="changeProduct">
                                Change
                            </button>
                        </td>
                        <td>
                            <button type="submit" name="productOperation" class="btn btn-danger" value="deleteProduct">Delete
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </c:forEach>
            </form>
        </c:if>
    </table>
</div>
</body>
</html>
