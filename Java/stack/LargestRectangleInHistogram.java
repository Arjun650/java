import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3}; 
        int maxArea = 0; 
        int n = arr.length; 

        Stack<Integer> st = new Stack<>(); 
        st.push(arr[0]); 

        for(int i = 0; i <= arr.length; i++){
            while(!st.isEmpty() && (i == n || arr[st.peek()] >= arr[i] )){
                int height = arr[st.pop()]; 
                int width; 
                if(st.isEmpty()){
                    width = i; 
                }
                else{
                    width = i - st.peek() - 1; 
                }
                maxArea = Math.max(maxArea, width * height); 
            }
            st.push(i); 
        }

        System.out.println(maxArea);
    }
}
