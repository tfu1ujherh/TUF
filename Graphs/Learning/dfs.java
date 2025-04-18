import java.util.*;

class dfs {
    private int V; // Number of vertices
    private int adjMatrix[][]; // Adjacency Matrix

    // Constructor
    dfs(int v) {
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

    void print(){
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(adjMatrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    // Function to perform DFS traversal using a stack
    void DFS(int startVertex) {
        // Array to keep track of visited vertices
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false; // Mark all vertices as not visited
        }

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the start vertex onto the stack
        stack.push(startVertex);

        System.out.println("DFS Traversal starting from vertex " + startVertex + ":");

        while (!stack.isEmpty()) {
            // Pop a vertex from the stack
            int currentVertex = stack.pop();

            // If the vertex has not been visited, process it
            if (!visited[currentVertex]) {
                // Mark the vertex as visited and print it
                visited[currentVertex] = true;
                System.out.print(currentVertex + " ");

                // Push all adjacent vertices of the current vertex onto the stack
                // (Push in reverse order to match recursive DFS behavior)
                for (int i = V - 1; i >= 0; i--) {
                    if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        dfs g = new dfs(V);

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        System.out.println("Enter the edges (source and destination):");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            g.addEdge(src, dest);
        }
        g.print();

        System.out.print("Enter the starting vertex for DFS: ");
        int startVertex = scanner.nextInt();

        System.out.println("\nDFS Traversal (using stack):");
        g.DFS(startVertex);

        scanner.close();
    }
}