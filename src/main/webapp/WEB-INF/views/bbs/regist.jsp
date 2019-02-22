<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
 <%@ include file="../util/includeCSS.jsp" %>
</head>
	
<body>
  <%@ include file="../util/template.jsp" %>
   <div class="content">
        <div class="brand">
           	게시글 작성
        </div>
        <form id="login-form" method="post">
         <div>
			<p><label>제목</label><input type="text" name="title" class="form-control"></p>
			
			<p><label>작성자</label><input type="text" name="writer" size ="15"  value ="${userId }" class="form-control" readOnly="readOnly"></p>
			
			<label>내용</label>
			<textarea rows="15" cols="65" name="content" class="form-control"></textarea><p>
			
			<button type="submit"class = "btn btn-outline-primary">등록</button>
			<button type="reset" class = "btn btn-outline-primary">취소</button>
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