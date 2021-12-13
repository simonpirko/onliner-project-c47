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
            <div class="container-fluid">
                <h1>Mobile phones</h1>
            </div>
        </div>
        <div class="row pt-3">
            <div class="col-sm-2">
                Фильтр
            </div>
            <div class="col-sm-7">
                <div class="row" style="min-height: 150px;">
                    <div class="col col-lg-3">
                        <img src="https://content2.onliner.by/catalog/device/header/b7e24b47812f00aba80cc0bbe3e3e2eb.jpeg"
                             class="rounded" alt="...">
                    </div>
                    <div class="col col-lg-9">
                        <p>15.6" 1920 x 1080 IPS, 60 Гц, несенсорный, Intel Core i5 1135G7 2400 МГц, 16 ГБ, SSD 512 ГБ,
                            видеокарта встроенная, Windows 10, цвет крышки серый</p>
                        <div>
                            <h5 class="card-title">от 2999р.</h5>
<%--                            <button type="button" class="btn btn-primary btn-sm">Все предложения</button>--%>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-3 m-auto">
                <div class="row">
                    <div class="col-sm-4">
                        <h5 class="card-title">от 2999р.</h5>
<%--                        <button type="button" class="btn btn-primary btn-sm">Купить</button>--%>
                    </div>
                    <div class="col-sm-8">
                        <button type="button" class="btn btn-primary btn-sm">35 предложений</button>
<%--                        <h5>35 предложений</h5></span>--%>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>
