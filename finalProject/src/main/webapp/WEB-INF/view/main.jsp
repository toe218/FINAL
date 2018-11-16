<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String bodyPage = (String)request.getAttribute("bodyPage");
	if(bodyPage == null) {
		bodyPage = "body.jsp";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp" />
	</div>
	<div id="body">
			<jsp:include page="<%= bodyPage %>" />
	</div>
	<div id="footer">
		<jsp:include page="footer.jsp" />
	</div>
</body>
</html>