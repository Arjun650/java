import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubSequence {

    public static void findAllSubSequence(int ind, int[] arr, List<Integer> resArr, int len){
        if(ind >= len){
            System.out.println(resArr);
            return; 
        }

        resArr.add(arr[ind]); 
        findAllSubSequence(ind + 1, arr, resArr, len);
        resArr.remove(resArr.size() - 1); 
        findAllSubSequence(ind + 1, arr, resArr, len);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2}; 
        int n = arr.length; 
        List<Integer> resArr = new ArrayList<>(); 

        findAllSubSequence(0, arr, resArr, n); 
        
    }
}
