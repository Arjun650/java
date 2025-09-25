import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringWithoutConsecutive1s {
    public static void main(String[] args) {
        int n = 3; 
        List<String> res = new ArrayList<>(); 

        generateString(res, 0, "", n, 0); 

        System.out.println(res);
    }
    public static void generateString(List<String> res, int ind, String result, int len, int cur ){
        if(ind == len){
            res.add(new String(result)); 
            return; 
        }

        generateString(res, ind + 1, result + "0", len, 0);
        
        if(cur != 1){
            generateString(res, ind + 1, result + "1", len, 1);
        }
        
    }
}
