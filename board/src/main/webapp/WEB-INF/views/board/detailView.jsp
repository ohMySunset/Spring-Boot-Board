<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${board.nickname}님의 게시글</h1>
     <table>
     <tr>
     <td>작성자</td>
     <td>${board.nickname}</td>
     </tr>
     <tr>
     <td>제목</td>
     <td>${board.title}</td>
     </tr>
     <tr>
     <td>카테고리</td>
     <td>${board.category}</td>
     </tr>
     <tr>
     <td>내용</td>
     <td>${board.content}</td>
     </tr>
     <tr>
     <td>작성일자</td>
     <td>${board.writedate}</td>
     </tr>
     </table>
     <a href="<c:url value="/board/edit/${board.idx}"/>"><input type="button" value="수정"></a>
     <a href="<c:url value="/board/delete/${board.idx}"/>"><input type="button" value="삭제"></a>
     <a href="<c:url value="/"/>">뒤로가기</a>
     
</body>
</html>