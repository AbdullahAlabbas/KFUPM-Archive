def main():
    st = input("Enter string with some capital letters: ")
    isCapital = indexOfCapitalLetters(st)
    if isCapital == "[]":
        print("Your input does not contain any capital letter")
    else:
        print("indices of upper case letters are:", isCapital)




def indexOfCapitalLetters(string):
    name = ""
    for i in range(len(string)):
        if string[i].isupper():
            strI = str(i)
            name += strI + ","
    return "["+  name[:-1] + "]"

if __name__ == "__main__":
    main()