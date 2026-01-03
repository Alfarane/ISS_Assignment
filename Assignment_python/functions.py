def greet():
    print("Hello, World!")

def greet_person(name):
    print(f"Hello, {name}!")    

def sum(a, b):
    return a + b    


# *args (Variable Positional Arguments)
# Used when you do not know how many arguments will be passed.
# Stores arguments as a tuple.
def add(*args):
    return add(args)

print(add(1, 2, 3, 4))

# **kwargs (Variable Keyword Arguments)
# Used to pass named arguments.
# Stores arguments as a dictionary.

def display(**kwargs):
    for key, value in kwargs.items():
        print(key, value)

display(name="Alpha", age=22)


def show(*args, **kwargs):
    print(args)
    print(kwargs)

show(1, 2, 3, name="Alpha", age=22)




