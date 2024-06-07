currentTemperature = float(input("Enter current temperature: "))
unitOfTemp = input("Enter it's unit C or F : ").casefold() # or .lower()
fehrenheit = (9/5) * currentTemperature + 32
celsius =  (currentTemperature - 32) * (5/9)

if unitOfTemp == "c":
    print(round(fehrenheit,2) , "F")
elif unitOfTemp == "f":
    print(round(celsius , "C"))
else:
    print("Wrong unit")        