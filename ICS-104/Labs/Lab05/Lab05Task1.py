currentTemperature = float(input("Enter current temperature: "))
unitOfTemp = input("Enter it's unit C or F : ").casefold() # or .lower()
fehrenheit = (9/5) * currentTemperature + 32
celsius =  (currentTemperature - 32) * (5/9)

if unitOfTemp == "c":
    if currentTemperature <= 0 :
        print(f"at {currentTemperature} C , the water is solid.")
    if currentTemperature > 0 and currentTemperature < 100:
        print(f" at {currentTemperature} C , the water is liquid.")
    if currentTemperature > 100 :
        print(f"at {currentTemperature} C, the water is gaseous.")

elif unitOfTemp == "f":

    if celsius <= 0 :
        print(f"at {currentTemperature} F , the water is solid.")

    if celsius > 0 and celsius < 100:
        print(f" at {currentTemperature} F , the water is liquid.")

    if celsius > 100 :
        print(f"at {currentTemperature} F, the water is gaseous.")
else:
    print("Wrong unit")
    
            