public class twosum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 11}; 
        int target = 14; 
        int left = 0; 
        int right = arr.length - 1; 
        int sum = 0; 
        while(left < arr.length){
            sum = arr[left] + arr[right]; 
            
            if(sum == target){
                System.out.println("True");
                System.err.println(left + " " + right);
                break; 
            }

            if(sum > target){
                right--;  
            }

            if(sum < target){
                left++; 
            }
        }
    }
}
