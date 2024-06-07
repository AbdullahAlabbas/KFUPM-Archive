number = input("Enter a number: ")
sumOfBaseTen = 0 # the sum of the conversion 
operations = "" # the process before the sum for example (1 X 1) + (1 X 2) + (1 X 4) + (1 X 8)
exponent = 0 
index = -1 # i will start from the last index 

if number.isdigit() == True: # input validation
    base = input("Base: ")
    if base.isdigit() == True: # input validation
        if int(max(number)) < int(base): # to make sure that the base is greater than the max number
            for i in range(len (number)):
                sumOfBaseTen += (int(number[index]) * (int(base) ** exponent))  # liine 11 to 15 is to reverse the number
                operations = operations + "(" + str(number[index]) + " X " + str((int(base)**int(exponent)))+ ")" + " + "
                index -=1 
                exponent +=1
            print("Number in base 10:")
            print(operations[:-3] , "=",int(sumOfBaseTen))
        else:
            print("The input number is not a legal number of a base",base)
    else:
        print("Error: the input value is not an integer number")
        
        
        
# line 27 to 35 is same as line 8 to 17 but to deal with the negative sign
elif number[1:].isdigit() and number[0] == "-":
    base = input("Base: ")
    number = number.replace("-" ,"")
    for i in range(len(number)):
        sumOfBaseTen += (-1* int(number[index]) * (int(base) ** exponent) )
        operations = operations + "(" + "-" + str(number[index]) + " X " + str((int(base)**int(exponent)))+ ")" + " + "
        index -=1 
        exponent +=1
    print("Number in base 10:")
    print(operations[:-3], "=",int(sumOfBaseTen))
else:
    print("Error: the input value is not an integer number")
    
    
    
    