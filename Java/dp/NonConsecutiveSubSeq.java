public class NonConsecutiveSubSeq {
    public static int findMaxProfit(int[] arr, int ind){
        if(ind == arr.length - 1){
            return arr[ind]; 
        }
        if(ind > arr.length - 1){
            return 0; 
        }

        int pick = arr[ind] + findMaxProfit(arr, ind + 2); 
        int nonPick = 0+ findMaxProfit(arr, ind + 1); 


        return Math.max(pick, nonPick); 
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1}; 


        int ans = findMaxProfit(arr, 0); 
        System.out.println(ans);
    }
}
