from random import randint


txtFile = open("numbers.txt","w")

for i in range(10):
    for j in range(10):
        randomNumber = randint(0,200)
        txtFile.write(str(randomNumber)+" ")
    txtFile.write("\n")

txtFile.close()


