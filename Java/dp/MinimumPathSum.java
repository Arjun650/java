import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] mn = {{1,2,3}, {4,5,6}}; 

        List<Integer> lst = new ArrayList<>(); 
        int m = mn.length; 
        int n = mn[0].length; 
        int res = findMinimum(m - 1, n - 1, lst, 0, mn); 

        System.out.println(Collections.min(lst));
        
    }

    public static int findMinimum(int m, int n, List<Integer> lst, int sum, int[][] path){
        if(m == 0 && n == 0){
            lst.add(sum + path[0][0]); 
            return 1; 
        }
        if(m < 0 || n < 0){
            return 0; 
        }

        int up = findMinimum(m - 1, n, lst, sum + path[m][n], path); 
        int right = findMinimum(m, n - 1, lst, sum + path[m][n], path); 


        return up + right; 
    }
}
