import java.util.*;

class bfs {
    private int V; // Number of vertices
    private int adjMatrix[][]; // Adjacency Matrix

    // Constructor
    bfs(int v) {
        V = v;
        adjMatrix = new int[v][v];
        for (int i = 0; i < v; ++i)
            for (int j = 0; j < v; ++j)
                adjMatrix[i][j] = 0; // Initialize all elements to 0 (no edge)
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adjMatrix[v][w] = 1; // Add an edge from v to w
    }

    // Function to perform BFS traversal
    void BFS(int startVertex) {
        // Array to keep track of visited vertices
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false; // Mark all vertices as not visited
        }

        // Queue for BFS traversal
        Queue<Integer> queue = new LinkedList<>();

        // Mark the start vertex as visited and enqueue it
        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("BFS Traversal starting from vertex " + startVertex + ":");

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Visit all adjacent vertices of the current vertex
            for (int i = 0; i < V; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    visited[i] = true; // Mark the vertex as visited
                    queue.add(i); // Enqueue the vertex
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        bfs g = new bfs(V);

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        System.out.println("Enter the edges (source and destination):");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            g.addEdge(src, dest);
        }

        System.out.print("Enter the starting vertex for BFS: ");
        int startVertex = scanner.nextInt();

        System.out.println("\nBFS Traversal:");
        g.BFS(startVertex);

        scanner.close();
    }
}