package Lab09.LabTasks.Task01;
public class Tak01Graph {
      private boolean adjacencyMatrix[][];
      private int numberOfVertices;

      public Tak01Graph(int numberOfVertices) {
            this.numberOfVertices = numberOfVertices;
            adjacencyMatrix = new boolean[numberOfVertices][numberOfVertices];
      }

      public void addEdge(int i, int j) {
            adjacencyMatrix[i][j] = true;
            adjacencyMatrix[j][i] = true; // For undirected graph
        }
        

        public void removeEdge(int i, int j) {
            adjacencyMatrix[i][j] = false;
            adjacencyMatrix[j][i] = false; // For undirected graph
        }
        

        public boolean isEdge(int i, int j) {
            return adjacencyMatrix[i][j];
        }
        
      
      public void displayGraph(){
        System.out.printf("%10s", " ");
        for(int i = 0; i < numberOfVertices; i++)
          System.out.printf("%10s", i);
          System.out.println();
        for(int i = 0; i < numberOfVertices; i++){
          System.out.printf("%10s", i);
          for(int j = 0; j < numberOfVertices; j++){
            System.out.printf("%10s", adjacencyMatrix[i][j]);
           }
           System.out.println();
       }
       
   }
 }
