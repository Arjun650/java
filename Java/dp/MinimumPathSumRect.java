class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length; 
        int minSum = (int)Math.pow(10, 6); 
        int[][] dp = new int[m][n]; 


        for (int j = 0; j < n; j++) {
            for(int[] arr: dp){
                Arrays.fill(arr, -1); 
            }
            minSum = Math.min(minSum, findMinimumSum(m - 1, j, matrix, dp)); 
        }

        return minSum; 
    }

    public int findMinimumSum(int i, int j, int[][] matrix, int[][] dp) {
        if (j < 0 || j >= matrix[0].length) return (int)Math.pow(10, 6);
        if (i == 0) return matrix[0][j];
        if(dp[i][j] != -1) return dp[i][j]; 
        int st = matrix[i][j] + findMinimumSum(i - 1, j, matrix, dp); 
        int ld = matrix[i][j] + findMinimumSum(i - 1, j - 1, matrix, dp); 
        int rd = matrix[i][j] + findMinimumSum(i - 1, j + 1, matrix, dp); 

        return dp[i][j] =  Math.min(st, Math.min(ld, rd)); 
    }
}
