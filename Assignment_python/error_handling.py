# Try-Expect Block for Error Handling
try:
    x = int("abc")
except ValueError:
    print("Conversion failed")

# Raising Custom Exception
def check_positive(number):
    if number < 0:
        raise ValueError("Negative value not allowed")
    return number

try:
    check_positive(-5)  
except ValueError as e:
    print(e)    
 
    
try:
    x = int("10")
except ValueError:
    print("Error occurred")
else:
    print("Conversion successful:", x)
finally:
    print("Execution completed")
    
#raise is used to manually trigger an exception in Python.
#It is useful when you want to stop program execution if an invalid condition occurs.
   
def check_age(age):
    if age < 18:
        raise ValueError("Age must be 18 or above")
    print("Access granted")

check_age(20)



