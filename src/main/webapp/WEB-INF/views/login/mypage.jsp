<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>

<%@ include file="../util/includeCSS.jsp" %>

</head>
<body class="bg-silver-300">
<%@ include file="../util/template.jsp" %>
    <div class="content">
        <div class="brand">
            <a class="link" href="index" ><span style="color : #e8491d;">IN</span><span style="color:white">DICATOR</span></a>
        </div>
        
        
        <form id="mypageForm" action="mypage" method="post" style =" border : 2px; box-shadow:4px 4px 4px 4px;">
            <h2 class="login-title">정보 수정</h2>
            <hr>
             <div class="form-group">
             <label>ID</label>
                <input class="form-control" name ="id" type="text"  value ="<%=userId %> "readonly="readonly" >
            </div>
            <div class="form-group">
                <label>비밀번호 변경</label>
                <input class="form-control" id="pw" type="password" name="pw" placeholder="비밀번호는 최소 4~12글자 입력해주세요." onkeyup="chkpass(this,12)">
            </div>
            <div class="form-group">
                <input class="form-control" type="password" id = "repw" name="password_confirmation" placeholder="비밀번호를 재입력 해주세요."onkeyup="chkpass(this,12)">
            </div>
            <div class="form-group">
                <button class="btn btn-info btn-block" id ="process" type="button">변경 신청</button>
            </div>
        </form>
    </div>
    <div style = "margin-top:130px;">
	     <footer >
	      <p>In's portfolio project 2019</p>
	    </footer>
 	</div>    
    <div class="preloader-backdrop">
        <div class="page-preloader">Loading</div>
    </div>
    
    
    <%@ include file="../util/includeJS.jsp" %>
  <script>
    $(function(){
		var InputStatus = false ; 
		
		function checkInput(){
			if( $("#pw").val() == ''){
				alert("비밀번호를 입력해주세요");
				$("#pw").focus();
				InputStatus = false;
				return false;
			}else{
				InputStatus = true;
			}
			
			return false;
		}
		
	
		$("#process").click(function(){
			checkInput();
			
			if( InputStatus == true ){					
				if( $("#pw").val() != $("#repw").val() ){ 					
			    	alert("비밀번호가 같지 않습니다");
					$("#pw").focus();
					return false;
					
				}else{ 
					$("#mypageForm").submit();
				}
			}
		});
		
		
			
});
    </script>
    
 <script type="text/javascript">
    function chkpass(obj, maxByte) {
    	 
        var strValue = obj.value;
        var strLen = strValue.length;
        var totalByte = 0;
        var len = 0;
        var oneChar = "";
        var str2 = "";
 
        for (var i = 0; i < strLen; i++) {
            oneChar = strValue.charAt(i);
            if (escape(oneChar).length > 4) {
                totalByte += 2;
            } else {
                totalByte++;
            }
 
            // 입력한 문자 길이보다 넘치면 잘라내기 위해 저장
            if (totalByte <= maxByte) {
                len = i + 1;
            }
        }
 
        // 넘어가는 글자는 자른다.
        if (totalByte > maxByte) {
            alert(maxByte + "자를 초과 입력 할 수 없습니다.");
            str2 = strValue.substr(0, len);
            obj.value = str2;
            chkword(obj, 4000);
        }
    }
    </script>
</body>
</html>