<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<colgroup>
			<col width="50">
			<col width="100">
			<col width="300">
			<col width="100">
		</colgroup>
		<tr>
			<th>NO</th>
			<th>WRITER</th>
			<th>TITLE</th>
			<th>DATE</th>
		</tr>
		
		<c:choose>
			<c:when test="${empty list }">
				<td colspan="4">------value값이 없습니다--------</td>
			</c:when>
			<c:otherwise>
				
					<c:forEach items="${list }" var="list">
						<tr>
						<td>${list.myno }</td>
						<td>${list.myname }</td>
						<td>${list.mytitle }</td>
						<td>${list.mydate }</td>
						</tr>
					</c:forEach>
				
			</c:otherwise>
	
		</c:choose>
	
	</table>
</body>
</html>