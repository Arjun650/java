import java.util.Arrays;
import java.util.Stack;

public class CircularNextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; 
        Stack<Integer> st = new Stack<>(); 

        int[] res = new int[arr.length]; 

        for(int i = (arr.length * 2) - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i % arr.length]){
                st.pop(); 
            }

            int nge = st.isEmpty()? -1 : st.peek(); 
            st.push(arr[i % arr.length]); 
            res[i % arr.length] = nge; 

        }

        System.out.println(Arrays.toString(res));
    }
}
