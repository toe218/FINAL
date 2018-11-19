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
<title>Insert title here</title>

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
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>액티비티 상품등록</h2>
						</thead>
						<tbody>
							<form:form commandName="activity" action="activity_insert">
								<form:hidden path="activityNum" value="1" />
								<tr>
									<th>상품명 :</th>
									<td><form:input path="activityName" /></td>
								</tr>
								<tr>
									<th>가격 :</th>
									<td><form:input path="activityPrice" /></td>
								</tr>
								<tr>
								<tr>
									<th>이미지파일 :</th>
									<td><form:input path="activityFile" /></td>
								</tr>
								<tr>
									<th>종류 :</th>
									<td><form:select path="activityCate">
											<option value="식당">식당</option>
											<option value="레져">레져</option>
											<option value="관광">관광</option>
										</form:select></td>
								</tr>
								<tr>
									<th>내용 :</th>
									<td><form:textarea path="activityContent" rows="5"
											cols="22" /></td>
								</tr>
								<tr>
									<th>업체명 :</th>
									<td><form:input path="activityCompany" /></td>
								</tr>
								<tr>
								<tr>
									<th>업체번호 :</th>
									<td><form:input path="activityTel" /></td>
								</tr>
								<tr>
									<th>대표자이름 :</th>
									<td><form:input path="activityPresident" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="등록" /> <a
										href="#"><input type="button" value="글 목록" /></a></td>
								</tr>
							</form:form>
					</table>
				</div>
			</div>
		</div>
	</section>
</body>
</html>