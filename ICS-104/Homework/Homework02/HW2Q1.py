text = input("Enter text: ").lower() # i can also make it .upper()
newText = "" # the text that will generate from line 5 to 9 and it will contain only alphabets
sumOfLetters = "" # the number of letter in a text 

if text != "": # input validation
    for letter in text:
        if letter.isalpha(): # line 6 to 8 is to remove anything that is not a letter
            newText += letter 
            
if len(newText) != 0: # input validation
    while newText !="": # forever loop until the user press enter
        letterCounter = newText.count(newText[0]) # count how many did the letter in position 0 repeat
        sumOfLetters += newText[0]+":"+str(letterCounter) + "," # add it to the sum
        newText = newText.replace(newText[0],"") # remove the letter that we just count
    print("The count of letters in text is: "+"["+sumOfLetters[:-1] + "]") # print the result
else:
    print("your text does not contain any letter")