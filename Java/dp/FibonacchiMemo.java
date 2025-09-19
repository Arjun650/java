package dp;

public class FibonacchiMemo {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        int val = findFibb(n, dp);
        System.out.println(val);
    }

    public static int findFibb(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = findFibb(n - 1, dp) + findFibb(n - 2, dp);
        return dp[n];
    }
}
