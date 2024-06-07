costOfGroceries = float(input("Please enter the cost of your groceries: "))

if costOfGroceries >= 0 and costOfGroceries < 10:
    print("You win a discount coupon of $0.00. (0% of your purchase)")

elif costOfGroceries >= 10 and costOfGroceries <= 60:
    newCost = costOfGroceries * 0.08
    print("You win a discount coupon of $" ,'%.2f' % newCost , "(8% of your purchase)")

elif costOfGroceries > 60 and costOfGroceries <= 150:
    newCost = costOfGroceries * 0.10
    print("You win a discount coupon of $" ,'%.2f' % newCost , "(10% of your purchase)")

elif costOfGroceries > 150 and costOfGroceries < 210:
    newCost = costOfGroceries * 0.12
    print("You win a discount coupon of $" ,'%.2f' % newCost , "(12% of your purchase)")

elif costOfGroceries >= 210:
    newCost = costOfGroceries * 0.14
    print("You win a discount coupon of $" ,'%.2f' % newCost , "(14% of your purchase)")

else:
    print("the cost must be a positive value")