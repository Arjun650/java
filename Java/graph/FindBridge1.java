import java.util.*;

public class FindBridge1 {

    static int time = 0;

    static void dfs(int u, boolean[] visited, int[] disc, int[] low,
                    List<List<Integer>> adj, List<int[]> bridges) {
        visited[u] = true;
        disc[u] = low[u] = ++time;

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(v, visited, disc, low, adj, bridges);

                // Update low value
                low[u] = Math.min(low[u], low[v]);

                // Bridge condition
                if (low[v] > disc[u]) {
                    bridges.add(new int[]{u, v});
                }
            } else {
                // Update low value for back edge
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
        List<int[]> bridges = new ArrayList<>();

        // Run DFS on all components
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                dfs(i, visited, disc, low, adj, bridges);
        }

        // Sum the maintenance cost of all bridges
        int res = 0;
        for (int[] bridge : bridges) {
            int u = bridge[0], v = bridge[1];
            res += cost[u] + cost[v]; // cost for both endpoints
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
