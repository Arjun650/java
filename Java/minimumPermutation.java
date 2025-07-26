import java.util.ArrayList;
import java.util.Collections;

public class minimumPermutation {

    public static int findMinimumPermutation(int val){
        ArrayList<Integer> arr = new ArrayList<>();

        // Extract digits
        while(val > 0){
            arr.add(val % 10);
            val /= 10;
        }

        // Sort digits
        Collections.sort(arr);

        // Fix leading zero issue
        if(arr.get(0) == 0){
            for(int i = 1; i < arr.size(); i++){
                if(arr.get(i) != 0){
                    // Swap first non-zero with first zero
                    int temp = arr.get(i);
                    arr.set(i, 0);
                    arr.set(0, temp);
                    break;
                }
            }
        }

        // Combine digits into a number
        int number = 0;
        for (int digit : arr) {
            number = number * 10 + digit;
        }

        return number;
    }

    public static void main(String[] args) {
        int val = 2209;
        int res = findMinimumPermutation(val);
        System.out.println(res);  // Output: 2029
    }
}
