import java.util.*; 

public class kokoEatingBananas{

    public static int calculateMinimumTime(int[] arr, int h){
        int max = Integer.MIN_VALUE; 
        int maxTime = Integer.MIN_VALUE; 
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]); 
        }
        System.out.println(max);

        for(int i = 1; i <= max; i++){
            int time = 0; 
            for(int j = 0; j < arr.length; j++){
                time += Math.ceil((double) arr[j] / (double) i); 
            }

            if(time <= h){

                maxTime = Math.max(maxTime, time); 
            }

        }

        return maxTime; 
    }


    public static void main(String args[]){
        int[] arr = {30,11,23,4,20}; 
        int h = 5; 

        int res = calculateMinimumTime(arr, h); 
        System.out.println("Minimum Time: " +  res); 

    }
}