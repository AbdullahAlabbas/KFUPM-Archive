import java.io.*;
import java.util.*;

public class DataManager {

    // Method to read students from the CSV file
    public List<Student> readStudents(String studentsCsvPath) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader studentsReader = new BufferedReader(new FileReader(studentsCsvPath))) {
            String line;
            studentsReader.readLine();  // Skip header

            while ((line = studentsReader.readLine()) != null) {
                String[] values = line.split(",");
                String studentID = values[1].trim();
                String name = values[2].trim();
                String email = values[10].trim();
                String category = values[7].trim();
                double cgpa = Double.parseDouble(values[8].trim());
                int activeTerms = Integer.parseInt(values[9].trim());

                Student student = new Student(studentID, name, email, category, cgpa, activeTerms);
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading students: " + e.getMessage());
        }

        return students;
    }

    // Method to read tasks from the CSV file
    public List<Task> readTasks(String tasksCsvPath) {
        List<Task> tasks = new ArrayList<>();

        try (BufferedReader tasksReader = new BufferedReader(new FileReader(tasksCsvPath))) {
            String line;
            tasksReader.readLine();  // Skip header

            while ((line = tasksReader.readLine()) != null) {
                String[] values = line.split(",");
                String taskID = values[0].trim();
                String taskType = values[3].trim();  // Grading or Teaching
                String description = values[4].trim();

                Task task;
                if (taskType.equalsIgnoreCase("Grading")) {
                    task = new GradingTask(taskID, description, 5);  // Example: 5 papers to grade
                } else {
                    task = new TeachingTask(taskID, description, 2);  // Example: 2 sessions to teach
                }

                tasks.add(task);
            }
        } catch (IOException e) {
            System.out.println("Error reading tasks: " + e.getMessage());
        }

        return tasks;
    }

    // Method to write task assignments to the CSV file
    public void writeAssignments(String outputCsvPath, List<String> assignments) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputCsvPath))) {
            writer.write("StudentID,TaskID\n");
            for (String assignment : assignments) {
                writer.write(assignment + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing assignments: " + e.getMessage());
        }
    }

    public List<String[]> readAssignedTasks(String assignedTasksCsvPath) {
        List<String[]> assignedTasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(assignedTasksCsvPath))) {
            String line;
            reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                assignedTasks.add(new String[]{values[0].trim(), values[1].trim()});
            }
        } catch (IOException e) {
            System.out.println("Error reading assigned tasks: " + e.getMessage());
        }
        return assignedTasks;
    }

    // Method to write completion details to the CSV file
    public void writeCompletionDetails(String completedTasksCsvPath, String studentID, String taskID, String completionDetails) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(completedTasksCsvPath, true))) {
            writer.append(studentID).append(",").append(taskID).append(",").append(completionDetails).append("\n");
        } catch (IOException e) {
            System.out.println("Error writing completion details: " + e.getMessage());
        }
    }
}


