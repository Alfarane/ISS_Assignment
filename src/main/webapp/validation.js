// Login validation
function validateLogin() {

    var u = document.getElementById("user").value;
    var p = document.getElementById("pass").value;

    if (u == "" || p == "") {
        alert("All fields required");
        return false;
    }
	// Check minimum username length
	    if (u.length < 3) {
	        alert("Username must be at least 3 characters");
	        return false;
	    }

	    // Check minimum password length
	    if (p.length < 5) {
	        alert("Password must be at least 5 characters");
	        return false;
	    }
    return true;
}

// Register validation
function validateRegister() {

    var u = document.getElementById("ruser").value;
    var p = document.getElementById("rpass").value;

    if (u == "" || p == "") {
        alert("All fields required");
        return false;
    }
	// Check username length
	    if (u.length < 3) {
	        alert("Username must be at least 3 characters");
	        return false;
	    }

	    // Check password length
	    if (p.length < 6) {
	        alert("Password must be at least 6 characters");
	        return false;
	    }

	    // Check password contains number
	    if (!/\d/.test(p)) {
	        alert("Password must contain at least one number");
	        return false;
	    }

	    // Check password contains uppercase letter
	    if (!/[A-Z]/.test(p)) {
	        alert("Password must contain at least one uppercase letter");
	        return false;
	    }
    return true;
}
