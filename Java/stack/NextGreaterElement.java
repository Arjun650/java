import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2}; 
        int[] res = new int[arr.length]; 

        Stack<Integer> st = new Stack<>(); 

        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop(); 
            }

            int nge = st.isEmpty()? -1: st.peek(); 
            res[i] = nge; 
            st.push(arr[i]); 
        }


        System.out.println(Arrays.toString(res));
    }
}
