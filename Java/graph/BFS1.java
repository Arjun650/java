import java.util.*;

public class BFS1 {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    BFS1(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (for directed graph, remove one line if undirected)
    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        // For undirected graph, uncomment the following line:
        adjList[dest].add(src);
    }

    // BFS traversal from a given source node
    void BFS(int start) {
        boolean[] visited = new boolean[vertices]; // Track visited nodes
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            // Explore neighbors
            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS1 g = new BFS1(6); // Example: 6 nodes (0 to 5)

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("BFS starting from node 0:");
        g.BFS(0);
    }
}
