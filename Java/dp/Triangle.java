public class Triangle {
    public static void main(String[] args) {
        int[][] arr = {{1}, {2, 3}, {3, 6, 7}, {8, 9, 6, 10}}; 
        int[][] dp = new int[arr.length][arr.length]; 

        System.out.println(findMinimum(0, 0, dp, arr));
    }

    public static int findMinimum(int i, int j, int[][] dp, int[][] arr){
        if(i == arr.length - 1){
            dp[i][j] =  Math.min(arr[i][j] , arr[i][j + 1]); 
        }

        for(int k = 0; k < arr.length; k++){
            for(int l = k; l < arr[k].length; l++){
                if(i == arr.length - 1){
                    dp[i][j] = Math.min(arr[i][j], arr[i][j + 1]); 
                }

                
            }
        }


    }
}
