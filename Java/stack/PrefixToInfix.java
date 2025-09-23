import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String in = "*+PQ-MN"; 

        Stack<String> st = new Stack<>(); 

        char[] inp = in.toCharArray(); 

        int i = in.length() - 1; 

        while(i >= 0){
            if(Character.isLetterOrDigit(inp[i])){
                st.push(inp[i] + ""); 
            }
            else{
                String fir = st.pop(); 
                String sec = st.pop(); 

                st.push("(" + fir + inp[i] + sec + ")"); 
            }
            i--; 
        }
        System.out.println(st.pop());
    }
}
