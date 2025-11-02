import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {10, 22,12,3, 0, 6}; 

        List<Integer> res = new ArrayList<>(); 
        res.add(arr[arr.length - 1]); 

        for(int i = arr.length - 2; i >= 0; i--){
            boolean flag = true; 
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    flag = false; 
                    break; 
                }
            }

            if(flag){
                res.add(arr[i]); 
            }
        }

        int size = res.size(); 
        int[] result = new int[size]; 
        Collections.reverse(res);
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i); 
        }

        System.out.println(res);


        
    }
}
