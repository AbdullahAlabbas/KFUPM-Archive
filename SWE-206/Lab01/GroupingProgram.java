package Lab01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupingProgram {

    //  FILE NAME
    private static final String FILE_NAME = "studentList.txt";
    // Define the types of the groups
    private static final String[] GROUP_TYPE = {"1", "2"};

    public static void main(String[] args) {

        // Obtaining the type that the user wants
        String groupingType = getUserInput("Enter '1' for groups with a specific number of groups or '2' for groups with a maximum number of members: ", GROUP_TYPE);

        // Taking the number of groups or the maximum number of members depending on the user choice
        int groupLimit = getIntegerInput("Enter " + getGroupTypeDescription(groupingType) + " that you want: ");

        // Calling the method that gets the names from the file
        List<String> names = obtainNamesFromFile(FILE_NAME);

        // Calling the method that creates empty groups
        List<List<String>> groups = createEmptyGroups(groupLimit, names, groupingType);

        // Calling the method that shuffles the groups
        List<List<String>> shuffledGroups = shuffle(new ArrayList<>(groups), names);

        // Calling the method that displays the groups
        displayGroups(shuffledGroups);
    }

    // Function to read the names from a file into a list
    private static List<String> obtainNamesFromFile(String fileName) {
        List<String> names = new ArrayList<>();
        try (BufferedReader inputFile = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = inputFile.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            System.out.println("File not found.");
            throw new RuntimeException(e); // Raise an exception for the calling code to handle
        }
        return names;
    }

    // Function to create empty groups depending on the user choice
    private static List<List<String>> createEmptyGroups(int groupLimit, List<String> names, String groupingType) {
        int numberOfGroups = groupingType.equals("1") ? groupLimit : (int) Math.ceil(names.size() / (double) groupLimit);
        List<List<String>> groups = new ArrayList<>();
        for (int i = 0; i < numberOfGroups; i++) {
            groups.add(new ArrayList<>());
        }
        return groups;
    }

    // Function that shuffles the students into the groups
    private static List<List<String>> shuffle(List<List<String>> groups, List<String> names) {
        Random random = new Random();
        for (String name : names) {
            // Find the index of the group with the lowest number of members
            int lowestNumberOfMembers = groups.stream().mapToInt(List::size).min().orElse(0);
            // Select groups that contain the lowest number of members
            List<Integer> minIndex = new ArrayList<>();
            for (int i = 0; i < groups.size(); i++) {
                if (groups.get(i).size() == lowestNumberOfMembers) {
                    minIndex.add(i);
                }
            }
            // Add a member to a random group from the groups with the lowest number of members
            groups.get(minIndex.get(random.nextInt(minIndex.size()))).add(name);
        }
        return groups;
    }

    // Display the groups in a user-friendly format
    private static void displayGroups(List<List<String>> groups) {
        // Display each group in a row with its members
        for (int i = 0; i < groups.size(); i++) {
            System.out.print("Group " + (i + 1) + " contains: ");
            System.out.println(String.join(", ", groups.get(i)));
        }
    }

    // Helper method to get user input
    private static String getUserInput(String prompt, String[] validOptions) {
        String userInput;
        do {
            System.out.print(prompt);
            userInput = System.console().readLine().trim();
        } while (!isValidInput(userInput, validOptions));
        return userInput;
    }

    // Helper method to get integer input
    private static int getIntegerInput(String prompt) {
        int userInput;
        while (true) {
            try {
                System.out.print(prompt);
                userInput = Integer.parseInt(System.console().readLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        return userInput;
}

    // Helper method to check if input is valid
    private static boolean isValidInput(String input, String[] validOptions) {
        for (String option : validOptions) {
            if (option.equals(input)) {
                return true;
            }
        }
        System.out.println(input + " is not one of the choices");
        return false;
    }

    // Helper method to get the group type description
    private static String getGroupTypeDescription(String groupingType) {
        return (groupingType.equals("1")) ? "number of groups" : "maximum member numbers";
    }
}
