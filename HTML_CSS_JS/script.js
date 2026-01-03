// Function for form validation
function validateForm() {

    // Get name value
    var name = document.getElementById("name").value;

    // Get email value
    var email = document.getElementById("email").value;

    // Get password value
    var password = document.getElementById("password").value;

    // Check name
    if (name == "") {
        alert("Name is required");
        return false;
    }

    // Check email
    if (email == "") {
        alert("Email is required");
        return false;
    }

    // Check password
    if (password == "") {
        alert("Password is required");
        return false;
    }

    // If all validations pass
    alert("Form submitted successfully");
    return true;
}
