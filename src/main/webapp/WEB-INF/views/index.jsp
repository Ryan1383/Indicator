<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width initial-scale=1.0">
    <title>### Indicator에 오신 것을 환영합니다 ###</title>
  	
   <%@ include file="util/includeCSS.jsp" %>
   <style>
   	 .pageheader {
        font-size: 50px;
        color: #374f65;
        display: inline-block;
        font-weight: 400;
        
    }
   
   </style>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
  <script>
    jQuery(document).ready(function( $ ) {
        $('.counter').counterUp({
            delay: 10,
            time: 2000
        });
    });
  </script>
</head>

<body>
  <%@ include file="util/template.jsp" %>
  <section id="showcase" style="background:url('${pageContext.request.contextPath}/resources/img/indexheader.jpg'">
      <div class="container">
        <h1>해외 거주자 데이터 포럼</h1>
        <p>이민/유학/취업</p>
        <br>
  	  <div class="page-heading"  style="margin-top:0px;" >
        <span style="display: inline-block; width: 62%;  "><span class ="pageheader" style="color : lightgray;"> 현재까지 데이터 입력자 수 : </span><span class="counter pageheader"style="color : lightgray;"> ${totalC} </span></span>
    </div>
      </div>
    </section>
    
     <section id="newsletter">
      <div class="container">
        <h3 style="padding-right: 20px">거주 국가의 정보를 입력해주세요!    <button type="button" id = "databtn" class="btn btn-primary" onclick="window.location.href='dataForm'">데이터 입력하기</button></h3>
      
      </div>
    </section>
  	
  <div style = "height : 100%;">
     <div class="col-lg-8">
         <canvas id="bar_chart" style="height:2px;"></canvas>
         <div class="ibox">
             <div class="ibox-head">
                 <div class="ibox-title">나라별 입력 현황</div>
             </div>
             <div class="ibox-body">
                 <div id="world-map" style="height: 300px;"></div>
                 <table class="table table-striped m-t-20 visitors-table">
                     <thead>
                         <tr>
                             <th>국가</th>
                             <th>입력자 수</th>
                             <th>데이터 수 ( 목표치 : ${num } )</th>
                         </tr>
                     </thead>
                     
                     <tbody>
                         <tr>
                             <td>
                                 <img class="m-r-10" src="${pageContext.request.contextPath}/resources/img/flags/us.png" />USA</td>
                             <td>${USATotal }</td>
                             <td>
                                 <div class="progress">
                                     <div class="progress-bar progress-bar-success" role="progressbar" style="width:${USAPer}%; height:5px;" aria-valuenow="${USAPer }" aria-valuemin="0" aria-valuemax="100">${USAPer }</div>
                                 </div>
                                 <span class="progress-parcent">${USAPer}%</span>
                             </td>
                         </tr>
                         <tr>
                             <td>
                                 <img class="m-r-10" src="${pageContext.request.contextPath}/resources/img/flags/Canada.png" />Canada</td>
                             <td>${CanTotal }</td>
                             <td>
                                 <div class="progress">
                                     <div class="progress-bar progress-bar-warning" role="progressbar" style="width:${CanPer}%; height:5px;" aria-valuenow="${CanPer}" aria-valuemin="0" aria-valuemax="100"></div>
                                 </div>
                                 <span class="progress-parcent">${CanPer}%</span>
                             </td>
                         </tr>
                         <tr>
                             <td>
                                 <img class="m-r-10" src="${pageContext.request.contextPath}/resources/img/flags/japan.png" />Japan</td>
                             <td>${JapanTotal }</td>
                             <td>
                                 <div class="progress">
                                     <div class="progress-bar progress-bar-danger" role="progressbar" style="width:${JapanPer}%; height:5px;" aria-valuenow="${JapanPer }" aria-valuemin="0" aria-valuemax="100"></div>
                                 </div>
                                 <span class="progress-parcent">${JapanPer }%</span>
                             </td>
                         </tr>
                         <tr>
                             <td>
                                 <img class="m-r-10" src="${pageContext.request.contextPath}/resources/img/flags/Australia.png" />Australia</td>
                             <td>${AusTotal }</td>
                             <td>
                                 <div class="progress">
                                     <div class="progress-bar progress-bar-info" role="progressbar" style="width:${AusPer}%; height:5px;" aria-valuenow="${AusPer }" aria-valuemin="0" aria-valuemax="100"></div>
                                 </div>
                                 <span class="progress-parcent">${AusPer }%</span>
                             </td>
                         </tr>
                         <tr>
                             <td>
                                 <img class="m-r-10" src="${pageContext.request.contextPath}/resources/img/flags/France.png" />France</td>
                             <td>${FranceTotal }</td>
                             <td>
                                 <div class="progress">
                                     <div class="progress-bar progress-bar" role="progressbar" style="width:${FrancePer}%; height:5px;" aria-valuenow="${FrancePer }" aria-valuemin="0" aria-valuemax="100"></div>
                                 </div>
                                 <span class="progress-parcent">${FrancePer }%</span>
                             </td>
                         </tr>
                         <tr>
                             <td>
                                 <img class="m-r-10" src="${pageContext.request.contextPath}/resources/img/flags/uk.png" />UK</td>
                             <td>${UKTotal }</td>
                             <td>
                                 <div class="progress">
                                     <div class="progress-bar progress-bar-info" role="progressbar" style="width:${UKPer}%; height:5px;" aria-valuenow="${UKPer }" aria-valuemin="0" aria-valuemax="100"></div>
                                 </div>
                                 <span class="progress-parcent">${UKPer }%</span>
                             </td>
                         </tr>
                     </tbody>
                 </table>
                 
             </div>
         </div>
     </div>
     
     <div class = "col-md-5" style = "position : relative ; height : 450px; width : 550px; bottom : 780px; left : 990px;">
			<div class = "ibox" style = "padding : 10px;">
			  <div class="ibox-head">
                  <div class="ibox-title">데이터 입력 현황</div>
                </div>
				<canvas id="pie-chart" width="800" height="450"></canvas>       
			</div>
		</div>	
         <div class="col-md-4" style="position: relative; bottom: 840px; left: 1010px;">
             <div class="ibox ibox-info">
                 <div class="ibox-head">
                     <div class="ibox-title" >공지 사항</div>
                     <div class="ibox-tools">
                         <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                         <a class="ibox-remove"><i class="fa fa-times"></i></a>
                     </div>
                 </div>
                 <div class="ibox-body"> 방문해 주신 모든 분들을 환영합니다.</div>
             </div>
         </div>
         <div class="col-md-4" style="position: relative; bottom: 780px; left: 1010px;">
             <div class="ibox ibox-info">
                 <div class="ibox-head">
                     <div class="ibox-title" >-처음 방문 하신 분들께-</div>
                     <div class="ibox-tools">
                         <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                         <a class="ibox-remove"><i class="fa fa-times"></i></a>
                     </div>
                 </div>
                 <div class="ibox-body"> 이 사이트는 비영리적이며 사이트의 목적인 신뢰성 있는 데이터를 위하여 데이터 입력 시 사실을 기반으로 입력해 주시면 감사하겠습니다. </div>
             </div>
         </div>
         
		</div>
         
         
         
         
         
         
		 <footer>
	     	 <p>In's portfolio project 2019</p>
	    </footer>

	  <script src="http://cdnjs.cloudflare.com/ajax/libs/waypoints/2.0.3/waypoints.min.js"></script>
   	 <script src="${pageContext.request.contextPath}/resources/vendors/counter/jquery.counterup.min.js"></script>
	
   <%@ include file="util/includeJS.jsp" %>
  	<script>
  //파이 차트 상단의 국가별 입력된 데이터 수 출력.
  	new Chart(document.getElementById("pie-chart"), {
  	    type: 'pie',
  	    data: {
  	      labels: [ "미국", "일본", "영국", "캐나다", "프랑스","호주"],
  	      datasets: [{
  	        label: "Population (millions)",
  	        backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850", "rgba(255, 206, 86, 0.6)"],
  	        data: [${USATotal},${JapanTotal},${UKTotal},${CanTotal}, ${FranceTotal},${AusTotal}]
  	      }]
  	    },
  	    options: {
  	      title: {
  	        display: true,
  	        text: '국가별 데이터 입력 현황 ( 단위 : 개)'
  	      }
  	    }
  	});
  	</script>
</body>
	
</html>
