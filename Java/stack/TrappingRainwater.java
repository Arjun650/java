import java.util.Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,5}; 

        int[] prefix = findPrefix(heights); 
        int[] suffix = findSuffix(heights); 
         int total = 0;

        for (int i = 0; i < heights.length; i++) {
            int water = Math.min(prefix[i], suffix[i]) - heights[i];
            if (water > 0) {
                total += water;
            }
        }
        System.out.println(total); // Output: 9


        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));

    }

    public static int[] findPrefix(int[] arr){
        int[] res = new int[arr.length]; 
        res[0] = arr[0]; 
        int max = arr[0]; 
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i]; 
            }
            res[i] = max; 
        }

        return res; 
    }

    public static int[] findSuffix(int[] arr){
        int[] res = new int[arr.length]; 
        res[arr.length - 1] = arr[arr.length - 1]; 
        int max = res[arr.length - 1]; 
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > max ){
                max = arr[i]; 
            }
            res[i] = max; 
        }

        return res; 
    }
}
