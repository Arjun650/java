
import java.util.ArrayList;
import java.util.List;

class subset{
    public static List<List<Integer>> findSubset(int[] nums){
        int subset = 1 << nums.length; 
        List<List<Integer>> res = new ArrayList<>(); 

        for(int num = 0; num < subset; num++){
            List<Integer> lis = new ArrayList<>(); 

            for(int i = 0; i < nums.length; i++){
                if((num & (1 << i)) != 0){
                    lis.add(nums[i]); 
                }
            }

            res.add(lis); 
        }
        return res; 
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4}; 

        List<List<Integer>> ans = findSubset(nums); 
        System.err.println(ans);
    }
}