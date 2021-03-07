<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>게시글 목록</h1>
     <table border="1">
     <tr>
     <td>NO.</td>
     <td>작성자</td>
     <td>제목</td>
     <td>카테고리</td>    
     <td>작성일자</td>
     </tr>
     <c:forEach items="${boardList}" var="boardList" varStatus="status">
     <tr>
     <td>${status.count}</td>
     <td>${boardList.nickname}</td>
     <td>${boardList.title}</td>
     <td>${boardList.category}</td>
     <td>${boardList.writedate}</td>
     <td><a href="<c:url value="/board/detail/${boardList.idx}"/>"><input type="button" value="보기"></a></td>
     </tr>
     
    </c:forEach>
    </table>
    <a href="<c:url value="/board/upload"/>">게시글 쓰기</a>
    
</body>
</html>