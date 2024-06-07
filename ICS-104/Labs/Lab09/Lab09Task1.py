def main():
    lst = list(range(2,101))   # or lst = []\n  for i in lst: \n \t lst.append(i)
    
    for newList in range(2,6):       
        newList = removing(lst,newList)
    print(newList)

def removing(lst , n):
    for j in lst:
        if j % n == 0 and j / n != 1:
            lst.remove(j)
    return lst

if __name__ == "__main__": 
    main()
    
    