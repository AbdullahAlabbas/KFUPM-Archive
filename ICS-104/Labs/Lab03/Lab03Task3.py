firstName = input("What is your first name: ").lower() # i can use the casefold() function instead of lower()
dateOfBirth = int(input("What is your date of birth: "))
newDateOfBirth = dateOfBirth * 2
password = print(firstName + firstName[-1].upper() + firstName[0].upper() + "$" + str(newDateOfBirth))