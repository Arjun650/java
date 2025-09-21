import java.util.Arrays;

public class FrogWithKDist {
    public static int findMinEn(int[] heights, int k, int idx, int[] dp) {
        if (idx == 0) return 0;

        int minSteps = Integer.MAX_VALUE;
        if(dp[idx] != -1){
            return dp[idx]; 
        }
        for (int j = 1; j <= k; j++) {
            if (idx - j >= 0) {
                int jump = findMinEn(heights, k, idx - j, dp) + Math.abs(heights[idx] - heights[idx - j]);
                minSteps = Math.min(minSteps, jump);
            }
        }
        dp[idx] = minSteps; 
        return minSteps;
    }

    public static void main(String[] args) {
        int[] height = { 10, 5, 20, 0, 15 };
        int k = 2;
        int[] dp = new int[height.length + 1]; 
        Arrays.fill(dp, -1); 
        // last index is length - 1
        System.out.println(findMinEn(height, k, height.length - 1, dp));
    }
}
