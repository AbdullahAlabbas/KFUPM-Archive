from math import sqrt # i can use from math import * but because it is only one function i used sqrt
area = float(input("Enter the area of a rectangle in square cm: "))
length = float(input("Enter the length of the rectangle in cm: "))
width = area / length 
perimeter = (length + width) * 2
diagonal = sqrt(length ** 2 + width**2) / 2.54 
print ("Perimeter = ","%.2f" %  perimeter , "cm", "Diagonal = ", "%.2f" % diagonal , "inches" )