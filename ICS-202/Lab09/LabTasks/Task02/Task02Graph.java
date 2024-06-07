package Lab09.LabTasks.Task02;
import java.util.*;

class Task02Graph {
    int numVertices;
    LinkedList<String>[] adjacencyList;
    String[] labels;

    Task02Graph(int numVertices, String[] labels) {
        this.labels = labels;
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < adjacencyList.length; i++)
            adjacencyList[i] = new LinkedList<String>();
    }

    void addDirectedEdge(int v, int w) {
        adjacencyList[v].add(labels[w]);
    }

    void addUndirectedEdge(int v, int w) {
        adjacencyList[v].add(labels[w]);
        adjacencyList[w].add(labels[v]);
    }

    void displayGraph() {
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.println(labels[i] + " ----> " + adjacencyList[i]);
        }
        System.out.println();
    }
}
