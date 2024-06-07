change = int(input("Enter amount of change in SAR: "))

changeOf100RiyalBills = change  // 100
numberOf100RiyalBills = print("Number of 100 Riyal bills = " , changeOf100RiyalBills )

changeOf20RiyalBills = change % 100 // 20
numberOf20RiyalBills = print("Number of 20 Riyal bills = " , changeOf20RiyalBills )

changeOf5RiyalBills = change % 100 % 20  // 5
numberOf5RiyalBills = print("Number of 5 Riyal bills = " , changeOf5RiyalBills )

changeOf1RiyalBills =  change % 100 % 20 % 5
numberof1RiyalBills = print("Number of 1 Riyal bills = " , changeOf1RiyalBills )

totalBills = changeOf100RiyalBills + changeOf20RiyalBills + changeOf5RiyalBills + changeOf1RiyalBills

minimumNumberOfBills = print("The minimum number of bills is: " , totalBills )
