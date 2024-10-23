/**
 * Student class encapsulates the details of a graduate student, including their ID, name, 
 * category, GPA and active terms. This class follows the Single Responsibility Principle
 * by only handling the student's information, without dealing with task assignments.
 * 
 * The use of encapsulation ensures that sensitive information, like CGPA and active terms, 
 * is kept private and only accessible through controlled methods if needed in the future.
 */
public class Student {
    private String studentID;   // Unique identifier for the student
    private String name;        // Student's full name
    private String email;       // Student's email address
    private String category;    // Student's category (e.g., Category I, Category II)
    private double cgpa;        //  GPA of the student
    private int activeTerms;    // Number of active terms the student has completed

    /**
     * Constructor for the Student class.
     * This constructor follows the Single Responsibility Principle*by only
     * focusing on initializing student information and leaving task management
     * to a different class.
     */
    public Student(String studentID, String name, String email, String category, double cgpa, int activeTerms) 
    {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.category = category;
        this.cgpa = cgpa;
        this.activeTerms = activeTerms;
    }


    public String getCategory() {return this.category;}
    public String getStudentID() {return this.studentID;}
    public String getName() {return this.name;}
}
