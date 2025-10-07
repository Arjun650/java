import java.util.*;

public class TestClass {

    static int time = 0;

    static void dfs(int u, boolean[] visited, int[] disc, int[] low, int[] parent,
                    boolean[] isArticulation, List<List<Integer>> adj) {
        visited[u] = true;
        disc[u] = low[u] = ++time;
        int children = 0;

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                parent[v] = u;
                children++;
                dfs(v, visited, disc, low, parent, isArticulation, adj);

                low[u] = Math.min(low[u], low[v]);

                // Case 1: root with 2 or more children
                if (parent[u] == -1 && children > 1)
                    isArticulation[u] = true;

                // Case 2: not root, and child cannot reach ancestor of u
                if (parent[u] != -1 && low[v] >= disc[u])
                    isArticulation[u] = true;

            } else if (v != parent[u]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

    static int findTunnelMaintenanceCost(int[][] arr, int n, int[] cost) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int[] disc = new int[n];
        int[] low = new int[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        boolean[] isArticulation = new boolean[n];

        // Run DFS on all components
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                dfs(i, visited, disc, low, parent, isArticulation, adj);
        }

        // Sum the maintenance cost of all articulation points
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (isArticulation[i])
                res += cost[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];

        // Read adjacency matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // Read maintenance costs
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = input.nextInt();
        }

        System.out.print(findTunnelMaintenanceCost(arr, n, cost));
    }
}