def main():
    st = input("Enter a string: ")
    isLetter = getLetters(st)
    if isLetter == "":
        print("The entered string does not contain any letter")
    else:
        print("The letters present in input are:", isLetter)



def getLetters(string):
    up = ""
    for i in string:
        if i.isalpha():
            up += i
    return up


if __name__ == "__main__":
    main()