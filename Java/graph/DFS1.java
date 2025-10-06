import java.util.*;

class DFS1 {
    private int vertices; // number of vertices
    private LinkedList<Integer>[] adjList; // adjacency list

    // Constructor
    DFS1(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (for directed graph; uncomment the second line for undirected)
    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // Uncomment for undirected graph
    }

    // DFS helper function
    void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal from a given starting node
    void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(start, visited);
    }

    public static void main(String[] args) {
        DFS1 g = new DFS1(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("DFS starting from node 0:");
        g.DFS(0);
    }
}
