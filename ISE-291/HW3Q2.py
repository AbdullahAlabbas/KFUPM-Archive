
def main():
    filename = 'LetterGrades.txt'
    letter_frequencies = calculate_letter_frequencies(filename)

    display_letter_frequencies(letter_frequencies)

def calculate_letter_frequencies(filename):
    letter_counts = {}
    
    # Open the file for reading
    with open(filename, 'r') as file:
        for line in file:
            # Remove leading/trailing whitespace and convert to uppercase
            letter = line.strip().upper()
            
            # Increment the count for the letter
            if letter in letter_counts:
                letter_counts[letter] += 1
            else:
                letter_counts[letter] = 1
    
    return letter_counts


def display_letter_frequencies(letter_counts):
    print("grade   frequency")
    
    grades = ["A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"]

    for grade in grades:
        count = letter_counts.get(grade, 0)
        print(grade + ' ' * (7 - len(grade)) + str(count))


main()