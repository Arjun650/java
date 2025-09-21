import java.util.*;

public class PrintSubSequenceWithSumK {
    public static void PrintSubSequence(int[] arr, int len, int ind, int targetSum, List<Integer> resArr){
        if(ind >= len){
            int sum = findSum(resArr);
            if(sum == targetSum){
                System.out.println(resArr);
            }
            return; 
        }

        resArr.add(arr[ind]); 
        PrintSubSequence(arr, len, ind + 1, targetSum, resArr);
        resArr.remove(resArr.size() - 1); 
        PrintSubSequence(arr, len, ind + 1, targetSum, resArr);
    }

    public static int findSum(List<Integer> resArr){
        int sum = 0; 

        for(int i = 0; i < resArr.size(); i++){
            sum += resArr.get(i); 
        }

        return sum; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; 

        int targetSum = 2; 

        List<Integer> resArr = new ArrayList<>(); 

        PrintSubSequence(arr, arr.length, 0, targetSum, resArr); 
        
    }
}
