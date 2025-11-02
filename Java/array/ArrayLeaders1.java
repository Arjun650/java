import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders1 {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6}; 
        List<Integer> res = new ArrayList<>(); 
        int max = arr[arr.length - 1];
        res.add(max); 

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] >= max){
                res.add(arr[i]); 
                max = arr[i]; // no need for Math.max since arr[i] >= max
            }
        }

        Collections.reverse(res);
        System.out.println(res);
    }
}
