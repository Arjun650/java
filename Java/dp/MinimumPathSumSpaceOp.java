public class MinimumPathSumSpaceOp {
    public static void main(String[] args) {
        int[][] mn = {{1,2,3}, {4,5,6}}; 
        int m = mn.length;
        int n = mn[0].length;

        int res = findMinimum(m - 1, n - 1, mn);
        System.out.println(res);
    }

    public static int findMinimum(int m, int n, int[][] mn){

        if(m == 0 && n == 0) return mn[m][n]; 
        if(m < 0 || n < 0) return Integer.MAX_VALUE; 


        int up = findMinimum(m - 1, n, mn); 
        int down = findMinimum(m, n - 1, mn); 

        return mn[m][n] + Math.min(up, down); 

    }
}
