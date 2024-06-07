package Lab09.LabTasks.Task02;
public class Task02GraphDriver {
    public static void main(String[] args) {
        String[] labels = {"A", "B", "C", "D", "E"};

        Task02Graph g = new Task02Graph(5, labels);

        g.addDirectedEdge(1, 0);
        g.addDirectedEdge(0, 2);
        g.addDirectedEdge(2, 1);
        g.addDirectedEdge(0, 3);
        g.addDirectedEdge(1, 4);

        System.out.println("The directed graph is:  ");
        g.displayGraph();

        Task02Graph g2 = new Task02Graph(5, labels);

        g2.addUndirectedEdge(1, 0);
        g2.addUndirectedEdge(0, 2);
        g2.addUndirectedEdge(2, 1);
        g2.addUndirectedEdge(0, 3);
        g2.addUndirectedEdge(1, 4);

        System.out.println("The undirected graph is:  ");
        g2.displayGraph();
    }
}
