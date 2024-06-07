firstLetter = input("Enter starting letter: ").lower()
alphabet='abcdefghijklmnopqrstuvwxyz'
idx = 0
if len(firstLetter) == 1 and firstLetter.isalpha():
    step = int(input("Enter step: "))
    if step != 0 :
        for i in alphabet:
            if i == firstLetter:
                print(alphabet[idx::step])
            else:
                idx +=1
    else:
        print("Step cannot be 0")
    
else:
    print("You must enter one letter")
    
