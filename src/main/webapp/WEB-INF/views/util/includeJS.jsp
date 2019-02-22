<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

	<script src="${pageContext.request.contextPath}/resources/vendors/jquery/dist/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/popper.js/dist/umd/popper.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/metisMenu/dist/metisMenu.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/chart.js/dist/Chart.min.js" type="text/javascript"></script>
    <!-- vectorë§µì ê°ì ¸ì¨ë¤ -->
    <script src="${pageContext.request.contextPath}/resources/vendors/jvectormap/jquery-jvectormap-2.0.3.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/vendors/jvectormap/jquery-jvectormap-us-aea-en.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/app.min.js" type="text/javascript"></script>
    <!-- chart.js ìì± íì¼(index.jsì ì¸ê³ì§ë)-->
    <script src="${pageContext.request.contextPath}/resources/js/scripts/indexChart.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/scripts/swiper.min.js" type="text/javascript"></script>
    <!-- counter.js íë¬ê·¸ -->
	
	<script>
	$("#logoutBtn").unbind("click").click(function(e) {
		  e.preventDefault();
		  fn_logout();
		 });
	
	function fn_logout() {
		 if (window.confirm("로그아웃 하시겠습니까?"))
		 {
		  window.location.href="logout";
		 }
		}
	</script>