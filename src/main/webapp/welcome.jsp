<!-- Welcome page -->
<%@ page session="true" %>
<html>
<body>

<!-- Display username -->
<h2>Welcome ${sessionScope.user}</h2>

<a href="logout">Logout</a>

</body>
</html>
