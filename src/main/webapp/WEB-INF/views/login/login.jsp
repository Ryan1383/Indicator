<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width initial-scale=1.0">
<title>로그인</title>
 <%@ include file="../util/includeCSS.jsp" %>

</head>
<body class="bg-silver-300">
<%@ include file="../util/template.jsp" %>
    <div class="content">
        <div class="brand">
            <a class="link" href="index" ><span style="color : #e8491d;">IN</span><span style="color:white">DICATOR</span></a>
        </div>
        <form id="login-form" action="login" method="post" style =" border : 2px; box-shadow:4px 4px 4px 4px;">
            <h2 class="login-title">로그인</h2>
            <div class="form-group">
                <div class="input-group-icon right">
                    <div class="input-icon"><i class="fa fa-envelope"></i></div>
                    <input class="form-control" type="text" id = "userId" name="id" placeholder="ID" autocomplete="off">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group-icon right">
                    <div class="input-icon"><i class="fa fa-lock font-16"></i></div>
                    <input class="form-control" type="password" id="userPw" name="password" placeholder="Password">
                </div>
            </div>
            <div class="form-group d-flex justify-content-between">
                <label class="ui-checkbox ui-checkbox-info">
                    <input type="checkbox"  id="idSaveCheck">
                    <span class="input-span"></span>아이디 저장</label><br>
                <a href="idForgot">아이디 찾기 </a><a href="forgot"> 비밀번호찾기</a>
            </div>
            <div class="form-group">
                <button class="btn btn-info btn-block" id="login_btn" type="button">Login</button>
            </div>
            <div class="text-center">회원이 아니신가요? &nbsp;
                <a class="color-blue" href="memberRegister">회원가입</a>
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
    <script src="${pageContext.request.contextPath}/resources/js/scripts/login.js" type="text/javascript"></script>
     
</html>