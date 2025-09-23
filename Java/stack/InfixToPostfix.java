import java.util.Stack;

public class InfixToPostfix {

    public static int getPriority(Character ch){
        switch (ch) {
            case '+':
            case '-':
                return 1; 
            case '*':
            case '/':
                return 2; 
            case '^':
                return 3; 
            default:
                return 0; 
        }
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)"; 

        StringBuilder res = new StringBuilder(); 
        Stack<Character> st = new Stack<>(); 

        char[] inp = infix.toCharArray(); 
        int i = 0; 

        while(i < inp.length){
            char ch = inp[i];

            if(Character.isLetterOrDigit(ch)){  // operand
                res.append(ch); 
            }
            else if(ch == '('){
                st.push(ch); 
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop(); // remove '('
                }
            }
            else { // operator
                while(!st.isEmpty() && getPriority(ch) <= getPriority(st.peek())){
                    res.append(st.pop()); 
                }
                st.push(ch); 
            }
            i++; // ✅ increment
        }

        // pop remaining operators
        while(!st.isEmpty()){
            res.append(st.pop()); 
        }

        System.out.println("Postfix: " + res.toString());
    }
}
