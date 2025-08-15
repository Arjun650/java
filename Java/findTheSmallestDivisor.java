import java.util.*; 
public class findTheSmallestDivisor {

public static int isDivisionPossible(int[] arr, int divisor, int threshold) {
    int divCount = 0; 
    for(int i = 0; i < arr.length; i++){
        double val = (double) arr[i] / divisor; 
        divCount += Math.ceil(val); 
    }   
    return divCount; 
}

    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1}; 
        int threshold = 5; 
        int ans = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]); 
        }
        int low = 1; 
        int high = max; 

        while(low <= high){
            int mid = (low + high) / 2; 
            int divCount = isDivisionPossible(arr, mid, threshold); 

            if(divCount <= threshold){
                ans = Math.min(ans, mid); 
                high = mid - 1; 
            }
            else if(divCount > threshold){
                low = mid + 1; 
            }
            
        }
        System.out.println(ans); 

    }
}
