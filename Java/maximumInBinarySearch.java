public class maximumInBinarySearch {
    public static void main(String[] args){
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6}; 

        int low = 0; 
        int high = arr.length - 1; 
        int ans = Integer.MIN_VALUE; 

        while(low <= high){
            int mid = (low + high)/2; 

            if(arr[low] < arr[mid]){
                ans = Math.max(ans, arr[mid]); 
                low = mid + 1; 
            }
            else{
                ans = Math.max(ans, arr[low]); 
                high = mid - 1; 
            }
        }

        System.out.println(ans);
    }
}
