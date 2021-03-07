<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1>게시글 수정</h1>
      <form method="post">
      <label for="nickname">
      <input type="text" id="nickname" name="nickname" placeholder="${oldData.nickname}">
      </label>
      <select name="category" value="${oldData.category}">
      <option value="">- 카테고리 -</option>
      <option value="생활꿀팁">생활꿀팁</option>
      <option value="정치/경제">정치/경제</option>
      <option value="유머/개그">유머/개그</option>
      </select><br>
      <label for="title">
      <input type="text" id="title" name="title" placeholder="${oldData.title}" style="width:235px;">
      </label><br>
      <label for="content">
      <input type="text" id="content" name="content" placeholder="${oldData.content}" style="height:200px; width:235px;"><br>
      </label>  
      <input type="submit" value="수정">
      <input type="reset" value="취소">
      </form>

</body>
</html>