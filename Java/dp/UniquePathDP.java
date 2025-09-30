import java.util.Arrays;

public class UniquePathDP {
        public static void main(String[] args) {
            int m = 3;
            int n = 7;
            int[][] dp = new int[m][n]; 
            for(int[] a: dp){
                Arrays.fill(a, -1); 
            }
            System.out.println(findUniquepath(m - 1, n - 1, dp));
        }

        public static int findUniquepath(int m, int n, int[][] dp) {
            if (m == 0 && n == 0) {
                return 1;
            }
            if (m < 0 || n < 0) {
                return 0;
            }
            if(dp[m][n] != -1){
                return dp[m][n];
            }

            int up = findUniquepath(m - 1, n, dp);
            int left = findUniquepath(m, n - 1, dp);

            return dp[m][n] =  left + up;
        }
    }

