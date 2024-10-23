/*
 * Represents a student with properties defining their personal and academic details.
 */

 public class Student {
    private String major;
    private String id;
    private String email;
    private String name;
    private String gender;
    private String nationality;
    private String studentType; //   Graduate or Undergraduate
    private String degreeCode; 
    private int activeTerms;
    private double cGpa;
    private Category category;  

    /*
     * Constructs a new Student with detailed academic and personal information.
     *
     *  id The student unique identifier.
     *  name The student full name.
     *  email The student email address.
     *  major The student major field of study.
     *  gender The student gender.
     *  age The student age.
     *  cGpa The student current grade point average.
     *  nationality The student nationality.
     *  studentType The type of student.
     *  degreeCode The code for the student degree program.
     *  activeTerms The number of active academic terms completed by the student.
     *  category The category of the student, affecting payment and responsibilities.
     */

     public Student(String studentID, String name, String email, Category category2, double cgpa, int activeTerms) {}
    // Getters and setters 



    

    public String getDegreeCode() {return degreeCode;}

    public void setDegreeCode(String degreeCode) {this.degreeCode = degreeCode;}

    public int getActiveTerms() {return activeTerms;}

    public void setActiveTerms(int activeTerms) {this.activeTerms = activeTerms;}

    public double getcGpa() {return cGpa;}

    public void setcGpa(double cGpa) {this.cGpa = cGpa;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getMajor() {return major;}

    public void setMajor(String major) {this.major = major;}

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

    public double getCGpa() {return cGpa;}

    public void setCGpa(double cGpa) {this.cGpa = cGpa;}

    public String getNationality() {return nationality;}

    public void setNationality(String nationality) {this.nationality = nationality;}

    public String getStudentType() {return studentType;}

    public void setStudentType(String studentType) {this.studentType = studentType;}

    public Category getCategory() {return category;}

    public void setCategory(Category category) {this.category = category;}
}
