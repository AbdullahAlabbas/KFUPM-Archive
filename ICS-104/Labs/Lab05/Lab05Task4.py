oneChar = input("Enter one character: ").lower()
vowels = "aeiou"
if len(oneChar) == 1:
    if oneChar in vowels:
        print("Vowel")
    elif not oneChar.isalpha():
        print("That was neither a vowel nor a consonant.")
    else:
        print("Constant.")
else:
    print("That input didn't have a valid length.")