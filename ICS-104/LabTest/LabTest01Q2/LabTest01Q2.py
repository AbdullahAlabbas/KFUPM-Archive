st = input("Enter a string: ")
newSt = ""
index = -1

for i in range(len(st)):
    newSt = newSt + st[index]
    index -=1
if newSt == st:
    print("The reversed string is",newSt, "and it is palindrome")
else:
    print("The revesed string is", newSt," and it is not a palindrome")
    
    