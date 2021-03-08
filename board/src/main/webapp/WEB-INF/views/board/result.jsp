<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>


<script>
   
   var result = '<c:out value="${result}"/>';
   console.log(result);
   
   if(result==1){
	   alert('정상적으로 처리되었습니다.');
	   location.href="<c:url value="/"/>";
   } else{
	   alert('정상처리되지 않았습니다. 다시 시도해주세요.');
   }
   
</script>           
</body>
</html>