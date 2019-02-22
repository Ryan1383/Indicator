<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../util/includeCSS.jsp" %>
 <%@ include file="../util/includeJS.jsp" %>
 
 <style>
 	.delete{
 		float : right;
 	}
 </style>
 
</head>
<body>

<div class="container">
<!-- 게시물 끝 -->
	  <form action = "replyWrite" method="post">
	   <div>
         	 <span><strong>댓글</strong></span> <span id="cCnt"></span>
         	 <hr>
          </div>
         <div>
			<p><input type="hidden" name="bno" value ="${read.bno}"class="form-control"></p>
 			<p><label for="writer">작성자</label><input type="text" id="writer" name="writer" value ="${userId }" readOnly ="readOnly" /></p>			
			<p><label for="content">댓글 내용</label><textarea style="width: 1100px" rows="3" cols="30" id="content" name="content" placeholder="댓글을 입력하세요">	</textarea>		
			<button type="submit"class = "btn btn-primary">등록</button>
			<button type="reset" class = "btn btn-primary">취소</button>
			</div>
		</form>
</div>

<div class ="container">
	<c:forEach items="${repList}" var="repList">
	  <div class="ibox">
		   <div class="ibox-head">
		       <div class="ibox-title"> 
				       작성자 : ${repList.writer} &nbsp;  <fmt:formatDate value="${repList.regDate}" pattern="yyyy-MM-dd" /> &nbsp; &nbsp; 
			        		<form action="replyDelete" id ="commentForm" class ="delete">
			        			<input type ="hidden" name ="rno" value="${repList.rno }"/>
			        			<input type ="hidden" name ="bno" value="${read.bno}"/>
			        			
			        			<c:set var ="writer" value="${repList.writer}"/>
								<c:set var ="userId" value="${userId}"/>
								<c:if test ="${ writer eq userId }">
		       						<button  class="replyDelete btn btn-outline-danger" type="submit"  >삭제</button>
		       					</c:if>
		       					
		       				</form>
		       </div>
		   </div>
		   <div class="ibox-body">
		       <form class="form-inline">
		         ${repList.content}
		       </form>
		    </div>
		</div>
	 </c:forEach> 			 
 </div>
</body>
</html>