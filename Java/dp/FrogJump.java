import java.util.Arrays;

public class FrogJump {

    public static int findMinimumEnergy(int n, int[] stairs, int[] dp) {
        if (n == 0)
            return 0;
        int left = Integer.MAX_VALUE;
        if (dp[n - 1] != -1) {
            left = dp[n - 1] + Math.abs(stairs[n] - stairs[n - 1]);
        } else {
            left = findMinimumEnergy(n - 1, stairs, dp) + Math.abs(stairs[n] - stairs[n - 1]);
        }

        int right = Integer.MAX_VALUE;

        if (n > 1) {
            if (dp[n - 2] != -1) {

                right = dp[n - 2] + Math.abs(stairs[n] - stairs[n - 2]);
            } else {
                right = findMinimumEnergy(n - 2, stairs, dp) + Math.abs(stairs[n] - stairs[n - 2]);
            }
        }

        return dp[n] = Math.min(left, right);
    }

    public static void main(String[] args) {
        int[] stairs = { 30, 10, 60, 10, 60, 50 };
        int n = stairs.length;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int res = findMinimumEnergy(n - 1, stairs, dp);
        System.out.println(res); // should print 40
    }
}
