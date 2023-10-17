<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Are you sure you want to delete this employee.....</h1>

<form action="delete" method="post"><br><br>
Input id : <input type="number" 
name="id" 
value="<%=request.getParameter("id") %>"><br><br>
<input type="submit">

</form>

</body>
</html>