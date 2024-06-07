# Question 2: Measuring Distance using 3 p-norm Implementations.
from math import sqrt # for line 21 or i can use **(1/2)
# i will use the camelCase
# i can use an easier way witch is to define a function that ask for x1 , x2 ,y1 , y2 but we did'n take it.
normName = input("Enter desired norm name (infinity, 1-norm, 2-norm): ").lower() # i used the lower method to ignore the user errors

if normName == "1-norm": # i will use the abs function from chapter two
    x1 = float(input("Enter value of coordinate value x1: "))
    y1 = float(input("Enter value of coordinate value y1: "))
    x2 = float(input("Enter value of coordinate value x2: ")) 
    y2 = float(input("Enter value of coordinate value y2: "))

    oneNorm = abs(x1 - x2) + abs(y1 - y2) # i can put the numpers in one abs but i think this way is cleaner
    print("1-norm distance value =" ,"%.1f" %  oneNorm) # i can print it without define the oneNorm function but ithink this way is cleaner

elif normName == "2-norm":
    x1 = float(input("Enter value of coordinate value x1: "))
    y1 = float(input("Enter value of coordinate value y1: "))
    x2 = float(input("Enter value of coordinate value x2: "))
    y2 = float(input("Enter value of coordinate value y2: "))

    twoNorm = sqrt((x1 - x2)**2 + (y1 - y2)**2)  # sqrt function from chapter two
    print("1-norm distance value =" ,"% .2f" % twoNorm)  # i can print it without define the twoNorm but ithink this way is cleaner

elif normName == "infinity": # i will use the max function from chapter two
    x1 = float(input("Enter value of coordinate value x1: "))
    y1 = float(input("Enter value of coordinate value y1: "))
    x2 = float(input("Enter value of coordinate value x2: "))
    y2 = float(input("Enter value of coordinate value y2: "))

    x = abs(x1 - x2)
    y = abs(y1 - y2)
    infinityNorm = max(x , y)
    print("infinity norm distance value = " ,"% .1f" % infinityNorm) 


else:
    print("Error: unknown norm")