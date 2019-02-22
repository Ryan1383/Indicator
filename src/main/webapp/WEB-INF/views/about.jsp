<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>### 홈페이지 소개 ###</title>
<%@ include file="util/includeCSS.jsp" %>
<link href="${pageContext.request.contextPath}/resources/css/about.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/animate.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Jua|Roboto" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Noto+Serif+KR" rel="stylesheet"></head>
<body>
	<%@ include file="util/template.jsp" %>
	  <div class="section primary-section" id="service" style="background:#f1f1f1; font-family: 'Jua', sans-serif;">
            <div class="container">
                <div class="title">
              <h1 style="color: black;"> <span style="color : #e8491d;  ">IN</span><span style="color:white;  font-family: 'Roboto', sans-serif;">DICATOR</span>에 오신것을 환영합니다.</h1>
                    <p style ="font-size : 30px; color : black; font-weight : 400px">해외 거주민이 직접 입력한 신뢰있는 데이터로 취업/이민/유학 을 준비하세요!</p>
                </div>
                <div class="row-fluid">
                    <div class="span4">
                        <div class="centered service">
                            <div class="circle-border zoom-in" style ="margin-bottom : 20px;">
                                <img class="img-circle" src="${pageContext.request.contextPath}/resources/img/Service1.png" alt="service 1">
                            </div>
                            <h3 style ="color : #e8491d; "> 정보 공유 커뮤니티</h3>
                            <p class ="con" style="font-family: 'Noto Serif KR', serif;">게시판에서 각자 정보를 공유 하세요!</p>
                        </div>
                    </div>
                    <div class="span4">
                        <div class="centered service" >
                            <div class="circle-border zoom-in"  style ="margin-bottom : 20px;">
                                <img class="img-circle"src="${pageContext.request.contextPath}/resources/img/Service2.png" alt="service 2" />
                            </div>
                            <h3 style ="color : #e8491d;">신뢰성있는 데이터</h3>
                            <p class ="con"  style="font-family: 'Noto Serif KR', serif;">외국에 거주 하고 있는 재외국민들이 입력한 생생한 현지 데이터!</p>
                        </div>
                    </div>
                    <div class="span4">
                        <div class="centered service">
                            <div class="circle-border zoom-in"  style ="margin-bottom : 20px;">
                                <img class="img-circle" src="${pageContext.request.contextPath}/resources/img/Service3.png" alt="service 3">
                            </div>
                            <h3 style ="color : #e8491d;">그래프로 편안하게</h3>
                            <p class ="con"  style="font-family: 'Noto Serif KR', serif;">모든 데이터는 그래프와 표로 보기 쉽게 나와있습니다!</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
  <footer >
	      <p>In's portfolio project 2019</p>
   </footer>



	 <%@ include file="util/includeJS.jsp" %>

</body>
</html>