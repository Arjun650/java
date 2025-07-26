public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1}; 

        int max = 0; 
        int sum = 0; 

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                sum++; 
            } else {
                max = Math.max(max, sum); 
                sum = 0; 
            }
        }

        // Final check in case the last elements are 1s
        max = Math.max(max, sum);

        System.out.println(max);  // use System.out instead of System.err
    }
}
