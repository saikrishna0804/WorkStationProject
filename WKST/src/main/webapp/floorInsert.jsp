<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<form action="FloorInsertServlet" method="post">
		<h3>
			FLOOR ID: <input type="text" name="floorId">
		</h3>
		<br>
		<h3>
			FLOOR NAME: <input type="text" name="floorName">
		</h3>
		<br>
		<h3>
			FLOOR DESCRIPTION: <input type="text" name="floorDesc">
		</h3>
		<br> <input type="submit" value="INSERT">
	</form>
	<h2>
		<%
			if (null != request.getAttribute("insert")) {
				out.print(request.getAttribute("insert"));
			}
		%>
	</h2>
</body>

</html>