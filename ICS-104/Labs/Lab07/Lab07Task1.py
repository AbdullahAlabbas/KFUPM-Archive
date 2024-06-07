alphabet='abcdefghijklmnopqrstuvwxyz'
numberOfLines = int(input("Enter number of lines to generate: "))
dash = "-" * 10
index = numberOfLines
if numberOfLines >= 1 and numberOfLines <=26:
    for i in range(numberOfLines):
        for j in range(numberOfLines):
            print(alphabet[j], end = ",")
        print()
    print(dash)

    for i in range(numberOfLines):
        for j in range(i + 1):
            print(alphabet[j] , end = ",")
        print()
    print(dash)


    for i in range(numberOfLines):
        for j in range(numberOfLines - i):
            print(alphabet[index - j- 1 ] , end = ",")      
            index -=1
        print()
    print(dash)
    
        


else:
    print("wrong input: lines must be between 1 and 26")
