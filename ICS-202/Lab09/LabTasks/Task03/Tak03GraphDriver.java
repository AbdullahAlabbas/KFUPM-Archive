package Lab09.LabTasks.Task03;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


public class Tak03GraphDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Edge> edges = Arrays.asList(
                Edge.getEdge(0, 3), Edge.getEdge(1, 0), Edge.getEdge(1, 2),
                Edge.getEdge(1, 4), Edge.getEdge(2, 7), Edge.getEdge(3, 4),
                Edge.getEdge(3, 5), Edge.getEdge(4, 3), Edge.getEdge(4, 6),
                Edge.getEdge(5, 6), Edge.getEdge(6, 7)
        );

        int numVertices = 8;
        Tak03Graph graph = new Tak03Graph(edges, numVertices);

        System.out.print("Enter the source vertex [0 - 7]: ");
        int source = scanner.nextInt();

        System.out.print("Enter the destination vertex [0 - 7]: ");
        int destination = scanner.nextInt();

        if (graph.isReachable(source, destination)) {
            System.out.println("Path exists from vertex " + source + " to vertex " + destination);
        } else {
            System.out.println("No path exists between vertices " + source + " and " + destination);
        }
    }
}
