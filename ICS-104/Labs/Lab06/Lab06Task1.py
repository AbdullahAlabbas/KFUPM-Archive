n = int(input("Enter n ( >0 and muliple of 5 ): "))
sum = 0
i = 5
if n >= 0 and n % 5 == 0:
    while i <= n:
        sum = sum + i
        i = i +5        
        print(sum)        
else:
    print("Wrong input")
    