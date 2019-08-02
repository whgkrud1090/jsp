<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="<%= request.getContextPath() %>/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">

	//문서 로딩이 완료된 다음 실행
	$(document).ready(function() {
		
		//라디오 버튼 클릭이벤트 등록
		$('#get, #post').click(function() {
			//클릭한 라디오 버튼이 get이면 
			//form태그의 method속성을 get으로 변경

			//클릭한 라디오 버튼이 post이면 
			//form태그의 method속성을 post로 변경
			
			console.log("click");

			var method = $(this).attr("id");
			$('form').attr('method', method);
		})
		
	})	
</script>
</head>
<body>
<!-- 
	서버로 요청을 보낼때
	1. from태그 작성
		- action : 요청을 보낼 주소
		- method(get/post)
		
			.get : 파라미터가 url의 퀴리스트링으로 전송된다.(?파라미터명=파라미터값&
				* url의 길이가 한정되어있기 때문에 무한정 파라미터를 전송하는 것이 불가능하다.
				* 일반적으로 조회시에 사용한다.
			.post : 파라미터가 http request message의 body영역을 통해 전송된다.
				* url에 파라미터가 노출되지 않는다.
				* 서버의 상태가 바뀔때(새로운데이터입력/수정/삭제)주로 사용
				
	2. input, select, checkbox, radio, textarea 
		- 파라미터로 보내기 위해서는 위 태그의 속성중에 name속성이 존재 해야한다.
		- name 속성값이 파라미터 이름
		- value 속성이 파라미터 값
 -->
<h2>get/post login</h2>
get : <input type="radio" id="get" name="method" value="get"checked="checked"/>
post : <input type="radio" id="post" name="method" value="post"/>
<br>
<form action="<%= request.getContextPath() %>/jsp/loginProcess.jsp" method="get">
	user id : <input type="text" name="userId" value="brown"/><br>
	user id : <input type="text" name="userId" value="cony"/><br>
	password : <input type="password" name="password" value="brown1234"/><br>
	<input type="submit" value="로그인"/>
</form>	
</body>
</html>