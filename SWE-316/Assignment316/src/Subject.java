/**
 * This class follows the Single Responsibility Principle by being responsible only 
 * for handling the subject's name and the student's proficiency level. It does not manage 
 * other aspects loke tasks or like students.
 * 
 * Encapsulation is applied here as the subject details (name and proficiency level) 
 * are private and can only be accessed or modified via public methods.
 */
public class Subject {

    
    private String subjectName;       
    private String proficiencyLevel;    


    public Subject(String subjectName, String proficiencyLevel) {
        this.subjectName = subjectName;
        this.proficiencyLevel = proficiencyLevel;
    }


    public String getSubjectName() {return subjectName;}


    public String getProficiencyLevel() {return proficiencyLevel;}

    /**
     * This method follows encapsulation allowing controlled modification
     * of the proficiency level while keeping the attribute private.
     */
    public void updateProficiency(String proficiencyLevel) {this.proficiencyLevel = proficiencyLevel;}
}
