<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			FirstName <form:input path="firstName"/>

			<br><br>

			LastName <form:input path="lastName" />

			<br><br>

			Country :
			<!--
				<form:select path="country">
					<form:option label="Brazil" value="Brazil"></form:option>
					<form:option label="France" value="France"></form:option>
					<form:option label="Germany" value="Germany"></form:option>
					<form:option label="India" value="India"></form:option>
				</form:select>
			-->
			<form:select path="country">
				<form:options items="${theCountryOptions}"/>
			</form:select>

			<br><br>

			Favorite Language :

			Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C++ <form:radiobutton path="favoriteLanguage" value="C++" />
			JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />

			<br><br>

			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			Windows <form:checkbox path="operatingSystems" value="Windows"/>
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>

			<br><br>

			<input type="submit" value="Submit" />


		</form:form>
	</body>
</html>
