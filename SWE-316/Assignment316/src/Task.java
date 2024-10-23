/**
 * Task is an abstract class that represents a generic task with a task ID and description.
 * The use of abstraction here ensures that all tasks share common attributes and methods 
 * while the specific implementation of whether a task is completed or not is left to the subclasses.
 * This follows the Open-Closed Principle as new task types can be added by 
 * extending this class without changing existing code.
 */
public abstract class Task {

    private String taskId;       
    private String description; 


    public Task(String taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }


    public String getTaskId() {return taskId;}
    public void setTaskId(String taskId) {this.taskId = taskId;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    /**
     * This method must be implemented by subclasses of Task, following  
     * Polymorphism where each subclass will provide its own implementation 
     * of how a task is marked as completed.
     */
    public abstract boolean isTaskCompleted();
}
