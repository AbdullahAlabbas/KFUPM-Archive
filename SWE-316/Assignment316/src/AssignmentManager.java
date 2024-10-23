
import java.util.*;

public class AssignmentManager {
    private List<Student> students;
    private List<Task> tasks;

    public AssignmentManager() {
        students = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public boolean checkTaskCompletion(String taskId) {
        for (Task task : tasks) {
            if (task.getTaskId().equals(taskId) && task.isTaskCompleted()) {
                return true;
            }
        }
        return false;
    }

    public boolean assignTask(Student student, Task task) {
        if (student != null && task != null) {
            tasks.add(task);  
            return true;
        }
        return false;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void runTaskMatching(DataManager dataManager, String studentsCsvPath, String tasksCsvPath, String outputCsvPath) {
        List<Student> students = dataManager.readStudents(studentsCsvPath);
        List<Task> tasks = dataManager.readTasks(tasksCsvPath);
    
        List<String> assignments = new ArrayList<>();
        Set<String> assignedStudents = new HashSet<>();
    
        for (Task task : tasks) {
            boolean taskAssigned = false;
    
            for (Student student : students) {
                if (!assignedStudents.contains(student.getStudentID()) && student.getCategory().equals("Category II")) {
                    assignTask(student, task);
                    assignments.add(student.getStudentID() + "," + task.getTaskId());
                    assignedStudents.add(student.getStudentID());  // Mark the student as assigned
                    taskAssigned = true;
                    break;
                }
            }
    
            if (!taskAssigned) {
                for (Student student : students) {
                    if (!assignedStudents.contains(student.getStudentID()) && student.getCategory().equals("Category I")) {
                        assignTask(student, task);
                        assignments.add(student.getStudentID() + "," + task.getTaskId());
                        assignedStudents.add(student.getStudentID());  
                        break;
                    }
                }
            }
        }
    
        dataManager.writeAssignments(outputCsvPath, assignments);
        System.out.println("Task matching process completed and results are saved to " + outputCsvPath);
    }
    
    
    

    public void markTaskAsCompleted(String studentID, String assignedTasksCsvPath, String completedTasksCsvPath, Scanner scanner) {
        DataManager dataManager = new DataManager();
        List<String[]> assignedTasks = dataManager.readAssignedTasks(assignedTasksCsvPath);

        String taskID = assignedTasks.stream()
                                     .filter(t -> t[0].equals(studentID))
                                     .findFirst()
                                     .map(t -> t[1])
                                     .orElse(null);

        if (taskID == null) {
            System.out.println("No task currently assigned to student ID: " + studentID);
            return;
        }

        
        

        System.out.println("Student " + studentID + " is assigned to Task " + taskID);
        System.out.print("Enter completion details (e.g., 'Completed', 'Graded'): ");
        String completionDetails = scanner.nextLine();

        dataManager.writeCompletionDetails(completedTasksCsvPath, studentID, taskID, completionDetails);
        System.out.println("Task " + taskID + " marked as completed for student " + studentID);
    }
}

