import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String in = "AB-DE+F*/"; 
        int i = 0; 
        char[] inp = in.toCharArray(); 
        Stack<String> st = new Stack<>();
        
        while(i < in.length()){
            if(Character.isLetterOrDigit(inp[i])){
                st.push(inp[i] + ""); 
            }
            else if(!st.isEmpty()){
                String sec = st.pop(); 
                String fir = st.pop(); 

                st.push(inp[i] + fir + sec); 
            }
            i++; 
        }

        System.out.println(st.pop());
    }
}
