public class minimumDaysForMBouquets{
    public static boolean canBouquetBeMade(int[] arr, int day, int m, int k){
        int noOfBouquet = 0; 
        int count = 0; 

        for(int i = 0; i< arr.length; i++){
            if(arr[i] <= day){
                count++; 
            }
            else{
                noOfBouquet += (count / k); 
                count = 0; 
            }
        }
        noOfBouquet += (count / k); 

        return noOfBouquet >= m ? true: false; 
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 13, 11, 12, 7}; 
        int m = 2, k = 3; 
        int minimumDays = Integer.MAX_VALUE; 

        int max = Integer.MIN_VALUE; 
        for(int val: arr){
            max = Math.max(val, max); 
        }

        for(int i = 1; i <= max; i++){
            if(canBouquetBeMade(arr, i, m, k) == true){
                minimumDays = Math.min(i, minimumDays); 
            }
        }

        System.out.println("Minimum Days " + minimumDays); 

    }
}