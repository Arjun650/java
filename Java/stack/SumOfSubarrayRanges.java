public class SumOfSubarrayRanges {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; 

        int total = 0; 

        for(int i = 0; i < arr.length; i++){
            int min = arr[i];  // reset for each subarray
            int max = arr[i];  // reset for each subarray

            for(int j = i; j < arr.length; j++){
                min = Math.min(arr[j], min); 
                max = Math.max(arr[j], max); 

                total += (max - min); 
            }
        }

        System.out.println(total); // output: 5
    }
}
