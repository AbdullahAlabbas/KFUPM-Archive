def main():
    list1= [1,2,3,4,0]
    list2= [4,3,1,0,2]
    list3= [1,2,3,4]
    lst = compare(list1,list2)
    if lst == True:
        print("list1 and list2 have the same elements")
    else:
        print("list1 and list2 do not have the same elements")
    lst = compare(list1,list3)
    if lst == True:
        print("list1 and list3 have the same elements")
    else:
        print("list1 and list3 do not have the same elements")       
    
def compare(l1,l2):
    if len(l1) == len(l2):
        for i in l1:
            if i in l2:
                return True
            else:
                return False
            
if __name__ == "__main__": # This line is optinal مو معانا في المنهج
    main()
    
    