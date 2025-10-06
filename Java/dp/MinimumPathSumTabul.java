import java.util.Arrays;

public class MinimumPathSumTabul {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}; 

        int m = arr.length; 
        int n = arr[0].length; 
        int[][] dp = new int[m][n]; 

        // Fill DP table
        int minSum = findMinimumSum(arr, dp);
        System.out.println(minSum);
    }

    public static int findMinimumSum(int[][] arr, int[][] dp){
        int m = arr.length, n = arr[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0){
                    dp[i][j] = arr[i][j]; // first row same as input
                } else {
                    int st = arr[i][j] + dp[i - 1][j]; // straight down
                    int ld = (j > 0) ? arr[i][j] + dp[i - 1][j - 1] : Integer.MAX_VALUE; // left diagonal
                    int rd = (j < n - 1) ? arr[i][j] + dp[i - 1][j + 1] : Integer.MAX_VALUE; // right diagonal

                    dp[i][j] = Math.min(st, Math.min(ld, rd));
                }
            }
        }

        // answer = min of last row
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++){
            min = Math.min(min, dp[m - 1][j]);
        }

        return min; 
    }
}
