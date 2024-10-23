import java.util.ArrayList;
import java.util.List;

/**
 * This class follows to the Single Responsibility Principle by focusing only on 
 * managing course related data and tasks and leaving other responsibilities to different classes.
 */
public class Course {

    private String courseCode;        
    private String courseName;         
    private List<Task> relatedTasks;  


    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.relatedTasks = new ArrayList<>(); 
    }


    public void addTask(Task task) {relatedTasks.add(task);}
    public List<Task> getTasks() {return relatedTasks;}
    public String getCourseCode() {return courseCode;}
    public void setCourseCode(String courseCode) {this.courseCode = courseCode;}
    public String getCourseName() { return courseName;}
    public void setCourseName(String courseName) {this.courseName = courseName;}
}
