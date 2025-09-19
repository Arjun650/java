import java.util.ArrayList;
import java.util.*; 

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  

        double n = Math.pow(2, nums.length); 
        n = (int) n; 

        List<List<Integer>> result = new ArrayList<>(); 

        for(int i = 0; i < n; i++){
            List<Integer> tempArr = new ArrayList<>(); 

            for(int j = 0; j <= nums.length; j++){
                if((i & (1 << j)) > 0){
                    tempArr.add(nums[j]); 
                }
            }
            result.add(tempArr); 
        }

        System.out.println(result); 

    }
}
