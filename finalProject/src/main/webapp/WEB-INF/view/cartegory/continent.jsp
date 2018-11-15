<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
	function bbb() {
		var num = document.getElementById("continent").value;
		
		$.ajax({
			type : 'post',
			url : 'country',
			dataType : 'html',
			data : "continentName="+num,
			success : function(result) {
				$('#country').html(result);
				$('#city').html("");
			}
		});
	}
	function ccc() {
		var num1 = document.getElementById("continent").value;
		var num2 = document.getElementById("country1").value;
		$.ajax({
			type : 'post',
			url : 'city',
			dataType : 'html',
			data : "continentName="+num1+"&countryNum="+num2,
			success : function(result) {
				$('#city').html(result);
			}
		});
	}
</script>
</head>
<body>
<form id="frm" name="frm">
<div>

<select id="continent" name="continentName" onclick="javascript:bbb();">
	<% for(Object o : list ) { 
		Continent continent = (Continent)o; %>
		<option value="<%=continent.getContinentName() %>"><%= continent.getContinentName() %></option>
	<% } %>
</select>

</div>
<div id="country"></div>
<div id="city"></div>
</form>
</body>
</html>