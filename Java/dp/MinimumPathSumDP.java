import java.util.Arrays;

public class MinimumPathSumDP {
    public static void main(String[] args) {
        int[][] mn = {{1,2,3}, {4,5,6}}; 
        int m = mn.length;
        int n = mn[0].length;
        int[][] dp = new int[m][n]; 
        for(int[] arr: dp){
            Arrays.fill(arr, -1); 
        }
        int res = findMinimum(m - 1, n - 1, mn, dp);
        System.out.println(res);
    }

    public static int findMinimum(int m, int n, int[][] mn, int[][] dp){

        if(m == 0 && n == 0) return mn[m][n]; 
        if(m < 0 || n < 0) return Integer.MAX_VALUE; 

        if(dp[m][n] != -1){
            return dp[m][n]; 
        }


        int up = findMinimum(m - 1, n, mn, dp); 
        int down = findMinimum(m, n - 1, mn, dp); 

        return dp[m][n] =  mn[m][n] + Math.min(up, down); 

    }
}
