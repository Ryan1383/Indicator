<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE>
<html>
<head>
<title>글수정</title>
 <%@ include file="../util/includeCSS.jsp" %>
</head>
<body>
  <%@ include file="../util/template.jsp" %>
  	<div class="content">
        <div class="brand">
           	게시글 수정
        </div>
        <form id="login-form"  action="modify" method="post">
         <div>
			 <p><label>글번호</label> <input type="text" class="form-control"  name ="bno" value ="${boardVO.bno}" readonly="readonly"></p>
		    <p><label>제목</label ><input type="text" class="form-control"  name ="title" value ="${boardVO.title}" ></p>
		    <p><label>작성자</label> <input type="text" class="form-control" name="writer" size="15" value = "${boardVO.writer}" readonly="readonly"></p>
		    <label>내용</label>
		    <textarea name=content rows ="10" cols="70" class="form-control">${boardVO.content}</textarea><br>
		    <button type ="submit" class = "btn btn-outline-primary">완료</button>
		    <button type ="reset" class = "btn btn-outline-primary">취소</button>
			</div>
		</form>
	</div>
 	<div>
 		&nbsp;
 	</div>
	<footer  >
     	 <p>In's portfolio project 2019</p>
    </footer>
  	
  
  

   <%@ include file="../util/includeJS.jsp" %>
    </body>
</html>