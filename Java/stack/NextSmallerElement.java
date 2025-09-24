import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25}; 
        Stack<Integer> st = new Stack<>(); 
        int[] res =new int[arr.length]; 
        //traversing array in reverse
        for(int i = arr.length -1; i>=0;i--){
            //removing the stack's top until the stack is empty or the top is less than the current element
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop(); 
            }
            // finding next greater element as top if st is not empty else -1
            int nse = st.isEmpty()? -1: st.peek(); 
            res[i] = nse; 
            st.push(arr[i]); 
        }

        System.out.println(Arrays.toString(res));

    }
}
