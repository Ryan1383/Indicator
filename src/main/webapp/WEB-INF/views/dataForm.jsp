<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>### 데이터 입력 ###</title>
<%@ include file="util/includeCSS.jsp" %>
</head>
<body>
	<%@ include file="util/template.jsp" %>
	<br>
	 <h1 class="" style="font-size: 50px; color: #374f65;display: inline-block;font-weight: 400;">데이터 입력</h1>
       <ol class="breadcrumb">
           <li class="breadcrumb-item">
               <a href="index.html"><i class="la la-home font-20"></i></a>
           </li>
           <li class="breadcrumb-item">살고계신 곳의 정보를 입력해주세요! &nbsp;/&nbsp; 관심있는 카테고리만 입력하셔도 됩니다.</li>
       </ol>
	 <div class="ibox">
                    <div class="ibox-head">
                        <div class="ibox-title" style ="font-size: 30px">식사(Meal) </div>
                        <div class="ibox-tools">
                            <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                        </div>
                    </div>
                    <div class="ibox-body">
                        <form class="form-horizontal" id="form-sample-1" action = "dataMeal" method="post" novalidate="novalidate">
                          <div class="form-group row">
                                <label class="col-sm-2 col-form-label">거주 국가 </label>
                                <select name='Nno'>
								  <option value='' selected> 거주국가를 선택해주세요 </option>
								  <option value=2>미국</option>
								  <option value=3>일본</option>
								  <option value=4>영국</option>
								  <option value=5>캐나다</option>
								  <option value=6>프랑스</option>
								  <option value=7>호주</option>
								</select>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">1인분의 저렴한 식사</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="onep" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">2인분 3코스 레스토랑</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="twop" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">맥도날드의 맥밀</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="mcmill" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                           
                            <div class="form-group row">
                                <div class="col-sm-10 ml-sm-auto">
                                    <button class="btn btn-info" type="submit" onclick=" alert('정보 제공에 감사드립니다.!')">작성 완료</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                
                
                 <div class="ibox">
                    <div class="ibox-head">
                        <div class="ibox-title" style ="font-size: 30px">시장(Market) </div>
                        <div class="ibox-tools">
                            <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                        </div>
                    </div>
                    <div class="ibox-body">
                        <form class="form-horizontal" action ="dataMarket"  id="form-sample-1" method="post" novalidate="novalidate">
                          <div class="form-group row">
                                <label class="col-sm-2 col-form-label">거주 국가 </label>
                               <select name='Nno'>
								  <option value='' selected> 거주국가를 선택해주세요 </option>
								  <option value=2>미국</option>
								  <option value=3>일본</option>
								  <option value=4>영국</option>
								  <option value=5>캐나다</option>
								  <option value=6>프랑스</option>
								  <option value=7>호주</option>
								</select>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">우유 1L</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="milk" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">쌀 1kg</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="rice" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">사과 1kg</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="apple" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">물 1.5L</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="water" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                           
                            <div class="form-group row">
                                <div class="col-sm-10 ml-sm-auto">
                                    <button class="btn btn-info" type="submit" onclick=" alert('정보 제공에 감사드립니다.!')">작성 완료</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                
                  <div class="ibox">
                    <div class="ibox-head">
                        <div class="ibox-title" style ="font-size: 30px">육아(Childcare)  </div>
                        <div class="ibox-tools">
                            <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                        </div>
                    </div>
                    <div class="ibox-body">
                        <form class="form-horizontal" id="form-sample-1" action = "dataChild" method="post" novalidate="novalidate">
                          <div class="form-group row">
                                <label class="col-sm-2 col-form-label">거주 국가 </label>
                               <select name='Nno'>
								  <option value='' selected> 거주국가를 선택해주세요 </option>
								  <option value=2>미국</option>
								  <option value=3>일본</option>
								  <option value=4>영국</option>
								  <option value=5>캐나다</option>
								  <option value=6>프랑스</option>
								  <option value=7>호주</option>
								</select>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">유치원 월 가격</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="kinder" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">국제 초등 학교 매년 학비</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="school" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                           
                            <div class="form-group row">
                                <div class="col-sm-10 ml-sm-auto">
                                    <button class="btn btn-info" type="submit" onclick=" alert('정보 제공에 감사드립니다.!')">작성 완료</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                
                
                
                  <div class="ibox">
                    <div class="ibox-head">
                        <div class="ibox-title" style ="font-size: 30px">주거(Apartment)  </div>
                        <div class="ibox-tools">
                            <a class="ibox-collapse"><i class="fa fa-minus"></i></a>
                        </div>
                    </div>
                    <div class="ibox-body">
                        <form class="form-horizontal" id="form-sample-1" action = "dataLiving" method="post" novalidate="novalidate">
                          <div class="form-group row">
                                <label class="col-sm-2 col-form-label">거주 국가 </label>
                               <select name='Nno'>
								  <option value='' selected> 거주국가를 선택해주세요 </option>
								  <option value=2>미국</option>
								  <option value=3>일본</option>
								  <option value=4>영국</option>
								  <option value=5>캐나다</option>
								  <option value=6>프랑스</option>
								  <option value=7>호주</option>
								</select>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">도시이며 침실이 하나(원룸)</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="cityOne" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">외곽의 원룸</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="subOne" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-2 col-form-label">도시의 아파트(침실2개)</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="cityTwo" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div> 
                               <div class="form-group row">
                                <label class="col-sm-2 col-form-label">도시 외곽의 아파트(침실2개)</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="number" name="subTwo" placeholder="'원' 단위의 숫자만 써주세요">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-10 ml-sm-auto">
                                    <button class="btn btn-info" type="submit" onclick=" alert('정보 제공에 감사드립니다.!')">작성 완료</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                
                
                
                
                
	 <footer>
      <p>In's portfolio project 2019</p>
    </footer>
	
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> 
	<script src="//geodata.solutions/includes/countrystate.js"></script>
	 <%@ include file="util/includeJS.jsp" %>
  	
</body>
</html>