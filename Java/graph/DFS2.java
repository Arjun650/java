import java.util.ArrayList;
import java.util.List;

public class DFS2 {
    private int vertices; 
    private List<Integer>[] adjList; 

    public DFS2(int vertices){
        this.vertices = vertices; 
        adjList = new ArrayList[vertices]; 
        for(int i = 0; i < vertices; i++){
            adjList[i] = new ArrayList<>(); 
        }
    }

    public void addEdge(int src, int dest){
        adjList[src].add(dest); 
        adjList[dest].add(src); // for undirected graph
    }

    public void dfs(int node, boolean[] visited){
        visited[node] = true; 
        System.out.println(node);

        for(int neighbor : adjList[node]){
            if(!visited[neighbor]){
                dfs(neighbor, visited); 
            }
        }
    }

    public static void main(String[] args) {
        int numVertices = 6; // corrected
        boolean[] visited = new boolean[numVertices]; 
        DFS2 g = new DFS2(numVertices); 

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        g.dfs(0, visited); 
    }
}
