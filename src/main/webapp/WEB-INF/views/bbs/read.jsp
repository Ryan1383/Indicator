<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 읽기</title>
 <%@ include file="../util/includeCSS.jsp" %>

</head>
<body>
  <%@ include file="../util/template.jsp" %>
  <br><br><br><br>
  <div class = "container">
        <form id=""  action="modify" method="post">
        <div>
			<p><label>글번호</label><input type ="text" class="form-control" name="bno" value="${boardVO.bno}" readonly="readonly"></p>
			<p><label>제목</label><input type ="text" class="form-control" name="title"  value="${boardVO.title}" readonly="readonly"></p>
			<p><label>작성자</label><input type ="text" class="form-control" name="writer" size="15" value="${boardVO.writer }" readonly="readonly"><p>
			<label>내용</label> <textarea name=content class="form-control" rows ="10" cols="70"  readonly="readonly">${boardVO.content}</textarea><br>
			
			<c:set var ="writer" value="${boardVO.writer }"/>
			<c:set var ="userId" value="${userId}"/>
			<c:if test ="${ writer eq userId }">
		  		<button type="submit" formaction ="modify" formmethod="get" class = "btn btn-outline-primary">수정</button>
				<button type="submit" formaction ="remove" formmethod="post" class = "btn btn-outline-danger">삭제</button>
			</c:if>
				<button type="submit" formaction ="list" formmethod="get" class = "btn btn-outline-primary" >목록</button>
			</div>
			
		</form>
		</div>
		
		<%@ include file="comment.jsp" %>
		<!-- 게시물 끝 -->
	
	<footer  >
     	 <p>In's portfolio project 2019 ${userId }</p>
    </footer>
  
	
   <%@ include file="../util/includeJS.jsp" %>
	
</body>
</html>