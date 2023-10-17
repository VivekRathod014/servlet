<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>To update the Employee enter Id</h1>
<form action="update" method="post"><br><br>
Enter id :<input type="number" name="id" value="<%=request.getParameter("id") %>"><br><br>
Enter new Email : <input type="email" name="email"><br><br>
<input type="submit">
</form>

</body>
</html>