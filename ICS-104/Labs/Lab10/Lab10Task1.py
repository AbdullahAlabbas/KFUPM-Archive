
valid = True
while valid:

    try:
        fileName = input("Enter file name with txt extension: ")
        if fileName.endswith(".txt"):
            file = open(fileName, "r")
            print(fileName,"exists in folder")
            valid = False

        else:
            raise TypeError(fileName +" has no .txt extension")

    except FileNotFoundError:
        print(fileName,"does not exist")

    except TypeError as exception:
        print(exception)
        

