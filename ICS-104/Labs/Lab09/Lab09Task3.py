
lst = []

def main():
    x = int(input("Enter a positive integer value: "))
    factors = intValue(x) 
    if len(lst) == 0:
        print("%d is a prime number"% x)
    else:
        print("The factors of %d exculding 1 and %d are:"% (x,x))
        print(factors)
    
def intValue(n):
    global lst 
    for i in range(2,n):
        if n % i == 0:      
            lst.append(i)
    return lst
    
    

if __name__ =="__main__": # This line is optinal  مو معانا في المنهج
    main()
    
    
    
    
#--------------------------طريقة ثانية-------------------------------------------------------
    
# def main():
#     x = int(input("Enter a positive integer value: "))
#     factors = intValue(x) 
#     if factors == False:
#         print("%d is a prime number"% x)
#     else:
#         print("The factors of %d exculding 1 and %d are:"% (x,x))
#         print(factors)
    
# def intValue(n):
#     lst = [] 
#     for i in range(2,n):
#         if n % i == 0:      
#             lst.append(i)
#     if len(lst) == 0:
#         return False
#     else:
#         return lst
    
    
    

# if __name__ =="__main__": # This line is optinal  مو معانا في المنهج
#     main()
