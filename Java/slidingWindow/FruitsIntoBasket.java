import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] trees = {1, 2, 1}; 

        int l = 0; 
        int r = 0; 
        int n = trees.length; 
        Map<Integer, Integer> map = new HashMap<>(); 
        int maxLen = 0; 

        while(r < n){
            map.put(trees[r], map.getOrDefault(trees[r], 0) + 1); 

            while(map.size() > 2){
                map.put(trees[l], map.get(trees[l]) - 1); 

                if(map.get(trees[l]) == 0){
                    map.remove(trees[l]); 
                }
                l++; 
            }
            maxLen = Math.max(maxLen, r - l + 1); 

            r++; 
        }

        System.out.println(maxLen);
    }    
}
