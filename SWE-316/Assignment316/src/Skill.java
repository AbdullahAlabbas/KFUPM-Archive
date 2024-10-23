/**
 * This class follows the Single Responsibility Principle by being responsible only for
 * handling the description of the skill.
 * 
 * The class also ensures encapsulation as the skillDescription attribute is private and can
 * only be accessed and modified through public methods.
 */
public class Skill {

    // Attribute to store the description of the skill 
    private String skillDescription;

    /**
     * Initializes the skill with a specific description. The Single Responsibility Principle is followed
     * by keeping the focus of this class  on managing the description of the skill.
     */
    public Skill(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    /**
     * This method follows the encapsulation principle by allowing modification of the
     * skill description through a controlled method.
     */
    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    /**
     * This method is part of encapsulation as well
     */
    public String getSkillDescription() {
        return skillDescription;
    }
}
