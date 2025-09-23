public class reverseString {
    public static void main(String[] args) {
        String st = "(A+B)*C-D+F"; 
        char[] inp = st.toCharArray(); 
        int i = 0; 
        int j = st.length() - 1; 

        while(i < j){
            char temp = inp[i]; 
            inp[i] = inp[j]; 
            inp[j] = temp; 
            i++; 
            j--; 
        }

        i = 0; 
        while(i < inp.length){
            if(inp[i] == '('){
                inp[i] = ')'; 
            }
            else if(inp[i] == ')'){
                inp[i] = '('; 
            }
            i++; 
        }

        System.out.println(new String(inp));
    }
}
