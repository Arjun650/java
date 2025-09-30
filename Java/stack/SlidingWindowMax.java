import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMax {
    public static void main(String[] args) {

        int[] nums = {1};
        int k = 1;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            for(int j = i; j < i+k; j++) {
                max = Math.max(max, nums[j]);
            }
            res.add(max); 
        }

        System.out.println(res);
    }
}
