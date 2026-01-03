<!-- Login page -->
<html>
<head>
<title>Login</title>
<script src="validation.js"></script>
</head>
<body>

<!-- Login form -->
<form action="login" method="post" onsubmit="return validateLogin()">

<!-- Username -->
Username: <input type="text" id="user" name="user"><br><br>

<!-- Password -->
Password: <input type="password" id="pass" name="pass"><br><br>

<input type="submit" value="Login">

</form>

<a href="register.jsp">New User Register</a>

</body>
</html>
