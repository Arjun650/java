import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String in = "AB-DE+F*/"; 
        char[] inp = in.toCharArray(); 

        Stack<String> st = new Stack<>(); 

        int i = 0;

        while( i < in.length()){
            if(Character.isLetterOrDigit(inp[i])){
                st.push(inp[i] + ""); 
            }
            else{
                String sec = st.pop(); 
                String fir = st.pop(); 

                st.push("(" + fir + inp[i] + sec + ")"); 
            }
            i++; 

        }

        System.out.println(st.pop());
    }


}
