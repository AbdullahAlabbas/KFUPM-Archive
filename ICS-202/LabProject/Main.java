import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary;

        System.out.println("┌───────────────────────────────┐");
        System.out.println("│     Dictionary Application    │");
        System.out.println("└───────────────────────────────┘");
        System.out.println("1 to initialize a dictionary with 1 word.");
        System.out.println("2 to initialize a dictionary from a text file.");
        System.out.println("3 to initialize an empty dictionary:");
        System.out.println("┌───────────────────────────────┐");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a word: ");
            String word = scanner.next();
            dictionary = new Dictionary(word);
        } else if (choice == 2) {
            System.out.print("Enter file name: ");
            String fileName = scanner.next();
            dictionary = new Dictionary(new File(fileName));
            System.out.println("dictionary loaded successfully.");
        } else {
            dictionary = new Dictionary();
        }

        int userChoice = -1;
        while (userChoice != 0) {
            System.out.println("┌───────────────────────────────┐");
            System.out.println("│         Menu Options          │");
            System.out.println("└───────────────────────────────┘");
            System.out.println("1: Add word");
            System.out.println("2: Delete word");
            System.out.println("3: Find word");
            System.out.println("4: Find similar");
            System.out.println("5: Save dictionary");
            System.out.println("0: Exit");
            System.out.println("┌───────────────────────────────┐");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter a word to add: ");
                    String wordToAdd = scanner.next();
                    dictionary.addWord(wordToAdd);
                    System.out.println("word added successfully.");
                    break;
                case 2:
                    System.out.print("Enter a word to delete: ");
                    String wordToDelete = scanner.next();
                    dictionary.deleteWord(wordToDelete);
                    break;
                case 3:
                    System.out.print("Enter a word to check if it's in the dictionary: ");
                    String wordToFind = scanner.next();
                    if (dictionary.findWord(wordToFind)) {
                        System.out.println("The word is in the dictionary");
                    } else {
                        System.out.println("The word is not in the dictionary");
                    }
                    break;
                    

            case 4:
                System.out.print("Enter a word to find similar words:");
                scanner.nextLine();  
                String word = scanner.nextLine();
                dictionary.findsimilar(word);
                break;


                case 5:
                    System.out.print("Enter the name of the text file to save: ");
                    String fileToSave = scanner.next();
                    dictionary.saveDictionary(fileToSave);
                    break;
            }
        }
        
        scanner.close();
    }
}
