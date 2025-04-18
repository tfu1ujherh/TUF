import java.util.*;

class Graph {
    private int V; // Number of vertices
    private int adjMatrix[][]; // Adjacency Matrix

    // Constructor
    Graph(int v) {
        V = v;
        adjMatrix = new int[v][v];
        for (int i = 0; i < v; ++i)
            for (int j = 0; j < v; ++j)
                adjMatrix[i][j] = 0; // Initialize all elements to 0
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adjMatrix[v][w] = 1; // Add an edge from v to w
        adjMatrix[w][v] = 1; // For undirected graph, add an edge from w to v as well
    }

    // Function to print the graph
    void printGraph() {
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

        Graph g = new Graph(V);

        System.out.println("Enter the edges (source and destination):");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            g.addEdge(src, dest);
        }

        System.out.println("\nAdjacency Matrix Representation:");
        g.printGraph();

        scanner.close();
    }
}