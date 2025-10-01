import java.util.HashMap;
import java.util.Map;

public class BinarySubarrayWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1}; 
        int goal = 2; 
        int num = 0; 
        Map<Integer, Integer> map = new HashMap<>(); 
        int prefix = 0; 
        map.put(0, 1); 
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i]; 

            if(map.containsKey(prefix - goal)){
                num += map.get(prefix - goal); 
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1); 


        }

        System.out.println(num);

    }
}
