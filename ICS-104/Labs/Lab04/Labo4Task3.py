firstNumber = float(input("Enter First Number: "))
secondNumber = float(input("EnterSecondNumber: "))
operation = input("Enter the operation to perform:")
try:
    if operation == "+":
        print(firstNumber + secondNumber)
    elif operation == "-":
        print(firstNumber - secondNumber)
    elif operation == "*":
        print(firstNumber * secondNumber)
    elif operation == "/":
        print(firstNumber / secondNumber)         
    else:
        print("you entered invalid operation")
except ZeroDivisionError :
    print("You have devided by zero")