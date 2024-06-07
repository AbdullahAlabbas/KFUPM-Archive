package Lab05;
public class SLL_Driver {
    public static void main(String[] args) {
        SLL<String> myList = new SLL<String>();
        String[] cityNames = {"Dubai", "Cairo", "Istanbul", "Amman", "Beirut"};
        for (int i = 0; i < cityNames.length; i++)
            myList.addToHead(cityNames[i]);

        System.out.println("The list is: " + myList);
        System.out.println("It is " + myList.contains("Istanbul") + " that the list contains Istanbul.");
        System.out.println("It is " + myList.contains("Baghdad") + " that the list contains Baghdad.");
    }
}
