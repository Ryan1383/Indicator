<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width initial-scale=1.0">
	<title>아이디 찾기</title>
	<%@ include file="../util/includeCSS.jsp" %>

</head>
<body class="bg-silver-300">
<%@ include file="../util/template.jsp" %>
    <div class="content">
        <div class="brand">
            <a class="link" href="index" ><span style="color : #e8491d;">IN</span><span style="color:white">DICATOR</span></a>
        </div>
        <form id="forgot-form" action="javascript:;" method="post" style =" border : 2px; box-shadow:4px 4px 4px 4px;">
            <h3 class="m-t-10 m-b-10">아이디 찾기 결과 </h3>
            <hr>
            <p class="m-b-20"></p>
            <div class="form-group">
                <input class="form-control" type="text" placeholder="${msg }" style="border:8px; font-size : 18px" autocomplete="off">
            </div>
            <div class="form-group">
                 <button class="btn btn-info btn-block" type="button" onclick="window.location.href='login'">로그인창으로</button>
            </div>
        </form>
    </div>
	     <footer id="footer">
	      <p>In's portfolio project 2019</p>
	    </footer>
    <div class="preloader-backdrop">
        <div class="page-preloader">Loading</div>
    </div>
     <%@ include file="../util/includeJS.jsp" %>
    <script type="text/javascript">
        $(function() {
            $('#forgot-form').validate({
                errorClass: "help-block",
                rules: {
                    email: {
                        required: true,
                        email: true
                    },
                },
                highlight: function(e) {
                    $(e).closest(".form-group").addClass("has-error")
                },
                unhighlight: function(e) {
                    $(e).closest(".form-group").removeClass("has-error")
                },
            });
        });
    </script>
</body>
</html>