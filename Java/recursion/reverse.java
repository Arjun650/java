
import java.util.Arrays;

public class reverse {

    public void rev(int[] arr, int st, int en){
        if(st < en){
            swap(arr, st, en); 

            rev(arr, st + 1, en - 1); 
        }
    }

    public void swap(int[] arr, int st, int en){
        int temp = arr[st]; 
        arr[st] = arr[en]; 
        arr[en] = temp; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; 
        reverse st = new reverse(); 
        st.rev(arr, 0 , arr.length - 1); 
        System.err.println(Arrays.toString(arr));
    }
}
