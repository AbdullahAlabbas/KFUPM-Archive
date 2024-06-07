def main():
    initial_list = [3, 2, 4, 1, 9, 5, 8, 6, 7]
    process_list(initial_list)



def process_list(lst):
    sorted_lst = lst[:]
    sorted_lst.sort()
    print(lst)
    
    # Continue the process until the list is sorted
    while lst != sorted_lst:
        new_lst = []
        
        # Subtract 1 from each element and add to new list if > 1
        for num in lst:
            if num > 1:
                new_lst.append(num - 1)
        
        # Add 9 to the end of the new list
        new_lst.append(9)
        
        # Update the list with the new list
        lst = new_lst
        
        print(lst)


main()