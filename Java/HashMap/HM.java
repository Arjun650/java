import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        
        
        map.put(5, 6); 
        map.put(6, 7); 
        map.put(7, 8); 
        map.put(8, 9); 


        for(Map.Entry<Integer, Integer> mp: map.entrySet()){
            System.out.print(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
