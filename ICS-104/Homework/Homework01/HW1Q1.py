# Question 1: Logic Functions Calculator
# I will use the camelCase.
logicName = input("Enter logic function name (and, or, not): ").lower() # i used the lower method to ignore the user errors

# This is to validate the function names.
if logicName == "and" :

    firstValue = int(input("Enter value of condition A: ")) # This is the value of condition A
    secondValue = int(input("Enter value of condition B: ")) # This is the value of condition B

    # This is to validate against the user input.
    if firstValue == 0:
        if secondValue == 0: # This is the first condition
            print('"and" logic function result = 0')
        elif secondValue == 1: # This is the second condition
            print('"and" logic function result = 0')   
        else:
            print("Error: either B is not a digit, has more than one digit, or is out of the 0,1 range")

    elif firstValue == 1:
        if secondValue == 0: # This is the first condition
            print('"and" logic function result = 0')
        elif secondValue == 1: # This is the second condition
            print('"and" logic function result = 1')
        else:
            print("Error: either B is not a digit, has more than one digit, or is out of the 0,1 range")
    else:
        print("Error: either A is not a digit, has more than one digit, or is out of the 0,1 range")

elif logicName == "or" :
    firstValue = int(input("Enter value of condition A: ")) # This is the value of condition A
    secondValue = int(input("Enter value of condition B: ")) # This is the value of condition B
    
    if firstValue == 0:
        if secondValue == 0: # This is the first condition
            print('"or" logic function result = 0')
        elif secondValue == 1: # This is the second condition
            print('"or" logic function result = 1')
        else:
            print("Error: either B is not a digit, has more than one digit, or is out of the 0,1 range")
    
    elif firstValue == 1:
        if secondValue == 0: # This is the first condition
            print('"or" logic function result = 1')
        elif secondValue == 1: # This is the second condition
            print('"or" logic function result = 1')
        else:
            print("Error: either B is not a digit, has more than one digit, or is out of the 0,1 range")
    else:
        print("Error: either A is not a digit, has more than one digit, or is out of the 0,1 range")

elif logicName == "not" :

    firstValue = int(input("Enter value of condition A: ")) # This is the value of condition A

    if firstValue == 0: # This is the first condition
        print('"not" logic function result = 1')
    elif firstValue == 1: # This is the second condition
        print('"not" logic function result = 0')
    else:
        print("Error: either A is not a digit, has more than one digit, or is out of the 0,1 range")
else: # to validate against function names
    print("Error: unknown logic function")