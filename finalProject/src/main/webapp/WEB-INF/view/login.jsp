<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Scrolling Nav - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
	integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>


<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">

</head>
<body>
	<div style="margin-top: 70px">
		<div class="container">
			<div class="row">
				<div class="col-sm-5 col-md-5 col-lg-5 mx-auto">
					<div class="card card-signin my-5">
						<div class="card-body">
							<h5 class="card-title text-center">로그인</h5>
							<form:form action="login">
							<div class="form-label-group">
								<label for="inputId">아이디</label> 
								<form:input path="id" id="inputId" class="form-control" placeholder="아이디를 입력해 주세요" required autofocus />
							</div>
							<div class="form-label-group">
								<label for="inputPassword">비밀번호</label>
								<form:password path="password" id="inputPassword" class="form-control"	placeholder="비밀번호를 입력해 주세요" required />
							</div>
							<div class="custom-control custom-checkbox mb-3">
								<form:checkbox path="rememberPassword" class="custom-control-input" id="customCheck1" />
								<label class="custom-control-label" for="customCheck1">비밀번호 기억하기</label>
							</div>
								<form:hidden path="dvice"/>
							<input class="btn btn-lg btn-primary btn-block text-uppercase" type="submit" value="로그인">
							<a href="join"><input class="btn btn-lg btn-secondary btn-block text-uppercase" type="button" value="회원가입" /></a>
						</form:form>
						</div>
						<div class="find_info">
							<a target="_blank" href="#"
								onclick="try{nclks('log.searchid',this,event)}catch(e){}">아이디
								찾기</a> <span class="bar">|</span> <a target="_blank" href="#"
								onclick="try{nclks('log.searchpass',this,event)}catch(e){}">비밀번호
								찾기</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
