import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LibraryTest {
    @Test
    public void testCalculateFine() {
        // Cases for loanPeriod <= allowedLoanPeriod
        assertEquals(0.00, Library.calculateFine(0, "CS"), 0.001); // Case 9
        assertEquals(0.00, Library.calculateFine(1, "Physics"), 0.001); // Case 10
        assertEquals(0.00, Library.calculateFine(14, "Math"), 0.001); // Case 11
        assertEquals(35.00, Library.calculateFine(15, "Math"), 0.001); // Case 12

        // Cases for loanPeriod > allowedLoanPeriod
        assertEquals(0.00, Library.calculateFine(14, "CS"), 0.001); // Case 13
        assertEquals(0.00, Library.calculateFine(14, "Physics"), 0.001); // Case 14
        assertEquals(35.00, Library.calculateFine(15, "CS"), 0.001); // Case 15
        assertEquals(15.00, Library.calculateFine(15, "Physics"), 0.001); // Case 16
        assertEquals(35.00, Library.calculateFine(15, "Math"), 0.001); // Case 17
        assertEquals(500.00, Library.calculateFine(100, "History"), 0.001); // Case 18
        assertEquals(0.00, Library.calculateFine(28, "CS"), 0.001); // Case 19
        assertEquals(0.00, Library.calculateFine(28, "Physics"), 0.001); // Case 20
    }
}
