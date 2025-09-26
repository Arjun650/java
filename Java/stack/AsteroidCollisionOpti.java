import java.util.*;

public class AsteroidCollisionOpti {
    public static void main(String[] args) {
        int[] arr = {5, 10, -5}; 
        // int[] arr = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16}; 

        Stack<Integer> st = new Stack<>(); 

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                st.push(arr[i]); 
            } else {
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -arr[i]){
                    st.pop(); 
                }

                if(!st.isEmpty() && st.peek() == -arr[i]){
                    st.pop(); 
                } else if(st.isEmpty() || st.peek() < 0){
                    st.push(arr[i]); 
                }
            }
        }

        // Convert stack to array for printing
        int[] result = new int[st.size()];
        for(int i = result.length - 1; i >= 0; i--){
            result[i] = st.pop();
        }

        System.out.println(Arrays.toString(result));
    }
}
