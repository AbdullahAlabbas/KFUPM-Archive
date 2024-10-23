import java.util.List;

/**
 * This class fillows to the Single Responsibility Principle by focusing on teaching 
 * tasks and uses polymorphism to implement the method isTaskCompleted() from the Task class.
 */
public class TeachingTask extends Task {

    private int numOfSessions;              
    private List<Integer> studentsPerSession; 


    public TeachingTask(String taskId, String description, int numOfSessions) {
        super(taskId, description);    
        this.numOfSessions = numOfSessions;
    }

    /**
     * this method follows follows the principle of encapsulation as the studentsPerSession list is accessed 
     * and modified through this controlled method.
     */
    public int calculateTotalAttendance() {
        if (studentsPerSession != null) {   
            return studentsPerSession.stream().mapToInt(Integer::intValue).sum();
        }
        return 0; 
    }

    @Override
    public boolean isTaskCompleted() {return calculateTotalAttendance() > 0;}

    public void setStudentsPerSession(List<Integer> studentsPerSession) {this.studentsPerSession = studentsPerSession;}
}
