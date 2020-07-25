<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation Page</title>
	</head>
	<body>
		<h2> Student Confirmed </h2>
		<p> FirstName : ${student.firstName} </p>
		<p> LastName : ${student.lastName} </p>
		<p> Country : ${student.country} </p>
		<p> Favorite Language : ${student.favoriteLanguage} </p>
		<p> Operating Systems: </p>
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}" >
				<li> ${temp} </li>
			</c:forEach>
		</ul>
	</body>
</html>