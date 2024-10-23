import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssignmentManager assignmentManager = new AssignmentManager();
        DataManager dataManager = new DataManager();
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\n--- Welcome to the Graduate Task Assignment System ---");
            System.out.println("1. Run Automated Task Matching");
            System.out.println("2. Mark a Task as Completed");
            System.out.println("3. Exit");
            System.out.print("Please select an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Paths for CSV files (adjust as necessary)
                    String studentsCsvPath = "/Users/abdullah/Desktop/Assignment316/src/data/sheet1_studentsInfo.csv";
                    String tasksCsvPath = "/Users/abdullah/Desktop/Assignment316/src/data/sheet3_taskOpenings.csv";
                    String outputCsvPath = "/Users/abdullah/Desktop/Assignment316/src/data/sheet4_assignedTasks.csv";
                    assignmentManager.runTaskMatching(dataManager, studentsCsvPath, tasksCsvPath, outputCsvPath);
                    break;
                case 2:
                    System.out.print("Enter your student ID: ");
                    String studentID = scanner.nextLine();
                    String assignedTasksCsvPath = "/Users/abdullah/Desktop/Assignment316/src/data/sheet4_assignedTasks.csv";
                    String completedTasksCsvPath = "/Users/abdullah/Desktop/Assignment316/src/data/sheet5_completedTasks.csv";
                    assignmentManager.markTaskAsCompleted(studentID, assignedTasksCsvPath, completedTasksCsvPath, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}
