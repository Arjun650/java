public class aggressiveCows{
    public static boolean isPossible(int[] arr, int noOfCows, int dis){
        int curr = arr[0]; 
        noOfCows -= 1; 
        int i = 1; 
        while(i < arr.length){
            if(noOfCows == 0){
                break; 
            }
            if((arr[i] - curr) >= dis){
                noOfCows--; 
                curr = arr[i]; 
            }
            i++; 
        }

        if(noOfCows != 0){
            return false; 
        } 

        return true; 
    }
    public static void main(String[] args) {
        int arr[] = {4,2,1,3,6}; 
        int k = 2; 
        int min = 1; 
        int max = arr[arr.length - 1] - arr[0];
        int i = min;  
        for(i = min ; i <= max; i++){
            boolean res = isPossible(arr, k, i); 
            if(res == false){
                break; 
            }
        }
        System.out.println(i- 1); 
    }
}