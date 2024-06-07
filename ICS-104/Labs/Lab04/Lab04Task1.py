num = int(input("Enter The Number: "))
if num % 3 ==  0 and num % 5 == 0 :
    print(f"{num} is divisible by 3 and 5")
elif num % 3 == 0 and num % 5 != 0 :
    print(f"{num} is divisible by 3 only")
elif num % 5== 0 and num % 3 != 0 :
    print(f"{num} is divisible by 5 only")
else:
    print(f"{num} is neither divisible by 3 nor by 5")

