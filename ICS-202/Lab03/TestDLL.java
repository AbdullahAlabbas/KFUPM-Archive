package Lab03;
import java.util.Random;

public class TestDLL {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();
        Random rand = new Random();

        // Create a list of 10 random integers
        for (int i = 0; i < 10; i++) {
            list.addToTail(rand.nextInt(10));
        }

        // Print and delete iteratively until the list is empty
        try {
            while (!list.isEmpty()) {
                list.printAll();
                list.delete7();
            }
        } catch (NullPointerException e) {
            System.out.println("The list is empty now");
        }
    }
    }