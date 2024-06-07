def main(): # it is not necessary to define a main function 
    valid = True 
    
    while valid:     # forever loop until we change valid to False (line 13)
        vanilla = input("Enter the array as string or Empty string to exit: ")
        if vanilla != "": # input validation
            array = vanillaArray(vanilla) # call the function
            if array.count(array[1]) == len(array[1:-1]): # we check if the times that the number repeated is equal to the length of the input without{}
                print("The string contains a valid vanilla array.")
            else:
                print("The string does not contain a valid or a vanilla array")
        else:
            valid = False #when the user press enter
        
def vanillaArray(vanilla): # define a function that removes the unwanted things from the input 
    vanilla = vanilla.replace(" ","") # to remove the white spaces  
    vanilla = vanilla.replace(",","") # to remove the commas  
    vanilla = vanilla.replace("-","") # to remove the negative
    return vanilla
        
main()