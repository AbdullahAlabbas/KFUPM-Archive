package Lab01;
import java.util.Random;
public abstract class Student 
{
    private int id;
    private double gpa;

    public Student(int id , double gpa)
    {
        this.id = id;
        this.gpa = gpa;
    }

    // geters because the are private
    public int getId() { return id; }
    public double getGpa() { return gpa; }


    
    public abstract String getStatus(); // will be implemented in the subclasses

    public String displayStudents()
    {
        return "ID>> " + getId() + " GPA>> " + getGpa() + " Status>> " + getStatus();
    }
} // end of Student class

class Graduate extends Student
{
    
    public Graduate(int id , double gpa)
    {
        super(id, gpa);
    }

    @Override
    public String getStatus()
    {
        if (getGpa() >= 3.0) return "good"; // if gpa greater than or equal 3.0 the status will be good
        else return "probation";
    }
} // end of Graduate class


class Undergraduate  extends Student
{
    
    public Undergraduate (int id , double gpa)
    {
        super(id, gpa);
    }

    @Override
    public String getStatus() // if gpa greater than or equal 3.0 the status will be honor or gpa grater than or equal 2.0 the status will be good otherwise probation
    {
        if (getGpa() >= 3.0) return "honor";
        else if(getGpa() >= 2.0) return "good";
        else return "probation";
    }
} // end of Undergraduate class


class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int Id = rand.nextInt(300000) + 20200000; // these numbers to match the kfupm id
            double Gpa = rand.nextDouble() * 4.0; // gpa out of 4

            Student student; // will be Undergraduate or Graduate 
            if (rand.nextBoolean()) {
                student = new Undergraduate(Id, Gpa);
            } else {
                student = new Graduate(Id, Gpa);
            }

            System.out.printf("%s ID>> %d GPA>> %.2f Status>> %s%n", student.getClass().getSimpleName(), student.getId(), student.getGpa(), student.getStatus());

            System.out.println(); 
        }
    }
}
