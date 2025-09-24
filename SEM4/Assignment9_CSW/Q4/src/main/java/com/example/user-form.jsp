<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>User Form</title></head>
<body>
<h2>User Input Form</h2>
<form:form method="POST" action="/user" modelAttribute="user">
Name: <form:input path="name"/><br/>
Email: <form:input path="email"/><br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>