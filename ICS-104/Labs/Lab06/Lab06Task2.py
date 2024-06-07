evenNum = 0
oddNum = 0
num = input("Enter a positive number: (or press Enter key to finish: )").strip()
if num != "":
    while num !="":
        value = int(num)
        if value % 2 == 0:
            evenNum +=1
        else:
            oddNum +=1
        num = input("Enter a positive number: (or press Enter key to finish: )")
    print(f"You entered {oddNum} odd and {evenNum} even numbers")

else:
    print("No positive number was entered.")        