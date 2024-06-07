sideA = int(input("Enter side a: "))
sideB = int(input("Enter side b: "))
sideC = int(input("Enter side c: "))

if sideA > 0 and sideB > 0 and sideC > 0:
    if sideA + sideB > sideC and  sideB + sideC > sideA and sideC + sideA >sideB:
        if sideA == sideB and sideB == sideC:
            print("equilateral")
        elif sideA == sideB and sideB != sideC:
            print("This is an Isosceles triangle")
        elif sideA == sideC and sideA != sideB:
            print("This is an Isosceles triangle")
        elif sideB == sideC and sideB != sideA:
            print("This is an Isosceles triangle")
        else:
            print("This is a triangle")
    else:
        print("This is not a triangle")
else:
    print("Sides must be positive")
    
    
    