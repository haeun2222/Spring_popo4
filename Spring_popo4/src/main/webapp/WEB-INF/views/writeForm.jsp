<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="./write.do" method="post">
			<div>
				<label>아이디</label>
				<input type="text" id="id" name="id">
			</div>
			<div>
				<label>제목</label>
				<input type="text" id="title" name="title">
			</div>		
			<div>
				<label>내용</label>
				<textarea rows="50" cols="55" name="content"></textarea>
			</div>		
		
		<button type="submit">작성</button>
		<button type="button" onclick="history.back(-1)">취소</button>
		</form>
	</div>


</body>
</html>