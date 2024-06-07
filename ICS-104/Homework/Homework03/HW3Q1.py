#i will use camelCase
phoneSerial = []
phoneBrand = []
phoneModel = []   # i made them global variables because i will use them in the main function and the tabularFormat function.
phoneColor = []
phoneMemory = []


def main():
    
    global phoneSerial
    global phoneBrand
    global phoneModel   # line 2 to 6.
    global phoneColor
    global phoneMemory
    
    
    addPhones() # its role is to interact with the user to read the phone information see line 73 for more information,
    
    while True: # until i use break
        
        userMenu() #print the user menu see line 66 for more information.
        
        
        userChoice = input("        Enter your choice or \"quit\" to exit: ") # i can use \t but i think this is better
        
        if userChoice == "1" :
            tabularFormat() # print all phone data in a tabular format see line 84 for more information.
            
        elif userChoice == "2": # Print phones information based on the phone serial number.
            serialNumber = input("        Enter the phone serial number:")
            position = 0
            for idx in phoneSerial:
                if serialNumber== idx:
                    header()
                    print("%-12s %-12s %-21s %-21s %-20s" % (phoneSerial[position],phoneBrand[position],phoneModel[position],phoneColor[position],phoneMemory[position])) # i can but line31 to 38 in a function but i think it is not important.
                    break # exit the for loop as soon as the serial number match the idx.
                position+=1 # if not check a second position.
               
            else: # inpur validation .
                print("Device not found.")             
            
        elif userChoice == "3": #Print phones information based on brand.
            position = 0
            brand = input("        Enter The phone brand:")
            
            if brand in phoneBrand: # no need to explain same idea is userChoice == 2 but without the break because i will print more than one if found.
                header()
                for idx in phoneBrand:
                    if idx == brand:
                        print("%-12s %-12s %-21s %-21s %-20s" % (phoneSerial[position],phoneBrand[position],phoneModel[position],phoneColor[position],phoneMemory[position]))
                    position +=1
            else: # input validation.
                print(brand , "brand is not available")
                                                        
    
            
        elif userChoice == "quit":
            break
    
        else : # input validation
            print("        Wrong input\n")
    


def userMenu(): # print the user menu
    print("        **User Menu**")
    print("1 - Print all phones data in a tabular format")
    print("2 - Print phones information based on the phone serial number")
    print("3 - Print phones information based on brand")


def addPhones(): # to interact with the user to read the phone
    csvWords = "" # csv = comma seperated values
    print("To add new phone device enter:")
    phone = input("serial,brand,model,color,memory:")
    txtFile = open("csvWords.txt" , "w")
    while  phone !="":                                                   # my idea in this function is to store all the input in a file to make it easy to compare later.
        csvWords += phone + ","
        phone = input("add another phone or press Enter to finish: ")
    txtFile.write(csvWords)
    txtFile.close()

def tabularFormat(): # print all phone data in a tabular format 
    colors = ["blue", "white" , "grey" , "black" , "red" , "yellow"] # the validation for the phoneColor list.
    position = 0
    
    readingFile = open("csvWords.txt" , "r") # the file that we made before.
    for line in readingFile:
        wordList = line.split(",") # to check it word by word 'csv'.
        for word in wordList:
            if word.isalpha() == False and len(word) == 5: # to add it to phoneSerial list.
                phoneSerial.insert(position,word)
                
            elif word.isalpha() and word.lower() not in colors: # to add it to phoneBrand list.
                phoneBrand.insert(position,word)
                
            elif " " in word: # to add it to phoneModel list.
                phoneModel.insert(position,word)
            
            elif word.lower() in colors: # to add it to the phoneColor list.
                phoneColor.insert(position,word)
                
            elif word.isdigit(): # to add it to the phoneMemory list.
                phoneMemory.insert(position,word)     
                                   
            position +=1
    readingFile.close()
    
    header() # see line 115
    for serial,brand,model,color,memory in zip(phoneSerial,phoneBrand,phoneModel,phoneColor,phoneMemory):
        print("%-12s %-12s %-21s %-21s %-20s" % (serial,brand,model,color,memory))
        
        
def header(): # this is the header :)
    numberOfDashes = 90
    print( "-" * numberOfDashes)
    print("%-12s %-12s %-21s %-21s %-20s" % ("Phone Serial","brand","model","color","memory"))
    print("-" * numberOfDashes)

main() 