valid = True 
balance = int(input("Enter initial balance: "))

while valid:
    operation = input("Enter operation: D or W: ").lower()
    if len(operation)>0:
        if operation == "w":
            withdraw = int(input("Enter amount: "))
            if withdraw > balance:
                print("No withdrawal insufficient balance")
            else:
                balance = balance - withdraw
                print("Your new balance is ", balance)
        elif operation == "d":
            deposit = int(input("Enter amount: "))
            balance = balance + deposit
            print("Your new balance is ",balance)
        else:
            print("Wrong operation symbol")
    else:
        valid = False
                