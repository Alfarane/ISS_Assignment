# Control Flow: 
# 1. If-Else Statement

age = 18

if age >= 18:
    print("Eligible to vote")
else:
    print("Not eligible")
    
# 2. For Loop

for i in range(5):
    print(f"Iteration {i}")
    
# 3. While Loop
count = 0
while count < 5:    
    print(f"Count is {count}")
    count += 1
    
# 4. Break and Continue     
for i in range(10):
    if i == 5:
        break  # Exit loop when i is 5
    if i % 2 == 0:
        continue  # Skip even numbers
    print(f"Odd number: {i}")

# 5. Pass Statement    
for i in range(3):
    pass
# 'pass' is a placeholder for future code

# 6. Loop Else
for i in range(3):
    print(i)    
else:
    print("Loop completed")  #Executes else when loop finishes without break.
    

    


