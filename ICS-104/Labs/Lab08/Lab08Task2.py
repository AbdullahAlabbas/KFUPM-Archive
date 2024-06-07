def main():
    leapYear = int(input("enter a year number: "))
    valid = isLeapYear(leapYear)
    if valid == True:
        print(leapYear,"is a leap year")
    else:
        print(leapYear,"is not a leap year")





def isLeapYear(year):
    if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
        return True
    else:
        return False
    

if __name__ == "__main__":
    main()