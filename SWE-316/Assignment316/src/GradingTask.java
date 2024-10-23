/** 
 * The class follows the Single Responsibility Principle focusing only on grading 
 * tasks, and uses polymorphism by providing its own implementation of the abstract method 
 * isTaskCompleted() from the Task class
 */
public class GradingTask extends Task {

    private int numOfPapers;       
    private double averageGrade;  


    public GradingTask(String taskId, String description, int numOfPapers) {
        super(taskId, description);   
        this.numOfPapers = numOfPapers;
        this.averageGrade = 0.0;       // Initial value, since no papers have been graded yet
    }


    public void calculateAverageGrade(double totalGrade) {
        if (numOfPapers > 0) {
            this.averageGrade = totalGrade / numOfPapers;
        } else {
            this.averageGrade = 0;  // Avoid division by zero
        }
    }

    /**
     * This is an example of polymorphism, where this method overrides the abstract 
     * method in the Task class to provide a specific implementation for grading tasks.
     */
    @Override
    public boolean isTaskCompleted() {
        return averageGrade > 0;
    }
}
