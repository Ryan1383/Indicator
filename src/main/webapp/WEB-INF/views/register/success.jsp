<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width initial-scale=1.0">
	<title>회원가입 완료</title>
	<%@ include file="../util/includeCSS.jsp" %>

</head>
<body class="bg-silver-300">
<%@ include file="../util/template.jsp" %>
    <div class="content">
        <div class="brand">
            <a class="link" href="index" ><span style="color : #e8491d;">IN</span><span style="color:white">DICATOR</span></a>
        </div>
        <form id="forgot-form" action="#" method="post">
            <h3 class="m-t-10 m-b-10"> 회원 가입 </h3>
            <p class="m-b-20">회원가입이 정상적으로 완료 되었습니다. </p>
            <div class="form-group">
            </div>
            <div class="form-group">
                <button class="btn btn-info btn-block" type="button" onclick="window.location.href='login'">로그인창으로</button>
            </div>
        </form>
    </div>
	     <footer id="footer">
	      <p>In's portfolio project 2019</p>
	    </footer>
    <div class="preloader-backdrop">
        <div class="page-preloader">Loading</div>
    </div>
     <%@ include file="../util/includeJS.jsp" %>
</body>
</html>