num = input(" Enter a positive integer value: ")
n = 0
total = 0
digits = int(num)
numOfDigits = 0
for idx in num:
    total += int(num[n])
    if digits // 10 != 0:
        numOfDigits += 1
        
    n += 1
print(f"Your integer has {numOfDigits} digits and their sum is {total} ")


    