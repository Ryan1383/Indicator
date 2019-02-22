<%@ page language="java" contentType="text/html; charset=UTF-8"%>

 <header>
 <div class="container">
        <div id="branding"  style="padding-bottom:20px">
          <a href = "index"><h1><span class="highlight">In</span> dicator</h1></a>
        </div>
        <nav>
          <ul>
            <li class="current"><a href="index">Home</a></li>
            <li><a href="about">About </a></li>
            <li><a href="dataForm">데이터 입력 </a></li>
            <li><a href="dataCharts">데이터 통계 </a></li>
            <li><a href="list">게시판 &nbsp; &nbsp;</a></li> 
            <% 
              String userId = (String)request.getSession().getAttribute("userId");
            if(userId==null){
            %>
            <li><a href="login" style=" color :rgb(223, 105, 37);">로그인</a></li>
            <li><a href="memberRegister" style=" color :rgb(223, 105, 37);">회원가입</a></li>
            <%}else{ %>
            <li><p class="user"><a href ="mypage" style=" color :#F6B352;" > <%= userId %> 님 환영합니다</a></p> 
            <li><a href="#" id = "logoutBtn" style=" color :rgb(223, 105, 37);">로그아웃</a></li>
            <%} %>
          </ul>
        </nav>
      </div>
      
    </header>

  
    	

    <div class="preloader-backdrop">
        <div class="page-preloader">Loading</div>
    </div>
