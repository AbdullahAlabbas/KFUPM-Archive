# Task 3: Finding the Area and Circumference of a Circle
# Assign a value to a radius of a circle, then find and display its area and circumference using the following formulas
# 𝐴𝑟𝑒𝑎=𝑝𝑖∗𝑟𝑎𝑑𝑖𝑢𝑠∗𝑟𝑎𝑑𝑖𝑢𝑠
 
# 𝑐𝑖𝑟𝑐𝑢𝑚𝑓𝑒𝑟𝑒𝑛𝑐𝑒=2∗𝑝𝑖∗𝑟𝑎𝑑𝑖𝑢𝑠
 
# where
# 𝑝𝑖=3.14159

# Defining the constant PI
PI = 3.14159

# Setting the value of the radius
radius = 10.3

# Write your code below this line
area = round(PI * radius * radius, 2)
circumfernce = round(2 * PI * radius, 2)

print("The Area is:", area)
print("The Circumfernce is:", circumfernce)