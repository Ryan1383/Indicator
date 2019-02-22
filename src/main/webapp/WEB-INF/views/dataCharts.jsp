<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>## 데이터 통계 ##</title>
<%@ include file="util/includeCSS.jsp" %>

 
<style>
    .swiper-container {
      width: 100%;
      height: 100%;
      margin-left: auto;
      margin-right: auto;
    }
    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;

      /* Center slide text vertically */
      display: -webkit-box;
      display: -ms-flexbox;
      display: -webkit-flex;
      display: flex;
      -webkit-box-pack: center;
      -ms-flex-pack: center;
      -webkit-justify-content: center;
      justify-content: center;
      -webkit-box-align: center;
      -ms-flex-align: center;
      -webkit-align-items: center;
      align-items: center;
    }

	.tableSize {
		width : 500px;
		height : 200px;
		position : relative;
		margin : 10px;
		
	}
	.tableSize2 {
		width : 500px;
		height : 200px;
		margin : 10px;
		float : right;		
		position : relative;
		bottom : 220px;
	}
	
	.canvasSize{
		width :70%;
		height : 70%;
		margin : 10px;
		position : relative;
		left : 180px;
		
	}
	
	table th, table td{
		font-size : 13px;
	}
	
</style> 
 
</head>
<body>
	<%@ include file="util/template.jsp" %>
	
            <div class="swiper-container">
              <div class="swiper-wrapper">
              
                <div class="swiper-slide">
                	<div class ="container" >
                	  <div class="ibox-title">국가별  식당 가격</div>
                		 <div class ="canvasSize">
							<canvas id="bar-chart-grouped-meal" ></canvas> 
						</div>
					<div class ="tableSize">
	                    <table class="table table-hover" style ="text-align : center;">
							<tr style =" background: rgba(54, 162, 235, 0.6); color : white">
								<th></th><th> 1인분 비싼  국가</th><th>2인분  비싼  국가</th><th>맥밀 비싼  국가</th>			
							</tr>	
							<tr>
								<th style ="color : darkgray">국가 이름 </th><td>${nOneMax }</td><td>${nTwoMax }</td><td>${nMcmillMax }</td>
							</tr>
							<tr>
								<th style ="color : darkgray">가    격 (단위 :원) </th><td>${oneMax }</td><td>${twoMax }</td><td>${mcMax }</td>
							</tr>	
							<tr>
								<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${oneAvg }</td><td>${twoAvg }</td><td>${mcAvg }</td>
							</tr>
						</table>
					</div>
					<div class ="tableSize2">
						<table class="table table-hover" style ="text-align : center;">
							<tr style =" background: rgba(54, 162, 235, 0.6); color : white">
								<th></th><th> 1인분  싼 국가</th><th>2인분 싼 국가</th><th>맥밀  싼 국가</th>			
							</tr>	
							<tr>
								<th style ="color : darkgray">국가 이름 </th><td>${nOneMin }</td><td>${nTwoMin }</td><td>${nMcMin }</td>
							</tr>
							<tr>
								<th style ="color : darkgray">가    격 (단위 :원) </th><td>${oneMin }</td><td>${twoMin }</td><td>${mcMin }</td>
							</tr>	
							<tr>
								<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${oneAvg }</td><td>${twoAvg }</td><td>${mcAvg }</td>
							</tr>
						</table>
					</div>
                 </div>
                </div>
                <div class="swiper-slide">
                      <div class ="container">
                          <div class="ibox-title">국가별  식품 가격</div>
                          <div class ="canvasSize">
							<canvas id="bar-chart-grouped-market" style ="margin-bottom : 30px;"></canvas> 
                       	</div>	
                       <div class ="tableSize">
                       	<table class="table table-hover" style ="text-align : center;">
								<tr style =" background: rgba(54, 162, 235, 0.6); color : white; font-size : 14px;" >
									<th></th><th>우유 비싼 국가</th><th>쌀 비싼 국가</th><th>사과  비싼 국가</th><th>물  비싼 국가</th>			
								</tr>	
								<tr>
									<th style ="color : darkgray">국가 이름 </th><td>${nMilkMax }</td><td>${nRiceMax }</td><td>${nAppleMax }</td><td>${nWaterMax }</td>
								</tr>
								<tr>
									<th style ="color : darkgray">가    격 (단위 :원) </th><td>${milkMax }</td><td>${riceMax }</td><td>${appleMax }</td><td> ${waterMax}</td>
								</tr>	
								<tr>
									<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${milkAvg }</td><td>${riceAvg }</td><td>${appleAvg }</td><td> ${waterAvg }</td>
								</tr>
							</table>
						</div>
						<div class ="tableSize2">	
							<table class="table table-hover" style ="text-align : center;">
								<tr style =" background: rgba(54, 162, 235, 0.6); color : white; font-size : 14px;" >
									<th></th><th>우유 싼 국가</th><th>쌀 싼 국가</th><th>사과  싼 국가</th><th>물  싼 국가</th>			
								</tr>	
								<tr>
									<th style ="color : darkgray">국가 이름 </th><td>${nMilkMin }</td><td>${nRiceMin }</td><td>${nAppleMin }</td><td> ${nWaterMin }</td>
								</tr>
								<tr>
									<th style ="color : darkgray">가    격 (단위 :원) </th><td>${milkMin }</td><td>${riceMin }</td><td>${appleMin }</td><td> ${waterMin }</td>
								</tr>	
								<tr>
									<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${milkAvg }</td><td>${riceAvg }</td><td>${appleAvg }</td><td> ${waterAvg }</td>
								</tr>
							</table>
							</div>
						</div>
                   </div>
                   
                  <div class="swiper-slide">
                     <div class ="container">
                        <div class="ibox-title">국가별  육아 교육 비용</div>
                        <div class ="canvasSize">
							<canvas id="bar-chart-grouped-child" style ="margin-bottom : 30px;"></canvas> 
						</div>
						<div class ="tableSize">	
	                       	<table class="table table-hover" style ="text-align : center;">
								<tr style =" background: rgba(54, 162, 235, 0.6); color : white">
									<th></th><th>유치원  비싼 국가</th><th>국제초등학교  비싼 국가</th>			
								</tr>	
								<tr>
									<th style ="color : darkgray">국가 이름 </th><td>${nKinderMax }</td><td>${nSchoolMax }</td>
								</tr>
								<tr>
									<th style ="color : darkgray">가    격 (단위 :원) </th><td>${kinderMax }</td><td>${schoolMin }</td>
								</tr>	
								<tr>
									<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${kinderAvg }</td><td>${schoolAvg }</td>
								</tr>
							</table>
						</div>
						<div class ="tableSize2">
							<table class="table table-hover" style ="text-align : center;">
								<tr style =" background: rgba(54, 162, 235, 0.6); color : white">
									<th></th><th>유치원 싼 국가</th><th>국제초등학교  싼국가</th>			
								</tr>	
								<tr>
									<th style ="color : darkgray">국가 이름 </th><td>${nKinderMin }</td><td>${nSchoolMin }</td>
								</tr>
								<tr>
									<th style ="color : darkgray">가    격 (단위 :원) </th><td>${kinderMin }</td><td>${schoolMin }</td>
								</tr>	
								<tr>
									<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${kinderAvg }</td><td>${schoolAvg }</td>
								</tr>
							</table>
						</div>
					</div>	
				</div>
				
               <div class="swiper-slide">
                  <div class ="container">
                    <div class="ibox-title">국가별  주거 비용</div>
                    <div class ="canvasSize">
						<canvas id="bar-chart-grouped-living" style ="margin-bottom : 30px;"></canvas> 
					</div>
					<div class ="tableSize">			
	                    <table class="table table-hover" style ="text-align : center;">
							<tr style =" background: rgba(54, 162, 235, 0.6); color : white; font-size : 14px;" >
								<th></th><th>도시(침실 1) 비싼 국가</th><th>도시(침실2) 비싼 국가</th><th>외곽(침실1) 비싼 국가</th><th>외곽(침실2) 비싼 국가</th>			
							</tr>	
							<tr>
								<th style ="color : darkgray">국가 이름 </th><td>${nCityOneMax }</td><td>${nCityTwoMax }</td><td>${nSubOneMax }</td><td>${nSubTwoMax }</td>
							</tr>
							<tr>
								<th style ="color : darkgray">가    격 (단위 :원) </th><td>${cityOneMax }</td><td>${cityTwoMax }</td><td>${subOneMax }</td><td> ${subTwoMax}</td>
							</tr>	
							<tr>
								<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${cityOneAvg }</td><td>${cityTwoAvg }</td><td>${subOneAvg }</td><td> ${subTwoAvg }</td>
							</tr>
						</table>
					</div>
					<div class ="tableSize2">
						<table class="table table-hover" style ="text-align : center;">
							<tr style =" background: rgba(54, 162, 235, 0.6); color : white; font-size : 14px;" >
								<th></th><th>도시(침실 1) 싼 국가</th><th>도시(침실2) 싼 국가</th><th>외곽(침실1) 싼국가</th><th>외곽(침실2) 싼 국가</th>			
							</tr>	
							<tr>
								<th style ="color : darkgray">국가 이름 </th><td>${nCityOneMin }</td><td>${nCityTwoMin }</td><td>${nSubOneMin }</td><td> ${nSubTwoMin }</td>
							</tr>
							<tr>
								<th style ="color : darkgray">가    격 (단위 :원) </th><td>${cityOneMin }</td><td>${cityTwoMin }</td><td>${subOneMin }</td><td> ${subTwoMin }</td>
							</tr>	
							<tr>
								<th style ="color : darkgray">전체  평균(단위 :원) </th><td>${cityOneAvg }</td><td>${cityTwoAvg }</td><td>${subOneAvg }</td><td> ${subTwoAvg }</td>
							</tr>
						</table>
					</div>
               	  </div> 
               	  </div>
                 </div>
                  
                    <div class="swiper-pagination"></div>
                    <div class="swiper-button-next"></div>
   					 <div class="swiper-button-prev"></div>
                </div>
                    
	<footer >
     	 <p>In's portfolio project 2019</p>
    </footer>
<%@ include file="util/includeJS.jsp" %>
<script>


new Chart(document.getElementById("bar-chart-grouped-meal"), {
    type: 'bar',
    data: {
      labels: ["대한민국", "미국", "일본", "영국", "캐나다", "프랑스", "호주"],
      datasets: [
        {
          label: "식당에서 1인분 가격",
          backgroundColor:  "rgba(255, 99, 132, 0.6)",
          data: [ ${nOneAvg1 },   ${nOneAvg2 },   ${nOneAvg3 },  ${nOneAvg4 },  ${nOneAvg5 },  ${nOneAvg6 },  ${nOneAvg7 }]
        }, {
          label: "식당에서 2인분 3코스 ",
     	 backgroundColor:"rgba(54, 162, 235, 0.6)",
          data: [${nTwoAvg1}, ${nTwoAvg2},${nTwoAvg3},${nTwoAvg4},${nTwoAvg5},${nTwoAvg6},${nTwoAvg7} ]
        },{
        	label : "맥도날도 맥밀",
            backgroundColor: "rgba(235, 26, 86, 0.6)",
        	 data: [${nMcAvg1}, ${nMcAvg2},${nMcAvg3},${nMcAvg4},${nMcAvg5},${nMcAvg6},${nMcAvg7}  ] 
        }
      ]
    },
    options: {
      title: {
        display: true,
        responsive: true,
        text: '국가별 평균 식사 가격( 단위 : 원) '
      }
    }
});

new Chart(document.getElementById("bar-chart-grouped-market"), {
    type: 'bar',
    data: {
      labels: ["대한민국", "미국", "일본", "영국", "캐나다", "프랑스", "호주"],
      datasets: [
        {
          label: "우유 1L",
          backgroundColor:  "rgba(255, 99, 132, 0.6)",
          data: [ ${nMilkAvg1 },   ${nMilkAvg2 },   ${nMilkAvg3 },  ${nMilkAvg4 },  ${nMilkAvg5 },  ${nMilkAvg6 },  ${nMilkAvg7 }]
        }, {
          label:"쌀 1kg",
     	 backgroundColor:"rgba(54, 162, 235, 0.6)",
          data: [${nRiceAvg1}, ${nRiceAvg2},${nRiceAvg3},${nRiceAvg4},${nRiceAvg5},${nRiceAvg6},${nRiceAvg7} ]
        },{
        	label :"사과1kg",
            backgroundColor: "rgba(255, 206, 86, 0.6)",
        	 data: [${nAppleAvg1}, ${nAppleAvg2},${nAppleAvg3},${nAppleAvg4},${nAppleAvg5},${nAppleAvg6},${nAppleAvg7}  ] 
        },{
        	label :"물 1.5L",
            backgroundColor: "rgba(235, 26, 86, 0.6)",
        	 data: [${nWaterAvg1}, ${nWaterAvg2},${nWaterAvg3},${nWaterAvg4},${nWaterAvg5},${nWaterAvg6},${nWaterAvg7}  ] 
        }
      ]
    },
    options: {
      title: {
        display: true,
        responsive: true,
        text: '국가별 평균 식품 가격( 단위 : 원) '
      }
    }
});

new Chart(document.getElementById("bar-chart-grouped-living"), {
    type: 'bar',
    data: {
      labels: ["대한민국", "미국", "일본", "영국", "캐나다", "프랑스", "호주"],
      datasets: [
        {
          label: "도시이며 침실이 하나",
          backgroundColor:  "rgba(255, 99, 132, 0.6)",
          data: [ ${nCityOneAvg1 },   ${nCityOneAvg2 },   ${nCityOneAvg3 },  ${nCityOneAvg4 },  ${nCityOneAvg5 },  ${nCityOneAvg6 },  ${nCityOneAvg7 }]
        }, {
          label:"도시이며 침실이 둘",
     	 backgroundColor:"rgba(54, 162, 235, 0.6)",
          data: [${nCityTwoAvg1}, ${nCityTwoAvg2},${nCityTwoAvg3},${nCityTwoAvg4},${nCityTwoAvg5},${nCityTwoAvg6},${nCityTwoAvg7} ]
        },{
        	label :"외곽이며 침실 하나",
            backgroundColor: "rgba(255, 206, 86, 0.6)",
        	 data: [${nSubOneAvg1}, ${nSubOneAvg2},${nSubOneAvg3},${nSubOneAvg4},${nSubOneAvg5},${nSubOneAvg6},${nSubOneAvg7}  ] 
        },{
        	label :"외곽이며 침실 둘",
            backgroundColor: "rgba(235, 26, 86, 0.6)",
        	 data: [${nSubTwoAvg1}, ${nSubTwoAvg2},${nSubTwoAvg3},${nSubTwoAvg4},${nSubTwoAvg5},${nSubTwoAvg6},${nSubTwoAvg7}  ] 
        }
      ]
    },
    options: {
      title: {
        display: true,
        responsive: true,
        text: '국가별 평균 주거 소요 비용( 단위 : 원) '
      }
    }
});


new Chart(document.getElementById("bar-chart-grouped-child"), {
    type: 'bar',
    data: {
      labels: ["대한민국", "미국", "일본", "영국", "캐나다", "프랑스", "호주"],
      datasets: [
        {
          label: "유치원 월 가격",
          backgroundColor:  "rgba(255, 99, 132, 0.6)",
          data: [ ${nKinderAvg1 },   ${nKinderAvg2 },   ${nKinderAvg3 },  ${nKinderAvg4 },  ${nKinderAvg5 },  ${nKinderAvg6 },  ${nKinderAvg7 }]
        }, {
          label:"국제 초등학교 연간 학비",
     	 backgroundColor:"rgba(54, 162, 235, 0.6)",
          data: [${nSchoolAvg1}, ${nSchoolAvg2},${nSchoolAvg3},${nSchoolAvg4},${nSchoolAvg5},${nSchoolAvg6},${nSchoolAvg7} ]
        }
    ]
    },
    options: {
      title: {
        display: true,
        responsive: true,
        text: '국가별 평균 육아 교육 가격( 단위 : 원) '
      }
    }
});


var swiper = new Swiper('.swiper-container', {
    slidesPerView: 1,
    spaceBetween: 30,
    loop: true,
    pagination: {
      el: '.swiper-pagination',
      clickable: true,
    },
    navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
    },
  });
</script>
</body>
</html>