package Lab09.LabTasks.Task01;
public class Task01GraphDriver {
    public static void main(String[] args) {
        // Create an undirected graph with 4 vertices
        Tak01Graph graph = new Tak01Graph(4);

        // Add the correct edges to the graph to match the wanted output
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        // Display the graph before deleting any edges
        System.out.println("Before deleting edge 2---3, the graph is:\n");
        graph.displayGraph();

        // Delete the edge between vertices 2 and 3
        graph.removeEdge(2, 3);

        // Display the graph after deleting the edge
        System.out.println("\nAfter deleting edge 2---3, the graph is:\n");
        graph.displayGraph();
    }
}
