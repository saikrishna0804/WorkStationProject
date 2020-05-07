<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body><div align="center">
		<h2>INSERT FLOOR DETAILS</h2>
		<form action="FloorInsertServlet" method="post">
			<h3>FLOOR ID :  <input type="text" name="floorId"><br>
			FLOOR NAME :  <input type="text" name="floorName"><br>
			FLOOR DESCRIPTION :  <input type="text" name="floorDesc"><br> 
			<input type="submit" value="INSERT"></h3></form>
		<h2><%if (null != request.getAttribute("insert")) {out.print(request.getAttribute("insert"));}%></h2>
</div></body>
</html>