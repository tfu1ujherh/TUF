import java.util.*;

class WeightedDirectedGraph {
    private int V; // Number of vertices
    private int adjMatrix[][]; // Adjacency Matrix

    // Constructor
    WeightedDirectedGraph(int v) {
        V = v;
        adjMatrix = new int[v][v];
        for (int i = 0; i < v; ++i)
            for (int j = 0; j < v; ++j)
                adjMatrix[i][j] = 0; // Initialize all elements to 0 (no edge)
    }

    // Function to add a weighted directed edge from v to w
    void addEdge(int v, int w, int weight) {
        adjMatrix[v][w] = weight; // Add an edge from v to w with the given weight
    }

    // Function to print the graph
    void printGraph() {
        System.out.println("Adjacency Matrix Representation (Weighted Directed Graph):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        WeightedDirectedGraph g = new WeightedDirectedGraph(V);

        System.out.println("Enter the edges (source, destination, and weight):");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            int weight = scanner.nextInt();
            g.addEdge(src, dest, weight);
        }

        System.out.println("\nWeighted Directed Graph Representation:");
        g.printGraph();

        scanner.close();
    }
}