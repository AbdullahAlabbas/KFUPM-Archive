from random import randint
vowels = "aeiou"
constants='bcdfghjklmnpqrstvwxyz'

for i in range(4):
    randomConstant = randint(0,20)
    randomVowels = randint(0,4)
    print(constants[randomConstant] + vowels[randomVowels] , end = "")
