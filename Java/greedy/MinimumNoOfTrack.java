public class MinimumNoOfTrack{
    public static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800}; 
        int[] dep = {920, 1130, 1150, 1200, 1900, 2000}; 


        int platforms = 1; 
        int result = 1; 
        int i = 1; 
        int j = 0; 
        int n = arr.length; 

        while(i < n && j < n ){
            if(arr[i] <= dep[j]){
                platforms++; 
                i++; 
            }
            else{
                platforms--; 
                j++; 
            }
            result = Math.max(result, platforms); 
        }

        System.out.println(result);
    }
}