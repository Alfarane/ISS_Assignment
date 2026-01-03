<!-- Registration page -->
<html>
<head>
<title>Register</title>
<script src="validation.js"></script>
</head>
<body>

<form action="register" method="post" onsubmit="return validateRegister()">

Username: <input type="text" id="ruser" name="ruser"><br><br>
Password: <input type="password" id="rpass" name="rpass"><br><br>

<input type="submit" value="Register">

</form>

</body>
</html>
