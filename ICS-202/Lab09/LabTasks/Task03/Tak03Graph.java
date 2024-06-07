package Lab09.LabTasks.Task03;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
// Determines if a vertex is reachable from another vertex in a directed graph
public class Tak03Graph {
    private List<List<Integer>> adjList = null;
    private int numVertices;
 
    public Tak03Graph(List<Edge> edges, int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>();
 
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
 
        // add edges to the directed graph
        for (Edge edge: edges){
            int src = edge.source;
            int dest = edge.dest;
 
            adjList.get(src).add(dest);
        }
    }
  
    private boolean isReachableDFS(int src, int dest, boolean[] visited) {
        // Mark the current vertex as visited
        visited[src] = true;

        // If the destination vertex is reached, return true
        if (src == dest) {
            return true;
        }

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjList.get(src)) {
            if (!visited[neighbor]) {
                // If the neighbor is not visited, recursively call isReachableDFS
                if (isReachableDFS(neighbor, dest, visited)) {
                    return true;
                }
            }
        }

        return false; // If destination vertex is not reachable from src
    }

    // Public method to initiate the DFS traversal from src to dest
    public boolean isReachable(int src, int dest) {
        boolean[] visited = new boolean[numVertices];
        return isReachableDFS(src, dest, visited);
    }
}