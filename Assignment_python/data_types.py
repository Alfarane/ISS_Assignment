#Integers
age = 10
b = -5
c = 0

#Floats
x = 3.14
y = -0.001  
z = 0.0

#Strings F-strings allow var to be added in a string
name = "Alfa Rane"
greeting = 'Hello, World!'

print(f'Name: {name}, Greeting: {greeting} and Age: {age}')

#Booleans
is_working = True
is_holiday = False

#Lists - ordered, mutable collection
fruits = ["apple", "banana", "cherry"]
print(fruits[0])  # Output: apple
fruits[0] = "pineapple"
print(fruits)  # Output: ['pineapple', 'banana', 'cherry']
fruits.append("mango")
print(fruits)  # Output: ['pineapple', 'banana', 'cherry', 'mango']

#Tuples - ordered, immutable collection
pincode = (12345, 67890, 54321)
print(pincode[1])  # Output: 67890
# pincode[1] = 11111  # This will raise an error


#Sets - unordered, mutable collection of unique items
colors = {"red", "green", "blue"}

empty_set = set()      # correct
empty_dict = {}        # this is a dictionary

s = {1, 2, 3, 3, 4}
print(s)  # duplicates removed

for item in s:
    print(item)         #access items using loop no indexing

colors.add("yellow")
print(colors)  # Output: {'red', 'green', 'blue', 'yellow'}
s.update([4, 5, 6])
s.remove(3)  # raises error if item not found
s.discard(10)  # safe to remove non-existing item
print(s)



#Dictionaries - key-value pairs
person = {
    "name": "Alfa Rane",
    "age": 21,
    "is_employee": True
}
print(person["name"]) # Output: Alfa Rane
print(person) # Output: {'name': 'Alfa Rane', 'age': 21, 'is_employee': True}



