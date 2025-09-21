import java.util.ArrayList;
import java.util.List;

public class PrintSubSequenceWithSumK2 {
    public static void printSubSequenceWithSumK(int[] arr, int len, int ind, int targetSum, List<Integer> resArr, int curSum){
        if(ind >= len){
            if(curSum == targetSum ){
                System.out.println(resArr);
            }
            return; 
        }
        resArr.add(arr[ind]);
        curSum += arr[ind];  
        printSubSequenceWithSumK(arr, len, ind + 1, targetSum, resArr, curSum);
        resArr.remove(resArr.size() - 1); 
        curSum -= arr[ind]; 
        printSubSequenceWithSumK(arr, len, ind + 1, targetSum, resArr, curSum);
    }  
    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; 
        int n = arr.length; 
        int targetSum = 2; 
        List<Integer> resArr = new ArrayList<>(); 
        printSubSequenceWithSumK(arr, arr.length, 0, targetSum, resArr, 0 ); 
    }
}
