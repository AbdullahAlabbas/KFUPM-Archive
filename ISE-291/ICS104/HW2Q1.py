word = input("Enter a word: ")  
n = len(word) 

# Outer loop controls the length of the substring
# It starts from length 1 and goes up to the length of the word
for length in range(1, n + 1):
    # Inner loop generates substrings of the current length
    for i in range(n - length + 1):
        # Extract the substring from the original word
        substring = word[i:i + length]
        print(substring)
