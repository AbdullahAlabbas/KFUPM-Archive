package Lab08;
import java.util.Arrays;

class Patient implements Comparable<Patient> {
    //  attributes to store patient information.
    private String name;
    private int emergencyLevel;
    private int arrivalOrder;

    // Constructor to create a 'Patient' object with provided values.
    public Patient(String name, int emergencyLevel, int arrivalOrder) {
        this.name = name;
        this.emergencyLevel = emergencyLevel;
        this.arrivalOrder = arrivalOrder;
    }

    // Getter method to retrieve the emergency level of the patient.
    public int getEmergencyLevel() {
        return emergencyLevel;
    }

    // Getter method to retrieve the arrival order of the patient.
    public int getArrivalOrder() {
        return arrivalOrder;
    }

    // Implementation of the 'compareTo' method required by the 'Comparable' interface.
    @Override
    public int compareTo(Patient other) {
        // Compare patients based on emergency level.
        if (this.emergencyLevel != other.emergencyLevel) {
            return Integer.compare(this.emergencyLevel, other.emergencyLevel);
        } else {
            // If emergency levels are equal, compare based on arrival order.
            return Integer.compare(this.arrivalOrder, other.arrivalOrder);
        }
    }

    // Customized string representation of a 'Patient' object.
    @Override
    public String toString() {
        return "Name: " + name + ", Emergency Level: " + emergencyLevel + ", Arrival Order: " + arrivalOrder;
    }


    public static void main(String[] args) {
        // Create an array of patients based on the original order.
        Patient[] patients = {
            new Patient("Ali", 4, 1),
            new Patient("Saleem", 4, 2),
            new Patient("Jamaal", 1, 3),
            new Patient("Thamer", 5, 4),
            new Patient("Muhsin", 4, 5),
            new Patient("Said", 3, 6),
            new Patient("Qasim", 5, 7),
            new Patient("Maryam", 4, 8),
            new Patient("Ramadhan", 1, 9),
            new Patient("Zainab", 1, 10)
        };

        // Sort the patients array to match the treatment order.
        Arrays.sort(patients);

        // Print the sorted order of patients.
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
