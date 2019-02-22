<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width initial-scale=1.0">
    <title>ERROR 500</title>
    <%@ include file="../util/includeCSS.jsp" %>
</head>

<body class="bg-silver-100">
    <div class="content">
        <h1 class="m-t-20">500</h1>
        <p class="error-title">서버 에러</p>
        <p class="m-b-20">죄송합니다. 현재 서버가 사용자님의 요청을 받지 못합니다.
    </div>
    
    <style>
        .content {
            max-width: 450px;
            margin: 0 auto;
            text-align: center;
        }

        .content h1 {
            font-size: 160px
        }

        .error-title {
            font-size: 22px;
            font-weight: 500;
            margin-top: 30px
        }
    </style>
    <!-- BEGIN PAGA BACKDROPS-->
    <div class="sidenav-backdrop backdrop"></div>
    <div class="preloader-backdrop">
        <div class="page-preloader">Loading</div>
    </div>
      <%@ include file="../util/includeJS.jsp" %>
    
</body>


</body>
</html>