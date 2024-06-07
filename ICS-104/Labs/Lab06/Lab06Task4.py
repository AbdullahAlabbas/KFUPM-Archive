n = int(input("Enter n ( >=3 ): "))
if n >= 3:
    print("numbers between 1 and 27 divisible by 3 or 5 are:")
    for i in range(3,n+1):
        if i % 3 == 0 or i % 5 == 0:
            print(i,end = " ")
else:
    print( "Wrong input n must be >= 3")

