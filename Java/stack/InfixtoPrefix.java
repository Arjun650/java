import java.util.Stack;

public class InfixtoPrefix {
    public static void main(String[] args) {
        String inp = "x+y*z/w+u";
        String in = reverse(inp);

        String ans = postfix(in);

        System.out.println(reverse(ans));
    }

    public static int getPriority(Character ch) {
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

    public static String postfix(String in) {
        StringBuilder res = new StringBuilder();

        Stack<Character> st = new Stack<>();

        int i = 0;
        char[] inp = in.toCharArray();

        while (i < inp.length) {
            char ch = inp[i];

            if (Character.isLetterOrDigit(ch)) {
                res.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && getPriority(ch) < getPriority(st.peek()))
                    res.append(st.pop());

                st.push(ch);
            }
            i++;
        }

        // pop remaining operators
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }

    public static String reverse(String inp) {
        int i = 0;
        int j = inp.length() - 1;

        char[] in = inp.toCharArray();

        while (i < j) {
            char temp = in[i];
            in[i] = in[j];
            in[j] = temp;
            i++;
            j--;
        }

        for (i = 0; i < in.length; i++) {
            if (in[i] == '(') {
                in[i] = ')';
            }

            else if (in[i] == ')') {
                in[i] = '(';
            }
        }

        return new String(in);
    }
}
