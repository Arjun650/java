
import java.util.Arrays;

class bubble{
    public static void main(String[] args) {
        int[] arr = {18, 9, 13, 18, 20, 8, 1};
        int n = arr.length; 
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n- i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                }
            }
        }

        System.err.println(Arrays.toString(arr));
    }
}