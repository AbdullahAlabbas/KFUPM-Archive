txtFile = open("numbers.txt","r")

dictionary = {}

for i in range(10):
    for letter in txtFile:
        for j in letter:
            if j.isdigit():
                if j in dictionary:
                    dictionary[j] +=1
                else:
                    dictionary[j] = 1
                    
print("dictionary containing frequency of digits:")
print(dictionary)

