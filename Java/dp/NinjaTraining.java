import java.util.Arrays;

public class NinjaTraining {

    public static int findMax(int[][] arr, int day, int lastDay, int[][] dp) {
        int maxi = 0;
        if (day == 0) {
            for (int i = 0; i <= 2; i++) {
                if (i != lastDay) {
                    maxi = Math.max(maxi, arr[0][i]);
                }
            }
            return maxi;
        }
        if (dp[day][lastDay] != -1) {
            return dp[day][lastDay];
        }
        for (int i = 0; i <= 2; i++) {
            if (i != lastDay) {
                int points = arr[day][i] + findMax(arr, day - 1, i, dp);
                maxi = Math.max(maxi, points);
            }
        }
        return dp[day][lastDay] = maxi;
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 40, 70 }, { 20, 50, 80 }, { 30, 60, 90 } };
        int[][] dp = new int[arr.length][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int profit = findMax(arr, arr.length - 1, 3, dp);
        System.out.println(profit);
    }
}
